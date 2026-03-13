
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
            name = "paC_MinimoCompraTotalRelacion",
            procedureName = "paC_MinimoCompraTotalRelacion",
            resultClasses = paC_MinimoCompraEntity.class)
})
public class paC_MinimoCompraEntity {
    @Id
    @JsonProperty("id")
    public Integer id;

    @JsonProperty("cd_cnsctivo")
    public Integer cd_cnsctivo;
    
     @JsonProperty("IdTipoRelacion")
    public Integer IdTipoRelacion;
    
    @JsonProperty("DescripcionRelacion")
    public String DescripcionRelacion;
}
