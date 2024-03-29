package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CToppingModEntity;
import com.cdi.com.Agroapoya2CDI.Services.CToppingModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CToppingModServiceImplementacion implements CToppingModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ModCTopping(CToppingModEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery modTopping = repositorio.createNamedStoredProcedureQuery("paC_ToppingMod");
            modTopping.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            modTopping.registerStoredProcedureParameter("IdTopping", Integer.class, ParameterMode.IN);
            modTopping.registerStoredProcedureParameter("Id_Sector", Integer.class, ParameterMode.IN);
            modTopping.registerStoredProcedureParameter("cd_cnctivo", Integer.class, ParameterMode.IN);
            modTopping.registerStoredProcedureParameter("Descricpcion", String.class, ParameterMode.IN);
            modTopping.registerStoredProcedureParameter("MaxCantidad", Integer.class, ParameterMode.IN);
            modTopping.registerStoredProcedureParameter("IdTipoTopping", Integer.class, ParameterMode.IN);
            modTopping.registerStoredProcedureParameter("ValorUnitario", Integer.class, ParameterMode.IN);
            modTopping.registerStoredProcedureParameter("cantidadReserva", Integer.class, ParameterMode.IN);
            modTopping.registerStoredProcedureParameter("imagen", String.class, ParameterMode.IN);
            modTopping.registerStoredProcedureParameter("PesoKiloUnd", String.class, ParameterMode.IN);
            modTopping.registerStoredProcedureParameter("CrctrzcionCrta", String.class, ParameterMode.IN);
            modTopping.registerStoredProcedureParameter("CrctrzcionLrga", String.class, ParameterMode.IN);
            modTopping.registerStoredProcedureParameter("ImgDos", String.class, ParameterMode.IN);
            modTopping.registerStoredProcedureParameter("ImgTres", String.class, ParameterMode.IN);
            modTopping.registerStoredProcedureParameter("VlorRefencia", Integer.class, ParameterMode.IN);
            modTopping.registerStoredProcedureParameter("IdTipoTopingVenta", Integer.class, ParameterMode.IN);
            modTopping.registerStoredProcedureParameter("IdProdTopin", Integer.class, ParameterMode.IN);
            modTopping.registerStoredProcedureParameter("PresentacionProd", String.class, ParameterMode.IN);
            modTopping.registerStoredProcedureParameter("IdCampesino", Integer.class, ParameterMode.IN);
            modTopping.registerStoredProcedureParameter("UnidadesPeso", Integer.class, ParameterMode.IN);
            modTopping.registerStoredProcedureParameter("DefectoUnidadesPeso", Integer.class, ParameterMode.IN);

            modTopping.setParameter("Bandera", Bandera);
            modTopping.setParameter("IdTopping", entidad.getIdTopping());
            modTopping.setParameter("Id_Sector", entidad.getId_Sector());
            modTopping.setParameter("cd_cnctivo", entidad.getCd_cnctivo());
            modTopping.setParameter("Descricpcion", entidad.getDescricpcion());
            modTopping.setParameter("MaxCantidad", entidad.getMaxCantidad());
            modTopping.setParameter("IdTipoTopping", entidad.getIdTipoTopping());
            modTopping.setParameter("ValorUnitario", entidad.getValorUnitario());
            modTopping.setParameter("cantidadReserva", entidad.getCantidadReserva());
            modTopping.setParameter("imagen", entidad.getImagen());
            modTopping.setParameter("PesoKiloUnd", entidad.getPesoKiloUnd());
            modTopping.setParameter("CrctrzcionCrta", entidad.getCrctrzcionCrta());
            modTopping.setParameter("CrctrzcionLrga", entidad.getCrctrzcionLrga());
            modTopping.setParameter("ImgDos", entidad.getImgDos());
            modTopping.setParameter("ImgTres", entidad.getImgTres());
            modTopping.setParameter("VlorRefencia", entidad.getVlorRefencia());
            modTopping.setParameter("IdTipoTopingVenta", entidad.getIdTipoTopingVenta());
            modTopping.setParameter("IdProdTopin", entidad.getIdProdTopin());
            modTopping.setParameter("PresentacionProd", entidad.getPresentacionProd());
            modTopping.setParameter("IdCampesino", entidad.getIdCampesino());
            modTopping.setParameter("UnidadesPeso", entidad.getUnidadesPeso());
            modTopping.setParameter("DefectoUnidadesPeso", entidad.getDefectoUnidadesPeso());

            modTopping.execute();
            return JSONObject.quote((String) modTopping.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("ERROR LOG (paC_ToppingMod)"
                    + " - Parametros: " + Bandera + "/" + entidad.getIdTopping() + "/" + entidad.getId_Sector() + "/"
                    + entidad.getCd_cnctivo() + "/" + entidad.getDescricpcion() + "/" + entidad.getMaxCantidad() + "/"
                    + entidad.getIdTipoTopping() + "/" + entidad.getValorUnitario() + "/" + entidad.getCantidadReserva() + "/"
                    + entidad.getImagen() + "/" + entidad.getPesoKiloUnd() + "/" + entidad.getCrctrzcionCrta() + "/"
                    + entidad.getCrctrzcionLrga() + "/" + entidad.getImgDos() + "/" + entidad.getImgTres() + "/"
                    + entidad.getVlorRefencia() + "/" + entidad.getIdTipoTopingVenta() + "/" + entidad.getIdProdTopin() + "/"
                    + entidad.getPresentacionProd() + "/" + entidad.getIdCampesino() + "/" + entidad.getUnidadesPeso() + "/" + entidad.getDefectoUnidadesPeso()
                    + " - ERROR JAVA = " + ex);
        }

    }
}
