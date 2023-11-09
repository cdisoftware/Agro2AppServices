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
            name = "tipo_ConsultaContacto",
            procedureName = "tipo_ConsultaContacto",
            resultClasses = tipoConsContactEntity.class)
})
public class tipoConsContactEntity {

    @Id
    @JsonProperty("Id")
    public Integer Id;

    @JsonProperty("DesTipoContacto")
    public String DesTipoContacto;
}
