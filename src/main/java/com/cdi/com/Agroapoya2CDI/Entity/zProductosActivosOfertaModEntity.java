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
            name = "z_ProductosActivosOferta_Mod",
            procedureName = "z_ProductosActivosOferta_Mod",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})

public class zProductosActivosOfertaModEntity {

    @Id
    @JsonProperty("IdOferta")
    public Integer IdOferta;

    @JsonProperty("TipoProducto")
    public Integer TipoProducto;

    @JsonProperty("Orden")
    public Integer Orden;

    @JsonProperty("TipoEstado")
    public Integer TipoEstado;

    @JsonProperty("UsucodigProductor")
    public Integer UsucodigProductor;

}
