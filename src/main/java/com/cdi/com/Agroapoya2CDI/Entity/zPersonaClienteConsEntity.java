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
            name = "z_PersonaClienteCons",
            procedureName = "z_PersonaClienteCons",
            resultClasses = zPersonaClienteConsEntity.class)
})

public class zPersonaClienteConsEntity {

    @Id
    @JsonProperty("Usucodig")
    public Integer Usucodig;

    @JsonProperty("TipoPersona")
    public Integer TipoPersona;

    @JsonProperty("DesTipoPersona")
    public String DesTipoPersona;

    @JsonProperty("FechaCreacion")
    public String FechaCreacion;

    @JsonProperty("Observacion")
    public String Observacion;

    @JsonProperty("TipoRegistro")
    public Integer TipoRegistro;

    @JsonProperty("DesTipoRegistro")
    public String DesTipoRegistro;

    @JsonProperty("TipoPais")
    public Integer TipoPais;

    @JsonProperty("DesTipoPais")
    public String DesTipoPais;

    @JsonProperty("TipoCiudad")
    public Integer TipoCiudad;

    @JsonProperty("DesCiudad")
    public String DesCiudad;

    @JsonProperty("TipoDepto")
    public Integer TipoDepto;

    @JsonProperty("DesTipoDepto")
    public String DesTipoDepto;

    @JsonProperty("Nombre")
    public String Nombre;

    @JsonProperty("Correo")
    public String Correo;

    @JsonProperty("Telefono")
    public String Telefono;

    @JsonProperty("TipoDocumento")
    public Integer TipoDocumento;

    @JsonProperty("DesTipoDocumento")
    public String DesTipoDocumento;

    @JsonProperty("Documento")
    public String Documento;

    @JsonProperty("Token")
    public String Token;

    @JsonProperty("Id_manychat")
    public String Id_manychat;

    @JsonProperty("Coordenadas")
    public String Coordenadas;

    @JsonProperty("Direccion")
    public String Direccion;

    @JsonProperty("CompleDireccion")
    public String CompleDireccion;

    @JsonProperty("NumCompras")
    public String NumCompras;

    @JsonProperty("IdLocalidad")
    public String IdLocalidad;

    @JsonProperty("DesLocalidad")
    public String DesLocalidad;
}
