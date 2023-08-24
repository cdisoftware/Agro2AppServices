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
            name = "paC_CodigosDescuento",
            procedureName = "paC_CodigosDescuento",
            resultClasses = CCodigosDescuentoEntity.class)
})
public class CCodigosDescuentoEntity {

    @Id
    @JsonProperty("codigo_grupo")
    public Integer codigo_grupo;

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
    public String DescuentoAplicable;

    @JsonProperty("Cd_cnsctvo")
    public Integer Cd_cnsctvo;

    @JsonProperty("Estado")
    public Integer Estado;

    @JsonProperty("FechaCreacion")
    public String FechaCreacion;

    @JsonProperty("ApartirValor")
    public String ApartirValor;

}
