
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
            name = "Ikon_AuditoriaManychatDetalle",
            procedureName = "Ikon_AuditoriaManychatDetalle",
            resultClasses = Ikon_AuditoriaManychatDetalleEntity.class)
})
public class Ikon_AuditoriaManychatDetalleEntity {
    @Id
    @JsonProperty("ID")
    public Integer ID;
    
    @JsonProperty("USUCODIG")
    public String USUCODIG;
    
    @JsonProperty("USUARIO")
    public String USUARIO;
    
    @JsonProperty("CELULAR")
    public String CELULAR;
    
    @JsonProperty("ID_MANYCHAT")
    public String ID_MANYCHAT;
    
    @JsonProperty("IDSECTOR")
    public String IDSECTOR;
    
    @JsonProperty("QueryPre")
    public String QueryPre;
    
    @JsonProperty("CORREO_PERSONA")
    public String CORREO_PERSONA;
}
