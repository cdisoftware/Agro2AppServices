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
            name = "paC_EstadoViajeBodega",
            procedureName = "paC_EstadoViajeBodega",
            resultClasses = CEstadoViajeBodegaEntity.class)
})
public class CEstadoViajeBodegaEntity {

    @Id
    @JsonProperty("IdAuditoria")
    public Integer IdAuditoria;

    @JsonProperty("Cd_cnctivo")
    public Integer Cd_cnctivo;

    @JsonProperty("Id_Sector")
    public Integer Id_Sector;

    @JsonProperty("Estado")
    public Integer Estado;

    @JsonProperty("Observacion")
    public String Observacion;

    @JsonProperty("FechaRegistro")
    public String FechaRegistro;

    @JsonProperty("DesEstado")
    public String DesEstado;

}
