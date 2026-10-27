
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
            name = "sp_InsertarEnvioCorreos_IKON",
            procedureName = "sp_InsertarEnvioCorreos_IKON",
            resultClasses = Ikon_sp_InsertarEnvioCorreosEntity.class)

})
public class Ikon_sp_InsertarEnvioCorreosEntity {
    
    @Id
    @JsonProperty("Descripcion")
    public String Descripcion;

    @JsonProperty("CorreoPrincipal")
    public String CorreoPrincipal;

    @JsonProperty("CorreoCopia")
    public String CorreoCopia;

    @JsonProperty("Asunto")
    public String Asunto;

    @JsonProperty("Cuerpo")
    public String Cuerpo;
    
    @JsonProperty("FechaEnvio")
    public String FechaEnvio;
    
    @JsonProperty("Clave")
    public String Clave;

}
