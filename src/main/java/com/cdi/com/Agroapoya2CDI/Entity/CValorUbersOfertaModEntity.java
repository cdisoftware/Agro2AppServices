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
            name = "paC_ValorUbersOfertaMod",
            procedureName = "paC_ValorUbersOfertaMod",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class CValorUbersOfertaModEntity {

    @Id
    @JsonProperty("ValorTrans")
    public Integer ValorTrans;

    @JsonProperty("cd_cnctvo")
    public Integer cd_cnctvo;

    @JsonProperty("idSector")
    public Integer idSector;
    
    @JsonProperty("IdGrupo")
    public Integer IdGrupo;

}
