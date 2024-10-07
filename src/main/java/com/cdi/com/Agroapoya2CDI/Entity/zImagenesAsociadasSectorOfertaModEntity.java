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
            name = "z_ImagenesAsociadasSectorOferta_Mod",
            procedureName = "z_ImagenesAsociadasSectorOferta_Mod",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})

public class zImagenesAsociadasSectorOfertaModEntity {

    @Id

    @JsonProperty("IdImagen")
    public Integer IdImagen;

    @JsonProperty("Nombre")
    public String Nombre;

    @JsonProperty("IdOferta")
    public Integer IdOferta;
}
