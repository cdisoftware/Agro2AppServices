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
            name = "movile_ConsultaGeneralEntrega",
            procedureName = "movile_ConsultaGeneralEntrega",
            resultClasses = mvConsGeneralEntregaEntity.class)
})
public class mvConsGeneralEntregaEntity {

    @Id
    @JsonProperty("ID")
    public Integer ID;

    @JsonProperty("IdGrupoMilla")
    public Integer IdGrupoMilla;

    @JsonProperty("NombreGrupoMilla")
    public String NombreGrupoMilla;

    @JsonProperty("NombreBodega")
    public String NombreBodega;

    @JsonProperty("DireccionBodega")
    public String DireccionBodega;

    @JsonProperty("CoordenadasBodega")
    public String CoordenadasBodega;

    @JsonProperty("fechaEntrega")
    public String fechaEntrega;

    @JsonProperty("valorFlete")
    public String valorFlete;

    @JsonProperty("NumeroParadas")
    public Integer NumeroParadas;

    @JsonProperty("IdEstadoTranspo")
    public Integer IdEstadoTranspo;

    @JsonProperty("DesEstadoTranspo")
    public String DesEstadoTranspo;

    @JsonProperty("NMBRE_CNDCTOR")
    public String NMBRE_CNDCTOR;

    @JsonProperty("PLCA")
    public String PLCA;
}
