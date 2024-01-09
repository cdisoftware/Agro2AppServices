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
            name = "admin_reporteTransporte",
            procedureName = "admin_reporteTransporte",
            resultClasses = adreporteTransportEntity.class)
})

public class adreporteTransportEntity {

    @Id
    @JsonProperty("CD_CNSCTVO")
    public Integer CD_CNSCTVO;

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

}
