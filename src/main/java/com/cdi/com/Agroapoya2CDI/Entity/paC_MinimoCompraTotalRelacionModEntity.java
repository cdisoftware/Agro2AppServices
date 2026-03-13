
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
            name = "paC_MinimoCompraTotalRelacionMod ",
            procedureName = "paC_MinimoCompraTotalRelacionMod ",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class paC_MinimoCompraTotalRelacionModEntity {
    @Id
    @JsonProperty("cd_cnsctivo")
    public Integer cd_cnsctivo;
    
    @JsonProperty("IdTipoRelacion")
    public Integer IdTipoRelacion;
    
    @JsonProperty("DescripcionRelacion")
    public String DescripcionRelacion;
  
}
