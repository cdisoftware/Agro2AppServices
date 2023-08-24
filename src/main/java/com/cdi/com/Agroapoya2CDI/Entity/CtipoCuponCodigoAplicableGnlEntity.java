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
            name = "paC_tipoCuponCodigoAplicableGeneral",
            procedureName = "paC_tipoCuponCodigoAplicableGeneral",
            resultClasses = CtipoCuponCodigoAplicableGnlEntity.class)
})
public class CtipoCuponCodigoAplicableGnlEntity {

    @Id
    @JsonProperty("IdTipoAplicable")
    public Integer IdTipoAplicable;

    @JsonProperty("NombreAplicable")
    public String NombreAplicable;

    @JsonProperty("descripcion")
    public String descripcion;

    @JsonProperty("Estado")
    public Integer Estado;
}
