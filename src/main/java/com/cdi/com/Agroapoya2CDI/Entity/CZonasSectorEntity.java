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
            name = "paC_ZonasSector",
            procedureName = "paC_ZonasSector",
            resultClasses = CZonasSectorEntity.class)
})
public class CZonasSectorEntity {

    @Id
    @JsonProperty("id")
    public Integer id;

    @JsonProperty("Descripcion")
    public String Descripcion;
    
     @JsonProperty("cd_mncpio")
    public Integer cd_mncpio;
     
      @JsonProperty("cd_dpto")
    public Integer cd_dpto;
      
       @JsonProperty("Ciudad")
    public String Ciudad;
}
