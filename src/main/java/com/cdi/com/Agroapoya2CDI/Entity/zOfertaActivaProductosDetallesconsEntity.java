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
            name = "z_OfertaActivaProductosDetalles_cons",
            procedureName = "z_OfertaActivaProductosDetalles_cons",
            resultClasses = zOfertaActivaProductosDetallesconsEntity.class)
})

public class zOfertaActivaProductosDetallesconsEntity {

    @Id
    @JsonProperty("id")
    public Integer id;

    @JsonProperty("IdProducto")
    public Integer IdProducto;

    @JsonProperty("TipoPresentacion")
    public Integer TipoPresentacion;

    @JsonProperty("ValorReal")
    public Integer ValorReal;

    @JsonProperty("ValorReferencia")
    public Integer ValorReferencia;

    @JsonProperty("UnidadesDisponibles")
    public Integer UnidadesDisponibles;

    @JsonProperty("MaximoUnidades")
    public Integer MaximoUnidades;

    @JsonProperty("Orden")
    public Integer Orden;

    @JsonProperty("TipoEstado")
    public Integer TipoEstado;
    
        @JsonProperty("IdOferta")
    public Integer IdOferta;

    @JsonProperty("DescPresentacion")
    public String DescPresentacion;
}
