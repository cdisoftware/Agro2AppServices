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
            name = "admin_relacion_Oferta_Trans_Mod",
            procedureName = "admin_relacion_Oferta_Trans_Mod",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class adrelOfertaTransModEntity {

    @Id
    @JsonProperty("Id")
    public Integer Id;

    @JsonProperty("IdTrans")
    public Integer IdTrans;

    @JsonProperty("IdTipoProducto")
    public Integer IdTipoProducto;

    @JsonProperty("IdProducto")
    public Integer IdProducto;

    @JsonProperty("Cantidad")
    public Integer Cantidad;

    @JsonProperty("cd_cnsctvo")
    public Integer cd_cnsctvo;

}
