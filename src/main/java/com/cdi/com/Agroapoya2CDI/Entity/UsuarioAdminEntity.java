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
            name = "paA_UsuarioAdmin",
            procedureName = "paA_UsuarioAdmin",
            resultClasses = UsuarioAdminEntity.class)
})
public class UsuarioAdminEntity {

    @Id
    @JsonProperty("Usucodig")
    public Integer Usucodig;

    @JsonProperty("NombrePersona")
    public String NombrePersona;

    @JsonProperty("ApellidoPersona")
    public String ApellidoPersona;

    @JsonProperty("nombreCompleto")
    public String nombreCompleto;

    @JsonProperty("CorreoPersona")
    public String CorreoPersona;

    @JsonProperty("CelularPersona")
    public String CelularPersona;

    @JsonProperty("ComentarioRegistro")
    public String ComentarioRegistro;
    
     @JsonProperty("Token")
    public String Token;
}
