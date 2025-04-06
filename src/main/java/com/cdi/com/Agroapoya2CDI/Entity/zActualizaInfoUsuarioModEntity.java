package com.cdi.com.Agroapoya2CDI.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import lombok.Data;

@Entity
@Data
@NamedStoredProcedureQueries({
    @NamedStoredProcedureQuery(
            name = "z_ActualizaInfoUsuarioMod",
            procedureName = "z_ActualizaInfoUsuarioMod",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})

public class zActualizaInfoUsuarioModEntity {

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

    @JsonProperty("Correo")
    public String Correo;

    @JsonProperty("Celular")
    public String Celular;

    @JsonProperty("id_manychat")
    public String id_manychat;

    @JsonProperty("Observacion")
    public String Observacion;
}
