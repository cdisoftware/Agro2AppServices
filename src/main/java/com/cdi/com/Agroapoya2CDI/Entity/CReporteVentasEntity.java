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
            name = "paC_ReporteVentas",
            procedureName = "paC_ReporteVentas",
            resultClasses = CReporteVentasEntity.class)
})
public class CReporteVentasEntity {

    @Id
    @JsonProperty("ID_CARRO")
    public Integer ID_CARRO;

    @JsonProperty("OFERTA")
    public Integer OFERTA;

    @JsonProperty("SECTOR")
    public String SECTOR;

    @JsonProperty("FECHA_COMPRA")
    public String FECHA_COMPRA;

    @JsonProperty("ESTADO_CARRO")
    public String ESTADO_CARRO;

    @JsonProperty("TIPO_USUARIO_COMPRA")
    public String TIPO_USUARIO_COMPRA;

    @JsonProperty("CODIGO_COMPARTIR")
    public String CODIGO_COMPARTIR;

    @JsonProperty("CODIGO_LIDER")
    public String CODIGO_LIDER;

    @JsonProperty("NOMBRES_PERSONA")
    public String NOMBRES_PERSONA;

    @JsonProperty("APELLIDOS_PERSONA")
    public String APELLIDOS_PERSONA;

    @JsonProperty("PRODUCTO")
    public String PRODUCTO;

    @JsonProperty("Unidades")
    public Integer Unidades;

    @JsonProperty("ADICIONALES")
    public String ADICIONALES;

    @JsonProperty("VALOR_PAGO")
    public String VALOR_PAGO;

    @JsonProperty("MEDIO_PAGO")
    public String MEDIO_PAGO;

    @JsonProperty("ESTADO_PAGO")
    public String ESTADO_PAGO;

    @JsonProperty("FECHA_ENTREGA")
    public String FECHA_ENTREGA;

    @JsonProperty("DIRECCION_ENTREGA")
    public String DIRECCION_ENTREGA;

    @JsonProperty("CELULAR_PERSONA")
    public String CELULAR_PERSONA;

    @JsonProperty("CORREO_PERSONA")
    public String CORREO_PERSONA;

    @JsonProperty("FechaCompra")
    public String FechaCompra;

    @JsonProperty("observaciones_cliente")
    public String observaciones_cliente;

    @JsonProperty("idGrupoLider")
    public String idGrupoLider;

    @JsonProperty("IdGrupoParti")
    public String IdGrupoParti;

    @JsonProperty("SumToppings")
    public String SumToppings;

    @JsonProperty("ValorProdcuto")
    public String ValorProdcuto;
}
