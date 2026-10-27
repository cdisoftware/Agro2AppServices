
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
            name = "Ikon_Embajadores_clienteReferidos",
            procedureName = "Ikon_Embajadores_clienteReferidos",
            resultClasses = Ikon_Embajadores_clienteReferidosEntity.class)
})
public class Ikon_Embajadores_clienteReferidosEntity {
    @Id
    @JsonProperty("id")
    public Integer id;
    
    @JsonProperty("IdUsuario")
    public String IdUsuario;
    
    @JsonProperty("NOMBRES_PERSONA")
    public String NOMBRES_PERSONA;
    
    @JsonProperty("FechaRelacion")
    public String FechaRelacion;
}
