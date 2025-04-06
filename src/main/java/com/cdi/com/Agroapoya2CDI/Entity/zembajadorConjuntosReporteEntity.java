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
            name = "z_embajadorConjuntosReporte",
            procedureName = "z_embajadorConjuntosReporte",
            resultClasses = zembajadorConjuntosReporteEntity.class)
})

public class zembajadorConjuntosReporteEntity {

    @Id
    @JsonProperty("IdUsuarioEmbajador")
    public Integer IdUsuarioEmbajador;

    @JsonProperty("NombrePersona")
    public String NombrePersona;

    @JsonProperty("CorreoPersona")
    public String CorreoPersona;

    @JsonProperty("CelularPersona")
    public String CelularPersona;

    @JsonProperty("FechaCreacion")
    public String FechaCreacion;

    @JsonProperty("id_manychat")
    public String id_manychat;

    @JsonProperty("DRCCION")
    public String DRCCION;

    @JsonProperty("CMPLMNTO_DRRCCION")
    public String CMPLMNTO_DRRCCION;

    @JsonProperty("NombreConjunto")
    public String NombreConjunto;

    @JsonProperty("LinkCortoVecino")
    public String LinkCortoVecino;

    @JsonProperty("IdEmbajador")
    public String IdEmbajador;

    @JsonProperty("NumeroVecino")
    public Integer NumeroVecino;

    @JsonProperty("FechaCreacioncomoEmbajador")
    public String FechaCreacioncomoEmbajador;
}
