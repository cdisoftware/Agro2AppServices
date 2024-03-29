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
            name = "admin_ImgUsuariosMod",
            procedureName = "admin_ImgUsuariosMod",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class adImgUsuariosModEntity {

    @Id
    @JsonProperty("IdImagen")
    public Integer IdImagen;

    @JsonProperty("Usucodig")
    public Integer Usucodig;

    @JsonProperty("NombreImagen")
    public String NombreImagen;

    @JsonProperty("ImgPrincipal")
    public Integer ImgPrincipal;

    @JsonProperty("Orden")
    public Integer Orden;
}
