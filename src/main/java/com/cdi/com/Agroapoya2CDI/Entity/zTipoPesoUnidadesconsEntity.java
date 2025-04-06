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
            name = "z_TipoPesoUnidades_cons",
            procedureName = "z_TipoPesoUnidades_cons",
            resultClasses = zTipoPesoUnidadesconsEntity.class)
})

public class zTipoPesoUnidadesconsEntity {

    @Id
    @JsonProperty("IdTipo")
    public Integer IdTipo;

    @JsonProperty("Descripcion")
    public String Descripcion;

    @JsonProperty("TipoEstado")
    public Integer TipoEstado;

    @JsonProperty("DescTipoEstado")
    public String DescTipoEstado;
}
