
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
            name = "paC_MinimoCompraTotalMod",
            procedureName = "paC_MinimoCompraTotalMod",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class paC_MinimoCompraTotalModEntity {
    
    @Id
    @JsonProperty("Id")
    public Integer Id;
    
    @JsonProperty("IdTipo")
    public Integer IdTipo;
    
    @JsonProperty("PesoLibras")
    public Integer PesoLibras;
    
     @JsonProperty("NumCompras")
    public Integer NumCompras;
    
    @JsonProperty("Estado")
    public Integer Estado;
    
    @JsonProperty("cd_cnsctivo")
    public Integer cd_cnsctivo;
    
    @JsonProperty("Descripcion")
    public String Descripcion;
}
