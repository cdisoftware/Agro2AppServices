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
            name = "pac_GeneracionQuery",
            procedureName = "pac_GeneracionQuery",
            resultClasses = CGeneracionQueryEntity.class)
})
public class CGeneracionQueryEntity {

    @Id
    @JsonProperty("IdPlantilla")
    public Integer IdPlantilla;
    
    @JsonProperty("IdMomentoEnvio")
    public Integer IdMomentoEnvio;
    
    @JsonProperty("IdTipoPlantilla")
    public Integer IdTipoPlantilla;
    
    @JsonProperty("Estado")
    public Integer Estado;
    
    @JsonProperty("EstadoElimina")
    public Integer EstadoElimina;
    
    @JsonProperty("FechaCreacion")
    public String FechaCreacion;
    
    @JsonProperty("NombrePlantilla")
    public String NombrePlantilla;
    
    @JsonProperty("Descripcion")
    public String Descripcion;
    
    @JsonProperty("Asunto")
    public String Asunto;
    
    @JsonProperty("html")
    public String html;
    
    @JsonProperty("ImgEncabezado")
    public String ImgEncabezado;
    
    @JsonProperty("ImgPie")
    public String ImgPie;
    
    @JsonProperty("QueryAdicional")
    public String QueryAdicional;
}
