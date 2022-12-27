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
            name = "paC_RelacionDatosBasicos",
            procedureName = "paC_RelacionDatosBasicos",
            resultClasses = CRelacionDatosBasicosEntity.class)
})
public class CRelacionDatosBasicosEntity {

    @Id
    @JsonProperty("IdDatoBasico")
    public Integer IdDatoBasico;

    @JsonProperty("Nombre")
    public String Nombre;

    @JsonProperty("Descripcion")
    public String Descripcion;
}
