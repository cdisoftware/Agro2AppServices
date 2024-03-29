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
            name = "paC_evidenciaMod",
            procedureName = "paC_evidenciaMod",
            parameters = {
                @StoredProcedureParameter(name = "respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class evidenciaModEntity {

    @Id
    @JsonProperty("imagen")
    public String imagen;

    @JsonProperty("Observacion")
    public String Observacion;

    @JsonProperty("Coordenadas")
    public String Coordenadas;

    @JsonProperty("ObservacionesDos")
    public String ObservacionesDos;

    @JsonProperty("ObservacionesPago")
    public String ObservacionesPago;

    @JsonProperty("idTipoPago")
    public Integer idTipoPago;
}
