package com.cdi.com.Agroapoya2CDI.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;

@Entity
@Data
@NamedStoredProcedureQueries({
    @NamedStoredProcedureQuery(
            name = "z_DuplicarOferta_mod",
            procedureName = "z_DuplicarOferta_mod",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})

public class zDuplicarOfertamodEntity {

    @Id
    @JsonProperty("IdOferta")
    public Integer IdOferta;

    @JsonProperty("FechaInicio")
    public String FechaInicio;

    @JsonProperty("FechaFin")
    public String FechaFin;

    @JsonProperty("FechaEntrega")
    public String FechaEntrega;

}
