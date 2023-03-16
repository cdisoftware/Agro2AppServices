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
            name = "paC_correoManual",
            procedureName = "paC_correoManual",
            resultClasses = CcorreoManualEntity.class)
})
public class CcorreoManualEntity {
    @Id
    @JsonProperty("IdEnvio")
    public Integer IdEnvio;
    
    @JsonProperty("Query")
    public String Query;
    
    @JsonProperty("IdSector")
    public Integer IdSector;
    
    @JsonProperty("Cd_cnctivo")
    public Integer Cd_cnctivo;
    
    @JsonProperty("IdPlantilla")
    public Integer IdPlantilla;
    
    @JsonProperty("IdEstado")
    public Integer IdEstado;
    
    @JsonProperty("FechaEnvio")
    public String FechaEnvio;
    
    @JsonProperty("IdProgramado")
    public Integer IdProgramado;
    
    @JsonProperty("NombrePlantilla")
    public String NombrePlantilla;
    
    @JsonProperty("Descripcion")
    public String Descripcion;
    
    @JsonProperty("DesEstado")
    public String DesEstado;
    
    @JsonProperty("DesProgramado")
    public String DesProgramado;
}
