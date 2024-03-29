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
            name = "paC_ListadoTopping",
            procedureName = "paC_ListadoTopping",
            resultClasses = CListadoToppingEntity.class)
})
public class CListadoToppingEntity {

    @Id
    @JsonProperty("IdTopping")
    public Integer IdTopping;

    @JsonProperty("MaxCantidad")
    public Integer MaxCantidad;

    @JsonProperty("IdTipoTopping")
    public Integer IdTipoTopping;

    @JsonProperty("ValorUnitario")
    public String ValorUnitario;

    @JsonProperty("Descripcion")
    public String Descripcion;

    @JsonProperty("Estado")
    public Integer Estado;

    @JsonProperty("descTipotopping")
    public String descTipotopping;

    @JsonProperty("CanInicial")
    public String CanInicial;

    @JsonProperty("cantidadReserva")
    public String cantidadReserva;

    @JsonProperty("cant_disponible")
    public String cant_disponible;

    @JsonProperty("imagen")
    public String imagen;

    @JsonProperty("PesoKilos")
    public String PesoKilos;

    @JsonProperty("Tipo_ToppingVenta")
    public String Tipo_ToppingVenta;

    @JsonProperty("CrctrzcionCrta")
    public String CrctrzcionCrta;

    @JsonProperty("CrctrzcionLrga")
    public String CrctrzcionLrga;

    @JsonProperty("ImgDos")
    public String ImgDos;

    @JsonProperty("ImgTres")
    public String ImgTres;

    @JsonProperty("VlorRefencia")
    public Integer VlorRefencia;

    @JsonProperty("UndRestantes")
    public Integer UndRestantes;

    @JsonProperty("IdTipoToppingVenta")
    public Integer IdTipoToppingVenta;

    @JsonProperty("DesTipoVentaTopping")
    public String DesTipoVentaTopping;

    @JsonProperty("tyc")
    public String tyc;

    @JsonProperty("TextoWebVlrCero")
    public String TextoWebVlrCero;

    @JsonProperty("Presentacion")
    public String Presentacion;

    @JsonProperty("PorDecuento")
    public String PorDecuento;

    @JsonProperty("IdCampesino")
    public Integer IdCampesino;

    @JsonProperty("Id_Producto")
    public Integer Id_Producto;

    @JsonProperty("UniProd")
    public Integer UniProd;

    @JsonProperty("DefectoUniProd")
    public Integer DefectoUniProd;

    @JsonProperty("TieneReceta")
    public Integer TieneReceta;

    @JsonProperty("TieneConserva")
    public Integer TieneConserva;
}
