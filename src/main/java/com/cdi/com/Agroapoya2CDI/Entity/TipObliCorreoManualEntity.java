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
            name = "Agro_TipObliCorreoManual",
            procedureName = "Agro_TipObliCorreoManual",
            resultClasses = TipObliCorreoManualEntity.class)
})
public class TipObliCorreoManualEntity {

    @Id
    @JsonProperty("Id")
    public Integer Id;

    @JsonProperty("Descripcion")
    public String Descripcion;

    @JsonProperty("IdPlantilla")
    public String IdPlantilla;

}
