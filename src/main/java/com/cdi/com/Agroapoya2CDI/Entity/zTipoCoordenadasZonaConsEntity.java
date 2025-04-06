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
            name = "z_TipoCoordenadas_ZonaCons",
            procedureName = "z_TipoCoordenadas_ZonaCons",
            resultClasses = zTipoCoordenadasZonaConsEntity.class)
})

public class zTipoCoordenadasZonaConsEntity {

    @Id
    @JsonProperty("Id")
    public Integer Id;

    @JsonProperty("Latitud")
    public String Latitud;

    @JsonProperty("Longitud")
    public String Longitud;

    @JsonProperty("Orden")
    public String Orden;
}
