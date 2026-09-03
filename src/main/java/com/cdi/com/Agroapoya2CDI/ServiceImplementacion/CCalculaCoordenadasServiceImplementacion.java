package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CCalculaCoordenadasEntity;
import com.cdi.com.Agroapoya2CDI.Services.CCalculaCoordenadaService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CCalculaCoordenadasServiceImplementacion implements CCalculaCoordenadaService {

    @Value("${google.maps.api.key:}")
    private String apiKey;

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ConsultaCoordenadas(CCalculaCoordenadasEntity entidad) {
        try {
            if (entidad.getDireccion() != null && !entidad.getDireccion().trim().isEmpty()) {
                try {
                    if (apiKey == null || apiKey.trim().isEmpty() || "TU_API_KEY_AQUI".equals(apiKey)) {
                        return JSONObject.quote("ERROR: La API Key de Google Maps no está configurada o es el marcador predeterminado.");
                    }
                    RestTemplate restTemplate = new RestTemplate();
                    String encodedAddress = java.net.URLEncoder.encode(entidad.getDireccion(), "UTF-8");
                    String url = "https://maps.googleapis.com/maps/api/geocode/json?address=" + encodedAddress + "&key=" + apiKey;

                    String responseStr = restTemplate.getForObject(url, String.class);
                    JSONObject responseJson = new JSONObject(responseStr);
                    if ("OK".equals(responseJson.getString("status"))) {
                        org.json.JSONArray results = responseJson.getJSONArray("results");
                        if (results.length() > 0) {
                            JSONObject location = results.getJSONObject(0).getJSONObject("geometry").getJSONObject("location");
                            double lat = location.getDouble("lat");
                            double lng = location.getDouble("lng");
                            entidad.setLa(String.valueOf(lat));
                            entidad.setLon(String.valueOf(lng));
                            System.out.println("COORDENADAS OBTENIDAS DE GOOGLE MAPS PARA DIRECCION '" + entidad.getDireccion() + "' -> Latitud (la): " + entidad.getLa() + " | Longitud (lon): " + entidad.getLon());
                        } else {
                            return JSONObject.quote("ERROR: No se encontraron coordenadas para la dirección ingresada.");
                        }
                    } else {
                        String status = responseJson.getString("status");
                        return JSONObject.quote("ERROR Google Maps Geocoding API status: " + status);
                    }
                } catch (Exception ex) {
                    return JSONObject.quote("ERROR al geocodificar dirección: " + ex.getMessage());
                }
            }

            StoredProcedureQuery query = repositorio.createNamedStoredProcedureQuery("paC_validaCoordenadasSector");
            query.registerStoredProcedureParameter("Bandera", String.class, ParameterMode.IN);
            query.registerStoredProcedureParameter("id_oferta", String.class, ParameterMode.IN);
            query.registerStoredProcedureParameter("lat", String.class, ParameterMode.IN);
            query.registerStoredProcedureParameter("lon", String.class, ParameterMode.IN);
            query.registerStoredProcedureParameter("Direccion", String.class, ParameterMode.IN);

            query.setParameter("Bandera", entidad.getBandera());
            query.setParameter("id_oferta", entidad.getId_oferta());
            query.setParameter("lat", entidad.getLa());
            query.setParameter("lon", entidad.getLon());
            query.setParameter("Direccion", entidad.getDireccion());

            query.execute();
            return JSONObject.quote((String) query.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("ERROR LOG (paC_validaCoordenadasSector)"
                    + " - Parametros: " + entidad.getBandera() + "/" + entidad.getId_oferta() + "/"
                    + entidad.getLa() + "/" + entidad.getLon() + "/" + entidad.getDireccion()
                    + " - ERROR JAVA = " + ex);
        }
    }
}
