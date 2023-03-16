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
            name = "paT_HoraioTarea",
            procedureName = "paT_HoraioTarea",
            resultClasses = THoraioTareaEntity.class)
})
public class THoraioTareaEntity {

    @Id
    @JsonProperty("IdProgramado")
    public Integer IdProgramado;

    @JsonProperty("Descripcion")
    public String Descripcion;
    
      @JsonProperty("Estado")
    public Integer Estado;
}
