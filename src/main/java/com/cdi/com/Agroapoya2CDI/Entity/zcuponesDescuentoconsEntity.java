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
            name = "z_cuponesDescuento_cons",
            procedureName = "z_cuponesDescuento_cons",
            resultClasses = zcuponesDescuentoconsEntity.class)
})

public class zcuponesDescuentoconsEntity {

    @Id
    @JsonProperty("IdTipo")
    public Integer IdTipo;

    @JsonProperty("IdTipoCupon")
    public Integer IdTipoCupon;

    @JsonProperty("DescTipoCupon")
    public String DescTipoCupon;

    @JsonProperty("codigo_Mostrar")
    public String codigo_Mostrar;

    @JsonProperty("Decripcion")
    public String Decripcion;

    @JsonProperty("DescuentoAplicable")
    public Integer DescuentoAplicable;

    @JsonProperty("ApartirValor")
    public Integer ApartirValor;

    @JsonProperty("TipoPersonaAplicable")
    public Integer TipoPersonaAplicable;

    @JsonProperty("DescTipoPersonaAplic")
    public String DescTipoPersonaAplic;

    @JsonProperty("FechaIncio")
    public String FechaIncio;

    @JsonProperty("FechaFin")
    public String FechaFin;

    @JsonProperty("FechaCreacion")
    public String FechaCreacion;

    @JsonProperty("TipoEstado")
    public Integer TipoEstado;

    @JsonProperty("DescTipoEstado")
    public String DescTipoEstado;

    @JsonProperty("scriptAdicional")
    public String scriptAdicional;

    @JsonProperty("IdOferta")
    public Integer IdOferta;

    @JsonProperty("IdRegalo")
    public Integer IdRegalo;
}
