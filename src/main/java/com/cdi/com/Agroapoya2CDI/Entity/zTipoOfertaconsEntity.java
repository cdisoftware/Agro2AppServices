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
            name = "z_TipoOferta_cons",
            procedureName = "z_TipoOferta_cons",
            resultClasses = zTipoOfertaconsEntity.class)
})

public class zTipoOfertaconsEntity {

    @Id
    @JsonProperty("idtipo")
    public Integer idtipo;

    @JsonProperty("DescOferta")
    public String DescOferta;

    @JsonProperty("TipoEstado")
    public Integer TipoEstado;

    @JsonProperty("DescEstado")
    public String DescEstado;
}
