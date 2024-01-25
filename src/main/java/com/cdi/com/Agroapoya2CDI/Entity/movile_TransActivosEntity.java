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
            name = "movile_TransActivos",
            procedureName = "movile_TransActivos",
            resultClasses = movile_TransActivosEntity.class)
})
public class movile_TransActivosEntity {

    @Id
    @JsonProperty("ID")
    public Integer ID;

    @JsonProperty("usucodigTrans")
    public Integer usucodigTrans;

    @JsonProperty("id_conductor")
    public Integer id_conductor;

    @JsonProperty("NMBRE_CNDCTOR")
    public String NMBRE_CNDCTOR;

    @JsonProperty("TEL_CNDCTOR")
    public String TEL_CNDCTOR;

    @JsonProperty("descCarroceria")
    public String descCarroceria;

    @JsonProperty("descPesoCarro")
    public String descPesoCarro;

    @JsonProperty("PLCA")
    public String PLCA;

    @JsonProperty("PesoTotalCarga")
    public String PesoTotalCarga;

    @JsonProperty("valorFlete")
    public Integer valorFlete;

    @JsonProperty("valorFleteForm")
    public String valorFleteForm;

    @JsonProperty("FechaRecogida")
    public String FechaRecogida;

    @JsonProperty("NumeroParadas")
    public Integer NumeroParadas;

    @JsonProperty("IdEstadoTranspo")
    public Integer IdEstadoTranspo;

    @JsonProperty("DesEstadoTranspo")
    public String DesEstadoTranspo;

    @JsonProperty("TipoTrans")
    public Integer TipoTrans;

    @JsonProperty("NombreGrupo")
    public String NombreGrupo;

    @JsonProperty("IdGrupoMilla")
    public Integer IdGrupoMilla;

    @JsonProperty("UbicacionEntrega")
    public String UbicacionEntrega;

    @JsonProperty("UbicacionRecoge")
    public String UbicacionRecoge;

    @JsonProperty("FechaRecogidaFormato")
    public String FechaRecogidaFormato;
}
