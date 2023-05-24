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
            name = "paC_NuevosTransApp",
            procedureName = "paC_NuevosTransApp",
            resultClasses = CNuevosTransAppEntity.class)
})
public class CNuevosTransAppEntity {

    @Id
    @JsonProperty("Id")
    public Integer Id;

    @JsonProperty("Cd_cnsctvo")
    public Integer Cd_cnsctvo;

    @JsonProperty("idSector")
    public Integer idSector;

    @JsonProperty("descSector")
    public String descSector;

    @JsonProperty("idMunicipioLlegada")
    public Integer idMunicipioLlegada;

    @JsonProperty("DescCidudadLlegada")
    public String DescCidudadLlegada;

    @JsonProperty("idDeptoLlegada")
    public Integer idDeptoLlegada;

    @JsonProperty("DescDeptoLlegada")
    public String DescDeptoLlegada;

    @JsonProperty("idMunicipioOrigen")
    public Integer idMunicipioOrigen;

    @JsonProperty("DescCidudadOrigen")
    public String DescCidudadOrigen;

    @JsonProperty("idDeptoOrigen")
    public Integer idDeptoOrigen;

    @JsonProperty("DescDeptoOrigen")
    public String DescDeptoOrigen;

    @JsonProperty("COORDENADAS_PRCLA")
    public String COORDENADAS_PRCLA;

    @JsonProperty("UBCCION_PRCLA")
    public String UBCCION_PRCLA;

    @JsonProperty("unidades")
    public String unidades;

    @JsonProperty("ValorFlete")
    public String ValorFlete;

    @JsonProperty("ValorFleteForm")
    public String ValorFleteForm;

    @JsonProperty("Producto")
    public String Producto;

    @JsonProperty("DescripcionProducto")
    public String DescripcionProducto;

    @JsonProperty("Tamano")
    public String Tamano;

    @JsonProperty("CondicionEntrega")
    public String CondicionEntrega;

    @JsonProperty("Empaque")
    public String Empaque;

    @JsonProperty("Productor")
    public String Productor;

    @JsonProperty("fechaRecoge")
    public String fechaRecoge;

    @JsonProperty("Imagen")
    public String Imagen;

    @JsonProperty("estadoOferta")
    public Integer estadoOferta;

    @JsonProperty("DescEstado")
    public String DescEstado;

    @JsonProperty("NombreGrupo")
    public String NombreGrupo;

    @JsonProperty("IdGrupo")
    public Integer IdGrupo;

    @JsonProperty("NombreBodega")
    public String NombreBodega;

    @JsonProperty("IdBodega")
    public Integer IdBodega;

    @JsonProperty("coordenadasBodega")
    public String coordenadasBodega;

    @JsonProperty("estadoCarga")
    public Integer estadoCarga;

    @JsonProperty("UbicacionRecoge")
    public String UbicacionRecoge;

    @JsonProperty("NumeroParadas")
    public Integer NumeroParadas;

    @JsonProperty("PesoKilos")
    public String PesoKilos;

    @JsonProperty("UbicacionEntrega")
    public String UbicacionEntrega;

    @JsonProperty("IdEstadoPendi")
    public Integer IdEstadoPendi;

    @JsonProperty("CondPendienEstado")
    public String CondPendienEstado;

}
