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
            name = "admin_segValoresTotales",
            procedureName = "admin_segValoresTotales",
            resultClasses = admin_segValoresTotalesEntity.class)
})
public class admin_segValoresTotalesEntity {

    @Id
    @JsonProperty("ID")
    public Integer ID;
    
    @JsonProperty("ValorTotalProducto")
    public Integer ValorTotalProducto;
    
    @JsonProperty("ValorContraProducto")
    public Integer ValorContraProducto;
    
    @JsonProperty("ValorElcProducto")
    public Integer ValorElcProducto;
    
    @JsonProperty("ValorTotalDomi")
    public Integer ValorTotalDomi;
    
    @JsonProperty("ValorContraDomi")
    public Integer ValorContraDomi;
    
    @JsonProperty("ValorElcDomi")
    public Integer ValorElcDomi;
    
    @JsonProperty("ValorTotalTotal")
    public Integer ValorTotalTotal;
    
    @JsonProperty("ValorContraTotal")
    public Integer ValorContraTotal;
    
    @JsonProperty("ValorElcTotal")
    public Integer ValorElcTotal;
}
