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
            name = "z_fiadoUsuario",
            procedureName = "z_fiadoUsuario",
            resultClasses = zfiadoUsuarioEntity.class)
})

public class zfiadoUsuarioEntity {

    @Id
    @JsonProperty("Id")
    public Integer Id;

    @JsonProperty("ValorFiado")
    public String ValorFiado;
}
