
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
            name = "sp_ActualizarConjuntoEmbajador",
            procedureName = "sp_ActualizarConjuntoEmbajador",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class sp_ActualizarConjuntoEmbajadorEntity {
    @Id
    @JsonProperty("IdEmbajador")
    public Integer IdEmbajador;
    
    @JsonProperty("NombreConjunto")
    public Integer NombreConjunto;
    
    @JsonProperty("IdTipoEmbajador")
    public Integer IdTipoEmbajador;
}
