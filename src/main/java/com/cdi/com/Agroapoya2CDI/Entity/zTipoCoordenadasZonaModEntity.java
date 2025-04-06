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
            name = "z_TipoCoordenadas_Zona_Mod",
            procedureName = "z_TipoCoordenadas_Zona_Mod",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})

public class zTipoCoordenadasZonaModEntity {

    @Id
    @JsonProperty("Id")
    public Integer Id;

    @JsonProperty("IdZona")
    public Integer IdZona;

    @JsonProperty("Latitud")
    public String Latitud;

    @JsonProperty("Longitud")
    public String Longitud;
}
