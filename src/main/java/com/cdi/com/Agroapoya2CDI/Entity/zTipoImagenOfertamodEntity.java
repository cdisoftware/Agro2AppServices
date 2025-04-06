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
            name = "z_TipoImagenOferta_mod",
            procedureName = "z_TipoImagenOferta_mod",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})

public class zTipoImagenOfertamodEntity {

    @Id
    @JsonProperty("IdImagen")
    public Integer IdImagen;

    @JsonProperty("IdProducto")
    public Integer IdProducto;

    @JsonProperty("Nombre")
    public String Nombre;

    @JsonProperty("Orden")
    public Integer Orden;

    @JsonProperty("TipoEstado")
    public Integer TipoEstado;
}
