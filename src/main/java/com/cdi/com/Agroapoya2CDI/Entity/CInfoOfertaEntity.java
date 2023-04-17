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
            name = "pac_InfoOferta",
            procedureName = "pac_InfoOferta",
            resultClasses = CInfoOfertaEntity.class)
})
public class CInfoOfertaEntity {

    @Id
    @JsonProperty("CD_CNSCTVO")
    public Integer CD_CNSCTVO;

    @JsonProperty("ID_SCTOR_OFRTA")
    public Integer ID_SCTOR_OFRTA;

    @JsonProperty("Nombre_Producto")
    public String Nombre_Producto;

    @JsonProperty("descripcion")
    public String descripcion;

    @JsonProperty("caracterizacion")
    public String caracterizacion;

    @JsonProperty("VR_UNDAD_EMPQUE")
    public String VR_UNDAD_EMPQUE;

    @JsonProperty("fecha_recogida")
    public String fecha_recogida;

    @JsonProperty("Ubicacion_parsela")
    public String Ubicacion_parsela;

    @JsonProperty("coordenadas_parcela")
    public String coordenadas_parcela;

    @JsonProperty("Nombre_productor")
    public String Nombre_productor;

    @JsonProperty("Nmbre_tamano")
    public String Nmbre_tamano;

    @JsonProperty("Descripcion_empaque")
    public String Descripcion_empaque;

    @JsonProperty("IMAGEN")
    public String IMAGEN;

    @JsonProperty("IdEstado")
    public Integer IdEstado;

    @JsonProperty("Nombre_estado")
    public String Nombre_estado;

    @JsonProperty("Condicion_entrega")
    public String Condicion_entrega;

    @JsonProperty("COD_OFR_PUBLICO")
    public String COD_OFR_PUBLICO;

    @JsonProperty("DescToppings")
    public String DescToppings;

    @JsonProperty("DireccionBodega")
    public String DireccionBodega;

    @JsonProperty("CoordenadasBodega")
    public String CoordenadasBodega;

    @JsonProperty("NombreDodega")
    public String NombreDodega;

    @JsonProperty("DescBodega")
    public String DescBodega;

    @JsonProperty("MaximoEntregas")
    public Integer MaximoEntregas;

    @JsonProperty("MaximoKilos")
    public Integer MaximoKilos;
}
