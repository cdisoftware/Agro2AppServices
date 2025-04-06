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
            name = "z_EmbajadorMod",
            procedureName = "z_EmbajadorMod",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})

public class zEmbajadorModEntity {

    @Id
    @JsonProperty("UsucodigEmbajador")
    public Integer UsucodigEmbajador;

    @JsonProperty("CorreoEmbajado")
    public String CorreoEmbajado;

    @JsonProperty("NombreConjunto")
    public String NombreConjunto;

    @JsonProperty("Direccion")
    public String Direccion;

    @JsonProperty("ComplementoDireccion")
    public String ComplementoDireccion;

    @JsonProperty("Coordenadas")
    public String Coordenadas;

}
