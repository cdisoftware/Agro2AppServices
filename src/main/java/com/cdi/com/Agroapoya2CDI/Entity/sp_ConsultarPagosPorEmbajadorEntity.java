
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
            name = "sp_ConsultarPagosPorEmbajador",
            procedureName = "sp_ConsultarPagosPorEmbajador",
            resultClasses = sp_ConsultarPagosPorEmbajadorEntity.class)
})
public class sp_ConsultarPagosPorEmbajadorEntity {
    @Id
    @JsonProperty("Id")
    public Integer Id;

    @JsonProperty("UsucodigVecino")
    public String UsucodigVecino    ;

    @JsonProperty("ValorPagoVecino")
    public String ValorPagoVecino;

    @JsonProperty("DescripcionPagoVecino")
    public String DescripcionPagoVecino;

    @JsonProperty("IdCarroVecino")
    public String IdCarroVecino;

    @JsonProperty("IdEstadoPagoVecino")
    public String IdEstadoPagoVecino;

    @JsonProperty("DescEstadoPagoVecino")
    public String DescEstadoPagoVecino;

    @JsonProperty("FechaPagoVecino")
    public String FechaPagoVecino;

    @JsonProperty("IdEstadoEmbajador")
    public String IdEstadoEmbajador;

    @JsonProperty("UsucodigEmbajador")
    public String UsucodigEmbajador;

    @JsonProperty("ValorPagoEmbajador")
    public String ValorPagoEmbajador;

    @JsonProperty("DescripcionPagoEmbajador")
    public String DescripcionPagoEmbajador;

    @JsonProperty("PorcentajePagoEmbajador")
    public String PorcentajePagoEmbajador;
    
    @JsonProperty("IdEstadoPagoEmbajador")
    public String IdEstadoPagoEmbajador;
    
    @JsonProperty("DescEstadoPagoEmbajador")
    public String DescEstadoPagoEmbajador;
    
    @JsonProperty("FechaPagoEmbajador")
    public String FechaPagoEmbajador;  
    
    @JsonProperty("tipoDePago")
    public String tipoDePago;

    @JsonProperty("llaveDePago")
    public String llaveDePago;
}
