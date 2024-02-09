package com.cdi.com.Agroapoya2CDI.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
public class ListArchivosDriveEntity {
    @Id
    @JsonProperty("id")
    public String id;
    
    @JsonProperty("NombreDocumento")
    public String NombreDocumento;
    
    @JsonProperty("Complemento")
    public String Complemento;
    
    @JsonProperty("Link")
    public String Link;
}