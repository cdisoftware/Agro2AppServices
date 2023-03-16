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
            name = "pa_CTextosOfertaConsulta",
            procedureName = "pa_CTextosOfertaConsulta",
            resultClasses = pa_CTextosOfertaConsultaEntity.class)
})
public class pa_CTextosOfertaConsultaEntity {

    @Id
    @JsonProperty("idCorreo")
    public String idCorreo;
    
    @JsonProperty("ImgCorreo")
    public String ImgCorreo;
    
    @JsonProperty("TextoCorreo")
    public String TextoCorreo;
    
    @JsonProperty("TextoWhat")
    public String TextoWhat;
    
    @JsonProperty("cd_cnctivo")
    public String cd_cnctivo;
    
    @JsonProperty("idSector")
    public String idSector;

@JsonProperty("Plantilla")
    public String Plantilla;
}
