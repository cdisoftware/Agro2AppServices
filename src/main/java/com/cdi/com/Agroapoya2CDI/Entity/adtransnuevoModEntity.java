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
            name = "admin_transnuevoMod",
            procedureName = "admin_transnuevoMod",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class adtransnuevoModEntity {

    @Id
    @JsonProperty("UbicacionRecoge")
    public String UbicacionRecoge;

    @JsonProperty("ValorFlete")
    public Integer ValorFlete;

    @JsonProperty("FechaRecoge")
    public String FechaRecoge;

    @JsonProperty("IdConductor")
    public Integer IdConductor;

    @JsonProperty("IdBodegaEntrega")
    public Integer IdBodegaEntrega;
}
