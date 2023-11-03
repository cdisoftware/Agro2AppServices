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
            name = "admin_usuarioMapaCalor",
            procedureName = "admin_usuarioMapaCalor",
            resultClasses = adUsuarioMapaCalorEntity.class)
})
public class adUsuarioMapaCalorEntity {

    @Id
    @JsonProperty("Usucodig")
    public Integer Usucodig;

    @JsonProperty("NombrePersona")
    public String NombrePersona;

    @JsonProperty("CoordenadaPersona")
    public String CoordenadaPersona;

    @JsonProperty("CelularPersona")
    public String CelularPersona;

    @JsonProperty("DireccionPersona")
    public String DireccionPersona;

}
