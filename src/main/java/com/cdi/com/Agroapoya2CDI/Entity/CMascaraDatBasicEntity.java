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
            name = "paC_MascaraDatosBasicos",
            procedureName = "paC_MascaraDatosBasicos",
            resultClasses = CMascaraDatBasicEntity.class)
})
public class CMascaraDatBasicEntity {

    @Id
    @JsonProperty("IdDatoBasico")
    public Integer IdDatoBasico;

    @JsonProperty("MID")
    public String MID;

    @JsonProperty("MDSCRIPCION")
    public String MDSCRIPCION;

    @JsonProperty("MDSCRIPCIONDOS")
    public String MDSCRIPCIONDOS;

    @JsonProperty("MESTADO")
    public String MESTADO;

}
