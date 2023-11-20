package com.cdi.com.Agroapoya2CDI.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import lombok.Data;

@Entity
@Data
@NamedStoredProcedureQueries({
    @NamedStoredProcedureQuery(
            name = "admin_ofertaFechasMod",
            procedureName = "admin_ofertaFechasMod",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class adofertaFechasModEntity {

    @Id
    @JsonProperty("cd_cnsctvo")
    public Integer cd_cnsctvo;

    @JsonProperty("IdSector")
    public Integer IdSector;

    @JsonProperty("FechaInicio")
    public String FechaInicio;

    @JsonProperty("FechaFin")
    public String FechaFin;

    @JsonProperty("FechaEntrega")
    public String FechaEntrega;

    @JsonProperty("FechaPartida")
    public String FechaPartida;
}
