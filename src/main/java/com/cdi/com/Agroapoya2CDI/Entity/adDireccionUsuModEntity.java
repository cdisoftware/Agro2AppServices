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
            name = "admin_DireccionUsuMod",
            procedureName = "admin_DireccionUsuMod",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class adDireccionUsuModEntity {

    @Id
    @JsonProperty("Usucodig")
    public Integer Usucodig;

    @JsonProperty("Direccion")
    public String Direccion;

    @JsonProperty("CompleDirecc")
    public String CompleDirecc;

    @JsonProperty("Coordenadas")
    public String Coordenadas;
}
