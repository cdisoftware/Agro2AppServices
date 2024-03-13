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
            name = "admin_reporteCantidadTotalxLibras",
            procedureName = "admin_reporteCantidadTotalxLibras",
            resultClasses = adreporteCantidadTotalxLibrasEntity.class)
})
public class adreporteCantidadTotalxLibrasEntity {

    @Id
    @JsonProperty("id")
    public Integer id;

    @JsonProperty("Producto")
    public String Producto;

    @JsonProperty("PesoTotal")
    public Integer PesoTotal;
}
