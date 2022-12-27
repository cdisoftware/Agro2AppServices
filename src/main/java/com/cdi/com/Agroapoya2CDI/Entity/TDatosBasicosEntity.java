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
            name = "paT_DatosBasicos",
            procedureName = "paT_DatosBasicos",
            resultClasses = TDatosBasicosEntity.class)
})
public class TDatosBasicosEntity {

    @Id
    @JsonProperty("IdDatoBasico")
    public Integer IdDatoBasico;

    @JsonProperty("IdModulo")
    public Integer IdModulo;

    @JsonProperty("Nombre")
    public String Nombre;

    @JsonProperty("Descripcion")
    public String Descripcion;
}
