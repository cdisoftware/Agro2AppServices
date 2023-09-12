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
            name = "pac_PagosElectronicos",
            procedureName = "pac_PagosElectronicos",
            resultClasses = CPagosElectronicosEntity.class)
})
public class CPagosElectronicosEntity {

    @Id
    @JsonProperty("id_carro")
    public Integer id_carro;

    @JsonProperty("cd_cnsctvo")
    public Integer cd_cnsctvo;

    @JsonProperty("cd_undad")
    public Integer cd_undad;

    @JsonProperty("Obsrvcnes")
    public String Obsrvcnes;

    @JsonProperty("estdo")
    public Integer estdo;

    @JsonProperty("usucodig")
    public Integer usucodig;

    @JsonProperty("idgrupo")
    public Integer idgrupo;

    @JsonProperty("tipo_usuarioCompra")
    public Integer tipo_usuarioCompra;

    @JsonProperty("idsector")
    public Integer idsector;

    @JsonProperty("topping")
    public String topping;

    @JsonProperty("EstadoPago")
    public Integer EstadoPago;

    @JsonProperty("MedioPago")
    public Integer MedioPago;

    @JsonProperty("direccionEntrega")
    public String direccionEntrega;

    @JsonProperty("CodigoDescuento")
    public String CodigoDescuento;

    @JsonProperty("CD_CNSCTVO")
    public Integer CD_CNSCTVO;

    @JsonProperty("IdSector")
    public Integer IdSector;

    @JsonProperty("CD_UNDAD")
    public Integer CD_UNDAD;

    @JsonProperty("USUCODIG")
    public Integer USUCODIG;

    @JsonProperty("IDGRUPO")
    public Integer IDGRUPO;

    @JsonProperty("Topping")
    public String Topping;

    @JsonProperty("ValorDomicilio")
    public String ValorDomicilio;

    @JsonProperty("valorTotalPagar")
    public String valorTotalPagar;

    @JsonProperty("valorProductoAncla")
    public String valorProductoAncla;

    @JsonProperty("Producto")
    public String Producto;

    @JsonProperty("Imagen")
    public String Imagen;

    @JsonProperty("empaque")
    public String empaque;
}
