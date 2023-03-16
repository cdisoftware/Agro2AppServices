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
            name = "pac_GeneracionQuery",
            procedureName = "pac_GeneracionQuery",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class CGeneracionQueryEntity {

    @Id
    @JsonProperty("Idplantilla")
    public Integer Idplantilla;

    @JsonProperty("IdSector")
    public Integer IdSector;

    @JsonProperty("cd_cnctivo")
    public Integer cd_cnctivo;

    @JsonProperty("tipoUsuario")
    public Integer tipoUsuario;
}
