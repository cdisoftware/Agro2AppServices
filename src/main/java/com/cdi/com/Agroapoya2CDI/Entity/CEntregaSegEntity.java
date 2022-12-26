package com.cdi.com.Agroapoya2CDI.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import lombok.Data;

@Entity
@Data
@NamedStoredProcedureQueries({
    @NamedStoredProcedureQuery(
            name = "paC_Consulta_Entregas_seguimiento",
            procedureName = "paC_Consulta_Entregas_seguimiento",
            resultClasses = CEntregaSegEntity.class)
})
public class CEntregaSegEntity {

    @Id
    @JsonProperty("ID_COMPRA")
    public Integer ID_COMPRA;

    @JsonProperty("COD_OFERTA")
    public Integer COD_OFERTA;

    @JsonProperty("COD_SECTOR")
    public Integer COD_SECTOR;

    @JsonProperty("COD_CLIENTE")
    public Integer COD_CLIENTE;

    @JsonProperty("NOMBRE_CLIENTE")
    public String NOMBRE_CLIENTE;

    @JsonProperty("APELLIDOS_CLIENTE")
    public String APELLIDOS_CLIENTE;

    @JsonProperty("NRO_ID_CLIENTE")
    public String NRO_ID_CLIENTE;

    @JsonProperty("CELULAR_CLIENTE")
    public String CELULAR_CLIENTE;

    @JsonProperty("DIRECCION_CLIENTE")
    public String DIRECCION_CLIENTE;

    @JsonProperty("COMPLEMENTO_DIRECCION")
    public String COMPLEMENTO_DIRECCION;

    @JsonProperty("COORDENADAS_CLIENTE")
    public String COORDENADAS_CLIENTE;

    @JsonProperty("PRODUCTO")
    public String PRODUCTO;

    @JsonProperty("VALOR_PRODUCTO")
    public String VALOR_PRODUCTO;

    @JsonProperty("VALOR_PRODUCTO_FR")
    public String VALOR_PRODUCTO_FR;

    @JsonProperty("UNIDADES_PRODUCTO")
    public Integer UNIDADES_PRODUCTO;

    @JsonProperty("OBSERVACIONES_CLIENTE")
    public String OBSERVACIONES_CLIENTE;

    @JsonProperty("COD_ESTADO_COMPRA")
    public Integer COD_ESTADO_COMPRA;

    @JsonProperty("ESTADO_COMPRA")
    public String ESTADO_COMPRA;

    @JsonProperty("ID_TIPOPAGO")
    public Integer ID_TIPOPAGO;

    @JsonProperty("DES_TIPOPAGO")
    public String DES_TIPOPAGO;

    @JsonProperty("ID_EVIDENCIA")
    public Integer ID_EVIDENCIA;

    @JsonProperty("FECHA_ENTREGA")
    public String FECHA_ENTREGA;

    @JsonProperty("COD_ESTADO_ENTREGA")
    public Integer COD_ESTADO_ENTREGA;

    @JsonProperty("ESTADO_ENTREGA")
    public String ESTADO_ENTREGA;

    @JsonProperty("COORDENADAS_ENTREGA")
    public String COORDENADAS_ENTREGA;

    @JsonProperty("IMAGEN_EVIDENCIA")
    public String IMAGEN_EVIDENCIA;

    @JsonProperty("OBSERVACION")
    public String OBSERVACION;

    @JsonProperty("OBSERVACIONESDOS")
    public String OBSERVACIONESDOS;

    @JsonProperty("COORDENADAS_MAPA")
    public String COORDENADAS_MAPA;

    @JsonProperty("ID_CONDUCTOR")
    public Integer ID_CONDUCTOR;

    @JsonProperty("ID_TRANSPORTISTA")
    public Integer ID_TRANSPORTISTA;

}
