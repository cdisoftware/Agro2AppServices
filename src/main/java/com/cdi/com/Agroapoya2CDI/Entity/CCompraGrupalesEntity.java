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
            name = "paC_CompraGrupales",
            procedureName = "paC_CompraGrupales",
            resultClasses = CCompraGrupalesEntity.class)
})
public class CCompraGrupalesEntity {

    @Id
    @JsonProperty("Id")
    public Integer Id;

    @JsonProperty("ID_CARRO")
    public Integer ID_CARRO;

    @JsonProperty("CD_CNSCTVO")
    public Integer CD_CNSCTVO;

    @JsonProperty("IDGRUPO")
    public Integer IDGRUPO;

    @JsonProperty("IDGRUPO_PARTI")
    public Integer IDGRUPO_PARTI;

    @JsonProperty("IdSector")
    public Integer IdSector;

    @JsonProperty("NombrePersona")
    public String NombrePersona;

    @JsonProperty("Producto")
    public String Producto;

    @JsonProperty("DescripcionProducto")
    public String DescripcionProducto;

    @JsonProperty("Cantidad")
    public Integer Cantidad;

    @JsonProperty("PesoProd")
    public String PesoProd;

    @JsonProperty("DesTopping")
    public String DesTopping;

    @JsonProperty("CantidadTopping")
    public Integer CantidadTopping;

    @JsonProperty("PesoKilos")
    public Integer PesoKilos;

    @JsonProperty("IdTipoTopping")
    public Integer IdTipoTopping;

    @JsonProperty("VLOR_PGAR")
    public String VLOR_PGAR;

    @JsonProperty("ValorLider")
    public String ValorLider;

    @JsonProperty("PagoLider")
    public String PagoLider;

    @JsonProperty("TipoUsuCompra")
    public Integer TipoUsuCompra;

    @JsonProperty("DesTipoUsuCompra")
    public String DesTipoUsuCompra;

    @JsonProperty("IdMedioPago")
    public Integer IdMedioPago;

    @JsonProperty("DesMedioPago")
    public String DesMedioPago;

    @JsonProperty("VLOR_PGARFORM")
    public String VLOR_PGARFORM;

}
