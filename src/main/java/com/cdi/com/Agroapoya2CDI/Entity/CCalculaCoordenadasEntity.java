package com.cdi.com.Agroapoya2CDI.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import lombok.Data;

@Entity
@Data
@NamedStoredProcedureQueries({
    @NamedStoredProcedureQuery(
            name = "paC_validaCoordenadasSector",
            procedureName = "paC_validaCoordenadasSector",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})

public class CCalculaCoordenadasEntity {

    @Id
    @JsonProperty("id_oferta")
    public String id_oferta;

    @JsonProperty("Bandera")
    public String Bandera;

    @JsonProperty("lat")
    public String la;

    @JsonProperty("lon")
    public String lon;

    @JsonProperty("Direccion")
    public String Direccion;
}
