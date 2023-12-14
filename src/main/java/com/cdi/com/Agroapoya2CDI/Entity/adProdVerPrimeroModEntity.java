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
            name = "admin_ProdVerPrimeroMod",
            procedureName = "admin_ProdVerPrimeroMod",
            parameters = {
                @StoredProcedureParameter(name = "Repuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class adProdVerPrimeroModEntity {

    @Id
    @JsonProperty("Ancla")
    public Integer Ancla;

    @JsonProperty("IdProducto")
    public Integer IdProducto;

    @JsonProperty("Cd_cnsctvo")
    public Integer Cd_cnsctvo;

    @JsonProperty("Id_Sector")
    public Integer Id_Sector;
}
