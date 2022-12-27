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
            name = "paC_RelacionDBasicosSubItemsMod",
            procedureName = "paC_RelacionDBasicosSubItemsMod",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class CRelacionDBasicosSubItemsModEntity {

    @Id
    @JsonProperty("IdDtoBasico")
    public Integer IdDtoBasico;

    @JsonProperty("IdDtoRelacion")
    public Integer IdDtoRelacion;

    @JsonProperty("IdSubitem")
    public Integer IdSubitem;

    @JsonProperty("IdSubitemDos")
    public Integer IdSubitemDos;

}
