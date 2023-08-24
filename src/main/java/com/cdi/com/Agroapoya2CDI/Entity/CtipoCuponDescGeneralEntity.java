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
            name = "paC_tipoCuponDescuentoGeneral",
            procedureName = "paC_tipoCuponDescuentoGeneral",
            resultClasses = CtipoCuponDescGeneralEntity.class)
})
public class CtipoCuponDescGeneralEntity {

    @Id
    @JsonProperty("IdTipoCuponGenral")
    public Integer IdTipoCuponGenral;

    @JsonProperty("NombreCupon")
    public String NombreCupon;

    @JsonProperty("Estado")
    public Integer Estado;
}
