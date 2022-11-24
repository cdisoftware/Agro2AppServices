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
            name = "paC_PublicidadMod",
            procedureName = "paC_PublicidadMod",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class CPublicidadModEntity {

    @Id
    @JsonProperty("Id")
    public Integer Id;

    @JsonProperty("IdVista")
    public Integer IdVista;

    @JsonProperty("IdAccion")
    public Integer IdAccion;

    @JsonProperty("Patch")
    public String Patch;

    @JsonProperty("Imagen")
    public String Imagen;

    @JsonProperty("Orden")
    public Integer Orden;

    @JsonProperty("Usucodig")
    public Integer Usucodig;

    @JsonProperty("Observacion")
    public String Observacion;
}
