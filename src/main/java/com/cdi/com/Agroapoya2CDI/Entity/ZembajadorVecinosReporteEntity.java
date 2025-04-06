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
            name = "Z_embajadorVecinosReporte",
            procedureName = "Z_embajadorVecinosReporte",
            resultClasses = ZembajadorVecinosReporteEntity.class)
})

public class ZembajadorVecinosReporteEntity {

    @Id
    @JsonProperty("Id")
    public Integer Id;

    @JsonProperty("FechaRelacion")
    public String FechaRelacion;

    @JsonProperty("NombreVecino")
    public String NombreVecino;

    @JsonProperty("CelularVecino")
    public String CelularVecino;

    @JsonProperty("CorreoVecino")
    public String CorreoVecino;

    @JsonProperty("FechaCreacionVecino")
    public String FechaCreacionVecino;

    @JsonProperty("DireccionVecino")
    public String DireccionVecino;

    @JsonProperty("ObservacionRegistroVecino")
    public String ObservacionRegistroVecino;

    @JsonProperty("IdManychatVecino")
    public String IdManychatVecino;

    @JsonProperty("UsucodigEmbajador")
    public Integer UsucodigEmbajador;

    @JsonProperty("ComplementoVecino")
    public String ComplementoVecino;
}
