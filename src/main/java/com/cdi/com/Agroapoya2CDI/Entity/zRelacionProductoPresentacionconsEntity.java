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
            name = "z_RelacionProductoPresentacion_cons",
            procedureName = "z_RelacionProductoPresentacion_cons",
            resultClasses = zRelacionProductoPresentacionconsEntity.class)
})

public class zRelacionProductoPresentacionconsEntity {

    @Id
    @JsonProperty("IdTipo")
    public Integer IdTipo;

    @JsonProperty("TipoPresentacion")
    public Integer TipoPresentacion;

    @JsonProperty("Descripcion")
    public String Descripcion;

}
