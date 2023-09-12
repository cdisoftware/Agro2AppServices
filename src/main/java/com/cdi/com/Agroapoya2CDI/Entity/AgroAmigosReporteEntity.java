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
            name = "paC_AgroAmigosReporte",
            procedureName = "paC_AgroAmigosReporte",
            resultClasses = AgroAmigosReporteEntity.class)
})
public class AgroAmigosReporteEntity {

    @Id
    @JsonProperty("CD_CNSCTVO")
    public Integer CD_CNSCTVO;

    @JsonProperty("Producto")
    public String Producto;

    @JsonProperty("FechaRegistro")
    public String FechaRegistro;

    @JsonProperty("AgroAmigos")
    public String AgroAmigos;

}
