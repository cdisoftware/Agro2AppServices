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
            name = "z_EstadoOferta_mod",
            procedureName = "z_EstadoOferta_mod",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})

public class zEstadoOfertamodEntity {

    @Id
    @JsonProperty("IdOferta")
    public Integer IdOferta;

    @JsonProperty("Estado")
    public Integer Estado;

    @JsonProperty("Parametro")
    public String Parametro;
}
