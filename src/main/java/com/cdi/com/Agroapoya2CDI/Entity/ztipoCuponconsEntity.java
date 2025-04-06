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
            name = "z_tipoCupon_cons",
            procedureName = "z_tipoCupon_cons",
            resultClasses = ztipoCuponconsEntity.class)
})

public class ztipoCuponconsEntity {

    @Id
    @JsonProperty("IdTipo")
    public Integer IdTipo;

    @JsonProperty("Descripcion")
    public String Descripcion;

    @JsonProperty("TipoEstado")
    public Integer TipoEstado;

    @JsonProperty("DescEstado")
    public String DescEstado;
}
