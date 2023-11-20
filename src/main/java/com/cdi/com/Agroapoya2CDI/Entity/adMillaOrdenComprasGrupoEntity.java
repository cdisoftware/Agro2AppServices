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
            name = "admin_MillaOrdenComprasGrupo",
            procedureName = "admin_MillaOrdenComprasGrupo",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class adMillaOrdenComprasGrupoEntity {

    @Id
    @JsonProperty("IdGrupo")
    public Integer IdGrupo;

    @JsonProperty("CadenaOrden")
    public String CadenaOrden;
}
