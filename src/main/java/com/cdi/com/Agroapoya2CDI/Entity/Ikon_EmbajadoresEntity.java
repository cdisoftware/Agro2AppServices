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
            name = "Ikon_Embajadores",
            procedureName = "Ikon_Embajadores",
            resultClasses = Ikon_EmbajadoresEntity.class)
})

public class Ikon_EmbajadoresEntity {

    @Id
    @JsonProperty("IdPersona")
    public Integer IdPersona;
    
    @JsonProperty("NombreEmbajador")
    public String NombreEmbajador;
    
    @JsonProperty("NombreGrupo")
    public String NombreGrupo;
    
    @JsonProperty("FechaCreacion")
    public String FechaCreacion;
    
    @JsonProperty("LinkCorto")
    public String LinkCorto;
    
    @JsonProperty("IdEmbajador")
    public String IdEmbajador;
    
    @JsonProperty("NumeroClientesReferidos")
    public String NumeroClientesReferidos;
    
    @JsonProperty("CelularEmbajador")
    public String CelularEmbajador;
    
    @JsonProperty("CorreoEmbajador")
    public String CorreoEmbajador;
    
    @JsonProperty("IdManychatEmbajador")
    public String IdManychatEmbajador;
    
}
