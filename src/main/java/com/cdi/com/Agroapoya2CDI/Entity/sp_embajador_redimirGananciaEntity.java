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
            name = "sp_embajador_redimirGanancia",
            procedureName = "sp_embajador_redimirGanancia",
            parameters = {
                @StoredProcedureParameter(name = "Resultado",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class sp_embajador_redimirGananciaEntity {

    @Id
    @JsonProperty("idPago")
    public Integer idPago;
    
    @JsonProperty("usucodigVecino")
    public Integer usucodigVecino;
    
    @JsonProperty("usucodigEmbajador")
    public Integer usucodigEmbajador;
    
    @JsonProperty("TipoPago")
    public String TipoPago;
    
    @JsonProperty("llavePago")
    public String llavePago;
        
}
