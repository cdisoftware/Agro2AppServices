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
            name = "z_cuponesDescuento_mod",
            procedureName = "z_cuponesDescuento_mod",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})

public class zcuponesDescuentomodeEntity {

    @Id
    @JsonProperty("IdCupon")
    public Integer IdCupon;

    @JsonProperty("IdTipoCupon")
    public Integer IdTipoCupon;

    @JsonProperty("CodigoMostrar")
    public String CodigoMostrar;

    @JsonProperty("Descripcion")
    public String Descripcion;

    @JsonProperty("DescuentoAplicable")
    public Integer DescuentoAplicable;

    @JsonProperty("ApartirValor")
    public Integer ApartirValor;

    @JsonProperty("TipoPersonaAplicable")
    public Integer TipoPersonaAplicable;

    @JsonProperty("FechaInicio")
    public Integer FechaInicio;

    @JsonProperty("FechaFin")
    public Integer FechaFin;

    @JsonProperty("TipoEstado")
    public Integer TipoEstado;

    @JsonProperty("IdOferta")
    public Integer IdOferta;

    @JsonProperty("ScriptAdicional")
    public Integer ScriptAdicional;

    @JsonProperty("IdRegalo")
    public Integer IdRegalo;
}
