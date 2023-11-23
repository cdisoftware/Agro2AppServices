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
            name = "admin_seguimientoFiltroFecha",
            procedureName = "admin_seguimientoFiltroFecha",
            resultClasses = adSeguimientoFiltroFechaEntity.class)
})
public class adSeguimientoFiltroFechaEntity {

    @Id
    @JsonProperty("idgrupomilla")
    public Integer idgrupomilla;

    @JsonProperty("NombreGrupo")
    public String NombreGrupo;

    @JsonProperty("FechaEntrega")
    public String FechaEntrega;

    @JsonProperty("UbicacionRecoge")
    public String UbicacionRecoge;

    @JsonProperty("UbicacionEntrega")
    public String UbicacionEntrega;

    @JsonProperty("NMBRE_CNDCTOR")
    public String NMBRE_CNDCTOR;

    @JsonProperty("TEL_CNDCTOR")
    public String TEL_CNDCTOR;

    @JsonProperty("FechaIncio")
    public String FechaIncio;

    @JsonProperty("FechaFin")
    public String FechaFin;
}
