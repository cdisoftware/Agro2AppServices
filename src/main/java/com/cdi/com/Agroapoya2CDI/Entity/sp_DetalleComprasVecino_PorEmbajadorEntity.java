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
            name = "sp_DetalleComprasVecino_PorEmbajador",
            procedureName = "sp_DetalleComprasVecino_PorEmbajador",
            resultClasses = sp_DetalleComprasVecino_PorEmbajadorEntity.class)
})
public class sp_DetalleComprasVecino_PorEmbajadorEntity {

    @Id
    @JsonProperty("NumeroCarrito")
    public String NumeroCarrito;

    @JsonProperty("ValorCompra")
    public String ValorCompra;

    @JsonProperty("EstadoCompraVecino")
    public String EstadoCompraVecino;

    @JsonProperty("FechaPagoCliente")
    public String FechaPagoCliente;

    @JsonProperty("PorcentajeComision")
    public String PorcentajeComision;

    @JsonProperty("ValorComision")
    public String ValorComision;

    @JsonProperty("EstadoComisionEmbajador")
    public String EstadoComisionEmbajador;

    @JsonProperty("FechaPagoComision")
    public String FechaPagoComision;

    @JsonProperty("TipoMedioPago")
    public String TipoMedioPago;

    @JsonProperty("LlaveTransaccion")
    public String LlaveTransaccion;

}
