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
            name = "z_ConsultarEstadosPagosFiado",
            procedureName = "z_ConsultarEstadosPagosFiado",
            resultClasses = zConsultarEstadosPagosFiadoEntity.class)
})

public class zConsultarEstadosPagosFiadoEntity {

    @Id
    @JsonProperty("Estado")
    public Integer Estado;

    @JsonProperty("Descripcion")
    public String Descripcion;
}
