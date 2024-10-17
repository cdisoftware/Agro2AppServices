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
            name = "z_PersonasAplicaRegalo_Cons",
            procedureName = "z_PersonasAplicaRegalo_Cons",
            resultClasses = zPersonasAplicaRegaloConsEntity.class)
})

public class zPersonasAplicaRegaloConsEntity {

    @Id
    @JsonProperty("IdTipo")
    public Integer IdTipo;

    @JsonProperty("Descripcion")
    public String Descripcion;

    @JsonProperty("TipoEstado")
    public Integer TipoEstado;

    @JsonProperty("DesEstado")
    public String DesEstado;
}
