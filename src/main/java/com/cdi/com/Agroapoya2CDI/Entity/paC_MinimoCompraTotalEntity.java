
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
            name = "paC_MinimoCompraTotal_Const",
            procedureName = "paC_MinimoCompraTotal_Const",
            resultClasses = paC_MinimoCompraTotalEntity.class)
})
public class paC_MinimoCompraTotalEntity {
    @Id
    @JsonProperty("id")
    public Integer id;

    @JsonProperty("IdTipo")
    public Integer IdTipo;
    
     @JsonProperty("Descripcion")
    public String Descripcion;
    
    @JsonProperty("PesoTotal")
    public Integer PesoTotal;
    
    @JsonProperty("NumComprasTotal")
    public Integer NumComprasTotal;
    
    @JsonProperty("Estado")
    public Integer Estado;
    
    @JsonProperty("descEstado")
    public String descEstado;
    
    @JsonProperty("PesoFalta")
    public Integer PesoFalta;
    
    @JsonProperty("NumComprasFalta")
    public Integer NumComprasFalta;
}
