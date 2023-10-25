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
            name = "movile_ConsultaDetalleEntregas",
            procedureName = "movile_ConsultaDetalleEntregas",
            resultClasses = mvConsultaDetalleEntregasEntity.class)
})
public class mvConsultaDetalleEntregasEntity {

    @Id
    @JsonProperty("Id")
    public Integer Id;

    @JsonProperty("ID_CARRO")
    public Integer ID_CARRO;

    @JsonProperty("idTopping")
    public Integer idTopping;

    @JsonProperty("CD_CNSCTVO")
    public Integer CD_CNSCTVO;

    @JsonProperty("IdSector")
    public Integer IdSector;

    @JsonProperty("Producto")
    public String Producto;

    @JsonProperty("Empaque")
    public String Empaque;

    @JsonProperty("Cantidad")
    public Integer Cantidad;

    @JsonProperty("IdMedioPago")
    public Integer IdMedioPago;

    @JsonProperty("DesMedioPago")
    public String DesMedioPago;

    @JsonProperty("IdTipoVenta")
    public Integer IdTipoVenta;

    @JsonProperty("DesTipoVenta")
    public String DesTipoVenta;

    @JsonProperty("VLOR_PGAR")
    public String VLOR_PGAR;

}
