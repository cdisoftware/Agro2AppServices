package com.cdi.com.Agroapoya2CDI.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import lombok.Data;

@Entity
@Data
@NamedStoredProcedureQueries({
    @NamedStoredProcedureQuery(
            name = "paCActualizaImagenSectorMod",
            procedureName = "paCActualizaImagenSectorMod",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class CActImgSectorModEntity {

    @Id
    @JsonProperty("ID_SECTOR")
    public Integer ID_SECTOR;

    @JsonProperty("NOMBRE_IMG")
    public String NOMBRE_IMG;
}
