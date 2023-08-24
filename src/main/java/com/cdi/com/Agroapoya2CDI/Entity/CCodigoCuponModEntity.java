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
            name = "paC_CodigoCuponMod",
            procedureName = "paC_CodigoCuponMod",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class CCodigoCuponModEntity {

    @Id
    @JsonProperty("IdGrupoAux")
    public Integer IdGrupoAux;

    @JsonProperty("codigo_Mostrar")
    public String codigo_Mostrar;

    @JsonProperty("descripcion")
    public String descripcion;

    @JsonProperty("IdTipoCuponGeneral")
    public Integer IdTipoCuponGeneral;

    @JsonProperty("IdTipoCuponCodigoAplicableGeneral")
    public Integer IdTipoCuponCodigoAplicableGeneral;

    @JsonProperty("FechaInicio")
    public String FechaInicio;

    @JsonProperty("FechaFin")
    public String FechaFin;

    @JsonProperty("DescuentoAplicable")
    public Integer DescuentoAplicable;

    @JsonProperty("Estado")
    public Integer Estado;

    @JsonProperty("ApartirValor")
    public Integer ApartirValor;

    @JsonProperty("scriptAdicional")
    public String scriptAdicional;

}
