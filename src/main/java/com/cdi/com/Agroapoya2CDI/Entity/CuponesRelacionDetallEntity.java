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
            name = "paC_CuponesRelacionDetalle",
            procedureName = "paC_CuponesRelacionDetalle",
            resultClasses = CuponesRelacionDetallEntity.class)
})
public class CuponesRelacionDetallEntity {

    @Id
    @JsonProperty("Id")
    public Integer Id;

    @JsonProperty("NombrePersona")
    public String NombrePersona;

    @JsonProperty("ValorPagar")
    public String ValorPagar;

    @JsonProperty("estado")
    public String estado;

    @JsonProperty("DescripEstado")
    public String DescripEstado;

    @JsonProperty("CodigoDescuento")
    public String CodigoDescuento;
    
    @JsonProperty("ValorDescu")
    public String ValorDescu;
    
    @JsonProperty("ValorDescuTotal")
    public String ValorDescuTotal;
}
