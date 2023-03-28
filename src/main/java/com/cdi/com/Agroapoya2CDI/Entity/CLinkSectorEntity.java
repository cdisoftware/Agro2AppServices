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
            name = "paCLinkSectorConsulta",
            procedureName = "paCLinkSectorConsulta",
            resultClasses = CLinkSectorEntity.class)
})
public class CLinkSectorEntity {

    @Id
    @JsonProperty("id")
    public Integer id;

    @JsonProperty("Tipo_Link")
    public Integer Tipo_Link;

    @JsonProperty("link_corto")
    public String link_corto;

    @JsonProperty("link_largo")
    public String link_largo;
}
