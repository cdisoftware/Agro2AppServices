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
            name = "z_TipoPresentacion_mod",
            procedureName = "z_TipoPresentacion_mod",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})

public class zTipoPresentacionmodEntity {

    @Id
    @JsonProperty("Descripcion")
    public String Descripcion;

    @JsonProperty("TipoPesoUnidades")
    public Integer TipoPesoUnidades;

    @JsonProperty("Peso")
    public Integer Peso;

    @JsonProperty("Unidades")
    public Integer Unidades;

    @JsonProperty("TipoEstado")
    public Integer TipoEstado;
}
