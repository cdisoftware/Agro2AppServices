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
            name = "z_OfertaActivaZonas_Cons",
            procedureName = "z_OfertaActivaZonas_Cons",
            resultClasses = zOfertaActivaZonasConsEntity.class)
})

public class zOfertaActivaZonasConsEntity {

    @Id
    @JsonProperty("Id")
    public Integer Id;

    @JsonProperty("IdOfertaActivaInformacion")
    public Integer IdOfertaActivaInformacion;

    @JsonProperty("TipoZona")
    public Integer TipoZona;

    @JsonProperty("Descripcion")
    public String Descripcion;
}
