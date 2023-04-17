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
            name = "paCLinksCPyGMod",
            procedureName = "paCLinksCPyGMod",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class CLinksCPyGModEntity {

    @Id
    @JsonProperty("PRFJO_URL")
    public String PRFJO_URL;

    @JsonProperty("LINK_LARGO")
    public String LINK_LARGO;

    @JsonProperty("COD_DCTO")
    public String COD_DCTO;

    @JsonProperty("TPO_LINK")
    public String TPO_LINK;
}
