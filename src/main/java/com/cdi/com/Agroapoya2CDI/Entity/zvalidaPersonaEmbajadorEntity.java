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
            name = "z_validaPersonaEmbajador",
            procedureName = "z_validaPersonaEmbajador",
            resultClasses = zvalidaPersonaEmbajadorEntity.class)
})

public class zvalidaPersonaEmbajadorEntity {

    @Id
    @JsonProperty("IdUsuario")
    public Integer IdUsuario;

    @JsonProperty("NombrePersona")
    public String NombrePersona;

    @JsonProperty("CelularPersona")
    public String CelularPersona;

    @JsonProperty("CorreoPersona")
    public String CorreoPersona;

    @JsonProperty("Direccion")
    public String Direccion;

    @JsonProperty("ComplemetoDireccion")
    public String ComplemetoDireccion;

    @JsonProperty("IdManyChat")
    public String IdManyChat;

    @JsonProperty("Coordenadas")
    public String Coordenadas;

    @JsonProperty("NumeroCompras")
    public Integer NumeroCompras;

    @JsonProperty("NombreConjunto")
    public String NombreConjunto;

    @JsonProperty("IdEmbajador")
    public String IdEmbajador;

    @JsonProperty("LinkCortoCompartir")
    public String LinkCortoCompartir;
}
