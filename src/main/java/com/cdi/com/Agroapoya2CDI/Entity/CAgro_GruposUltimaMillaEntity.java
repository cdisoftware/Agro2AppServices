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
            name = "paC_Agro_GruposUltimaMilla",
            procedureName = "paC_Agro_GruposUltimaMilla",
            resultClasses = CAgro_GruposUltimaMillaEntity.class)
})
public class CAgro_GruposUltimaMillaEntity {

    @Id
    @JsonProperty("ID_CARRO")
    public Integer ID_CARRO;

    @JsonProperty("CD_CNSCTVO")
    public Integer CD_CNSCTVO;

    @JsonProperty("IdSector")
    public Integer IdSector;

    @JsonProperty("Usucodig")
    public Integer Usucodig;

    @JsonProperty("NombreCliente")
    public String NombreCliente;

    @JsonProperty("Telefono")
    public String Telefono;

    @JsonProperty("DireccionEntrega")
    public String DireccionEntrega;

    @JsonProperty("CoordenadasEntrega")
    public String CoordenadasEntrega;

    @JsonProperty("ObsEntrega")
    public String ObsEntrega;

    @JsonProperty("UndProd")
    public Integer UndProd;

    @JsonProperty("pesoUndProducto")
    public String pesoUndProducto;

    @JsonProperty("pesoTotalUnd")
    public String pesoTotalUnd;

    @JsonProperty("DescToppings")
    public String DescToppings;

    @JsonProperty("PesoTotalTpping")
    public String PesoTotalTpping;

    @JsonProperty("PesoTotalCarga")
    public String PesoTotalCarga;

    @JsonProperty("IdTipoUsuCompra")
    public Integer IdTipoUsuCompra;

    @JsonProperty("DesTipoUsuCompra")
    public String DesTipoUsuCompra;

    @JsonProperty("Observaciones")
    public String Observaciones;

    @JsonProperty("GrupoMilla")
    public String GrupoMilla;

    @JsonProperty("NombreGrupoMilla")
    public String NombreGrupoMilla;
}
