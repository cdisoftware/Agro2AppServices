
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
            name = "Ikon_Pedidos_item",
            procedureName = "Ikon_Pedidos_item",
            resultClasses = Ikon_Pedidos_itemEntity.class)
})
public class Ikon_Pedidos_itemEntity {
    @Id
    @JsonProperty("Id")
    public Integer Id;
    
    @JsonProperty("IdOferta")
    public String IdOferta;
    
    @JsonProperty("Cantidad")
    public String Cantidad;
    
    @JsonProperty("VlorTotal")
    public String VlorTotal;
    
    @JsonProperty("IdProducto")
    public String IdProducto;
    
    @JsonProperty("Descripcion")
    public String Descripcion;
    
    @JsonProperty("Presentacion")
    public String Presentacion;
    
    @JsonProperty("PesoLibras")
    public String PesoLibras;
    
    @JsonProperty("EsCombo")
    public String EsCombo;
    
    
}
