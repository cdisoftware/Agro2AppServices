
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
            name = "Agro_ActualizaCompraEmbajador",
            procedureName = "Agro_ActualizaCompraEmbajador",
            parameters = {
                @StoredProcedureParameter(name = "Resultado",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class Agro_ActualizaCompraEmbajadorEntity {
    
    @Id
    @JsonProperty("idCarro")
    public Integer idCarro;
    
    @JsonProperty("usucodig")
    public Integer usucodig ;
    
    @JsonProperty("IdGrupoEmbajador")
    public String IdGrupoEmbajador;
}
