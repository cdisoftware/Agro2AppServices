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
            name = "paC_EjecutaSenteciaSQL",
            procedureName = "paC_EjecutaSenteciaSQL",
            resultClasses = CEjecutaSenteciaSQLEntity.class)
})
public class CEjecutaSenteciaSQLEntity {

    @Id
    @JsonProperty("ID")
    public Integer ID;

    @JsonProperty("USUCODIG")
    public Integer USUCODIG;

    @JsonProperty("USUARIO")
    public String USUARIO;

    @JsonProperty("CELULAR")
    public String CELULAR;

    @JsonProperty("ID_MANYCHAT")
    public String ID_MANYCHAT;

    @JsonProperty("MSJ_AGROAMIGO")
    public String MSJ_AGROAMIGO;

    @JsonProperty("ComplementoLink")
    public String ComplementoLink;
}
