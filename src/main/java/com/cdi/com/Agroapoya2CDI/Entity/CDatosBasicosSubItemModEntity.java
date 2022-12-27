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
            name = "paC_DatosBasicosSubItemMod",
            procedureName = "paC_DatosBasicosSubItemMod",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class CDatosBasicosSubItemModEntity {

    @Id
    @JsonProperty("Id")
    public Integer Id;

    @JsonProperty("IdDatoBasico")
    public Integer IdDatoBasico;

    @JsonProperty("Estado")
    public Integer Estado;

    @JsonProperty("Descripcion")
    public String Descripcion;

    @JsonProperty("Texto")
    public String Texto;

}
