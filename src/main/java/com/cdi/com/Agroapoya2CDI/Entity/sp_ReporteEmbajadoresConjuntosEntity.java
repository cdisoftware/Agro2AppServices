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
            name = "sp_ReporteEmbajadoresConjuntos",
            procedureName = "sp_ReporteEmbajadoresConjuntos",
            resultClasses = sp_ReporteEmbajadoresConjuntosEntity.class)
})
public class sp_ReporteEmbajadoresConjuntosEntity {

    @Id
    @JsonProperty("UsucodigEmbajador")
    public Integer UsucodigEmbajador;

    @JsonProperty("NombreEmbajador")
    public String NombreEmbajador;

    @JsonProperty("CorreoEmbajador")
    public String CorreoEmbajador;

    @JsonProperty("CelularEmbajador")
    public String CelularEmbajador;

    @JsonProperty("NombreConjunto")
    public String NombreConjunto;
    
     @JsonProperty("LinkEmbajador")
    public String LinkEmbajador;

    @JsonProperty("IdEmbajador")
    public String IdEmbajador;

    @JsonProperty("TipoEmbajador")
    public String TipoEmbajador;

    @JsonProperty("FechaCreacionConjunto")
    public String FechaCreacionConjunto;
    
    @JsonProperty("FechaCreacionEmbajador")
    public String FechaCreacionEmbajador;

}
