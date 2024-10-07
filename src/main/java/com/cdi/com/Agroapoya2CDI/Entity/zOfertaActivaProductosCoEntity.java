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
            name = "z_OfertaActivaProductos_Cons",
            procedureName = "z_OfertaActivaProductos_Cons",
            resultClasses = zOfertaActivaProductosCoEntity.class)
})
public class zOfertaActivaProductosCoEntity {

    @Id
    @JsonProperty("id")
    public Integer id;

    @JsonProperty("FechaCreacion")
    public String FechaCreacion;

    @JsonProperty("FechaFin")
    public String FechaFin;

    @JsonProperty("FechaEntrega")
    public String FechaEntrega;

    @JsonProperty("TipoOferta")
    public Integer TipoOferta;

    @JsonProperty("DesTipoOferta")
    public String DesTipoOferta;

    @JsonProperty("TipoEstadoOferta")
    public Integer TipoEstadoOferta;

    @JsonProperty("DesEstadoOferta")
    public String DesEstadoOferta;
}
