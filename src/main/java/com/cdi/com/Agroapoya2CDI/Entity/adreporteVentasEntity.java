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
            name = "admin_reporteVentas",
            procedureName = "admin_reporteVentas",
            resultClasses = adreporteVentasEntity.class)
})
public class adreporteVentasEntity {

    @Id
    @JsonProperty("id")
    public Integer id;

    @JsonProperty("IdOferta")
    public Integer IdOferta;

    @JsonProperty("NombrePesona")
    public String NombrePesona;

    @JsonProperty("DireccionEntrega")
    public String DireccionEntrega;

    @JsonProperty("CoordenadasEntrega")
    public String CoordenadasEntrega;

    @JsonProperty("CelularPersona")
    public String CelularPersona;

    @JsonProperty("CorreoPersona")
    public String CorreoPersona;

    @JsonProperty("IdSector")
    public Integer IdSector;

    @JsonProperty("SECTOR")
    public String SECTOR;

    @JsonProperty("PRODUCTO")
    public String PRODUCTO;

    @JsonProperty("Unidades")
    public Integer Unidades;

    @JsonProperty("ADICIONALES")
    public String ADICIONALES;

    @JsonProperty("FechaCompra")
    public String FechaCompra;

    @JsonProperty("FechaEntrega")
    public String FechaEntrega;

    @JsonProperty("IdEstadoCompra")
    public Integer IdEstadoCompra;

    @JsonProperty("DescEstadoCompra")
    public String DescEstadoCompra;

    @JsonProperty("idGrupoLider")
    public Integer idGrupoLider;

    @JsonProperty("DesGrupoLider")
    public String DesGrupoLider;

    @JsonProperty("NumReferidos")
    public Integer NumReferidos;

    @JsonProperty("NombresReferidos")
    public String NombresReferidos;

    @JsonProperty("CodigoDescuentoGeneral")
    public String CodigoDescuentoGeneral;

    @JsonProperty("IdCodigoRegistro")
    public Integer IdCodigoRegistro;

    @JsonProperty("DesCodigoRegistro")
    public String DesCodigoRegistro;

    @JsonProperty("NombreReferidor")
    public String NombreReferidor;

    @JsonProperty("ID_CARRO")
    public Integer ID_CARRO;

    @JsonProperty("IdTipoPago")
    public Integer IdTipoPago;

    @JsonProperty("DesTipoPago")
    public String DesTipoPago;

    @JsonProperty("idEstadoPago")
    public Integer idEstadoPago;

    @JsonProperty("DesEstadoPago")
    public String DesEstadoPago;

    @JsonProperty("ValorProdcuto")
    public String ValorProdcuto;

    @JsonProperty("TotalValorPago")
    public String TotalValorPago;

    @JsonProperty("TotalValorDomicilio")
    public String TotalValorDomicilio;

    @JsonProperty("DesTipoOfeta")
    public String DesTipoOfeta;
}
