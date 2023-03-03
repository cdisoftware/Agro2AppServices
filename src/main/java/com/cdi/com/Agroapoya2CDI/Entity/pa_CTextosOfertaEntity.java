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
            name = "pa_CTextosOferta",
            procedureName = "pa_CTextosOferta",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class pa_CTextosOfertaEntity {
    @Id
    @JsonProperty("idSector")
    public Integer idSector;

    @JsonProperty("cd_cnctivo")
    public Integer cd_cnctivo;
    
    @JsonProperty("TextoCorreo")
    public String TextoCorreo;
    
    @JsonProperty("TextoWhat")
    public String TextoWhat;
    
    @JsonProperty("ImgCorreo")
    public String ImgCorreo;
}
