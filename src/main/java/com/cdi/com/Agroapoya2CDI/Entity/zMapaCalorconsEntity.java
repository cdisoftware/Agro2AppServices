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
            name = "z_MapaCalor_cons",
            procedureName = "z_MapaCalor_cons",
            resultClasses = zMapaCalorconsEntity.class)
})

public class zMapaCalorconsEntity {

    @Id
    @JsonProperty("usucodig")
    public Integer usucodig;

    @JsonProperty("TipoPersona")
    public Integer TipoPersona;

    @JsonProperty("desTipoPersona")
    public String desTipoPersona;

    @JsonProperty("FechaCreacion")
    public String FechaCreacion;

    @JsonProperty("Observacion")
    public String Observacion;

    @JsonProperty("TipoRegistro")
    public Integer TipoRegistro;

    @JsonProperty("DescTipoRegistro")
    public String DescTipoRegistro;

    @JsonProperty("TipoDepto")
    public Integer TipoDepto;

    @JsonProperty("DesTipoDepto")
    public String DesTipoDepto;

    @JsonProperty("TipoCiudad")
    public Integer TipoCiudad;

    @JsonProperty("DescTipoCiudad")
    public String DescTipoCiudad;

    @JsonProperty("Nombre")
    public String Nombre;

    @JsonProperty("Correo")
    public String Correo;

    @JsonProperty("TipoNotificacion")
    public Integer TipoNotificacion;

    @JsonProperty("Telefono")
    public String Telefono;

    @JsonProperty("TipoDocumento")
    public Integer TipoDocumento;

    @JsonProperty("DescTipoDocumento")
    public String DescTipoDocumento;

    @JsonProperty("Id_manychat")
    public String Id_manychat;

    @JsonProperty("DesTipoLocalidad")
    public String DesTipoLocalidad;

    @JsonProperty("Coordenadas")
    public String Coordenadas;

    @JsonProperty("Direccion")
    public String Direccion;

    @JsonProperty("CompleDireccion")
    public String CompleDireccion;
}
