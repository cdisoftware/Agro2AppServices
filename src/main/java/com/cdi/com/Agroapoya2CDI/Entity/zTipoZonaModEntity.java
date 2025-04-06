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
            name = "z_TipoZona_Mod",
            procedureName = "z_TipoZona_Mod",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})

public class zTipoZonaModEntity {

    @Id
    @JsonProperty("IdSector")
    public Integer IdSector;

    @JsonProperty("IdLocalidad")
    public Integer IdLocalidad;

    @JsonProperty("Descripcion")
    public String Descripcion;

    @JsonProperty("TipoEstado")
    public Integer TipoEstado;
}
