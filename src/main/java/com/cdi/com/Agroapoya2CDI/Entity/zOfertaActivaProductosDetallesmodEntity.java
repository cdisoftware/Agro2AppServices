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
            name = "z_OfertaActivaProductosDetalles_mod",
            procedureName = "z_OfertaActivaProductosDetalles_mod",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})

public class zOfertaActivaProductosDetallesmodEntity {

    @Id
    @JsonProperty("IdOferta")
    public Integer IdOferta;

    @JsonProperty("IdProducto")
    public Integer IdProducto;

    @JsonProperty("TipoPresentacion")
    public Integer TipoPresentacion;

    @JsonProperty("ValorReal")
    public String ValorReal;

    @JsonProperty("ValorReferencia")
    public String ValorReferencia;

    @JsonProperty("UnidadesDisponibles")
    public Integer UnidadesDisponibles;

    @JsonProperty("MaximoUnidades")
    public Integer MaximoUnidades;

    @JsonProperty("Orden")
    public Integer Orden;

    @JsonProperty("TipoEstado")
    public Integer TipoEstado;
}
