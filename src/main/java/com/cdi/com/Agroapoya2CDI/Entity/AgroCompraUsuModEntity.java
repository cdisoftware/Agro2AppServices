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
            name = "Agro_compraUsuMod",
            procedureName = "Agro_compraUsuMod",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class AgroCompraUsuModEntity {

    @Id
    @JsonProperty("IdsCarro")
    public String IdsCarro;

    @JsonProperty("valorTotal")
    public String valorTotal;

    @JsonProperty("MedioPago")
    public Integer MedioPago;

    @JsonProperty("Usucodig")
    public Integer Usucodig;

}
