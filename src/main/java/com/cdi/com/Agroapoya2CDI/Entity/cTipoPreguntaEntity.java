
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
            name = "pac_TipoPregunta",
            procedureName = "pac_TipoPregunta",
            resultClasses = cTipoPreguntaEntity.class)
})
public class cTipoPreguntaEntity {
       @Id
    @JsonProperty("idPregunta")
    public Integer idPregunta;

    @JsonProperty("NombrePregunta")
    public String NombrePregunta;
}
