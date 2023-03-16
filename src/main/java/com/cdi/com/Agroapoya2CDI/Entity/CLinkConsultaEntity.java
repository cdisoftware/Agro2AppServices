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
            name = "paCLinkConsulta",
            procedureName = "paCLinkConsulta",
            resultClasses = CLinkConsultaEntity.class)
})
public class CLinkConsultaEntity {

    @Id
    @JsonProperty("respuesta")
    public String respuesta;
}
