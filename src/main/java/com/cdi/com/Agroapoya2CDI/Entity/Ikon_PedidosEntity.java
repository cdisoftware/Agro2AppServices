
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
            name = "Ikon_Pedidos",
            procedureName = "Ikon_Pedidos",
            resultClasses = Ikon_PedidosEntity.class)
})
public class Ikon_PedidosEntity {
    @Id
    @JsonProperty("IdPedido")
    public Integer IdPedido;
    
    @JsonProperty("IdUsuario")
    public String IdUsuario;
    
    @JsonProperty("IdOferta")
    public String IdOferta;
    
    @JsonProperty("IdEmbajador")
    public String IdEmbajador;
    
    @JsonProperty("NumeroCompra")
    public String NumeroCompra;
    
    @JsonProperty("Estado")
    public String Estado;
    
    @JsonProperty("fechaCompra")
    public String fechaCompra;
    
    @JsonProperty("FechaProgramadaEntrega")
    public String FechaProgramadaEntrega;
    
    @JsonProperty("FechaRealEntrega")
    public String FechaRealEntrega;
    
    @JsonProperty("ValorCompra")
    public String ValorCompra;
    
    @JsonProperty("MetodoPago")
    public String MetodoPago;
    
    @JsonProperty("DireccionEntrega")
    public String DireccionEntrega;
    
    @JsonProperty("CoordenadaEntrega")
    public String CoordenadaEntrega;
}
