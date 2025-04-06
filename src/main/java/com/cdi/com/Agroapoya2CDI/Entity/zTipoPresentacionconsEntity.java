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
            name = "z_TipoPresentacion_cons",
            procedureName = "z_TipoPresentacion_cons",
            resultClasses = zTipoPresentacionconsEntity.class)
})

public class zTipoPresentacionconsEntity {

    @Id
    @JsonProperty("IdTipo")
    public Integer IdTipo;

    @JsonProperty("Descripcion")
    public String Descripcion;

    @JsonProperty("TipoPesoUnidades")
    public Integer TipoPesoUnidades;

    @JsonProperty("DescPesoUnidades")
    public String DescPesoUnidades;

    @JsonProperty("Peso")
    public Integer Peso;

    @JsonProperty("Unidades")
    public Integer Unidades;

    @JsonProperty("TipoEstado")
    public Integer TipoEstado;

    @JsonProperty("DescEstado")
    public String DescEstado;
}
