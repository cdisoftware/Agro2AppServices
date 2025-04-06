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
            name = "z_ValidaUsuario",
            procedureName = "z_ValidaUsuario",
            resultClasses = zValidaUsuarioEntity.class)
})

public class zValidaUsuarioEntity {

    @Id
    @JsonProperty("IdUsuario")
    public Integer IdUsuario;

    @JsonProperty("NombrePersona")
    public String NombrePersona;

    @JsonProperty("Direccion")
    public String Direccion;

    @JsonProperty("ComplementoDireccion")
    public String ComplementoDireccion;

    @JsonProperty("Coordenadas")
    public String Coordenadas;

    @JsonProperty("UsuarioTraza")
    public String UsuarioTraza;

    @JsonProperty("LocalidadPrincipal")
    public String LocalidadPrincipal;

    @JsonProperty("fechaRegistro")
    public String fechaRegistro;

    @JsonProperty("Correo")
    public String Correo;

    @JsonProperty("Celular")
    public String Celular;

    @JsonProperty("Observacion")
    public String Observacion;

    @JsonProperty("id_manychat")
    public String id_manychat;

    @JsonProperty("Ciudad")
    public String Ciudad;

    @JsonProperty("Depto")
    public String Depto;
}
