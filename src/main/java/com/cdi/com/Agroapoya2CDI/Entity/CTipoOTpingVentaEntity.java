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
            name = "pac_TipoOTpingVenta",
            procedureName = "pac_TipoOTpingVenta",
            resultClasses = CTipoOTpingVentaEntity.class)
})
public class CTipoOTpingVentaEntity {

    @Id
    @JsonProperty("IdTipo")
    public Integer IdTipo;

    @JsonProperty("Descripcion")
    public String Descripcion;

    @JsonProperty("Observacion")
    public String Observacion;

}
