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
            name = "pac_usuariosCorreo",
            procedureName = "pac_usuariosCorreo",
            resultClasses = CusuariosCorreoEntity.class)
})
public class CusuariosCorreoEntity {

    @Id
    @JsonProperty("USUCODIG")
    public Integer USUCODIG;
    
    @JsonProperty("NOMBRES_PERSONA")
    public String NOMBRES_PERSONA;
    
    @JsonProperty("CORREO_PERSONA")
    public String CORREO_PERSONA;
    
    @JsonProperty("CELULAR_PERSONA")
    public String CELULAR_PERSONA;
}
