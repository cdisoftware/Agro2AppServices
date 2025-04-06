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
            name = "z_PersonaValidador",
            procedureName = "z_PersonaValidador",
            resultClasses = zPersonaValidadorEntity.class)
})

public class zPersonaValidadorEntity {

    @Id
    @JsonProperty("Id")
    public Integer Id;

    @JsonProperty("Nombre")
    public String Nombre;

}
