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
            name = "movile_ConsulatGeneralOferta",
            procedureName = "movile_ConsulatGeneralOferta",
            resultClasses = movileConsulatGeneralOfertaEntity.class)
})
public class movileConsulatGeneralOfertaEntity {

    @Id
    @JsonProperty("id_carro")
    public Integer id_carro;

    @JsonProperty("NombrePersona")
    public String NombrePersona;

    @JsonProperty("DireccionEntrega")
    public String DireccionEntrega;

    @JsonProperty("CoordenadasEntrega")
    public String CoordenadasEntrega;

    @JsonProperty("CelularPersona")
    public String CelularPersona;

    @JsonProperty("ValorTotalPagar")
    public String ValorTotalPagar;

    @JsonProperty("ValorSubTotal")
    public String ValorSubTotal;

    @JsonProperty("ValorDomicilio")
    public String ValorDomicilio;

    @JsonProperty("USUCODIG")
    public Integer USUCODIG;

    @JsonProperty("id_manychat")
    public String id_manychat;

    @JsonProperty("CD_CNSCTVO")
    public Integer CD_CNSCTVO;

    @JsonProperty("IdSector")
    public Integer IdSector;

    @JsonProperty("complementoDireccion")
    public String complementoDireccion;

    @JsonProperty("IdCondutor")
    public String IdCondutor;

    @JsonProperty("IdMedioPago")
    public String IdMedioPago;
}
