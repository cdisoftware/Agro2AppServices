package com.cdi.com.Agroapoya2CDI.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import lombok.Data;

@Entity
@Data
@NamedStoredProcedureQueries({
    @NamedStoredProcedureQuery(
            name = "admin_TranportesCons",
            procedureName = "admin_TranportesCons",
            resultClasses = adTranportesConsEntity.class)
})
public class adTranportesConsEntity {

    @Id
    @JsonProperty("IdTrans")
    public Integer IdTrans;

    @JsonProperty("IdEstadoTrans")
    public Integer IdEstadoTrans;

    @JsonProperty("IdCondutor")
    public Integer IdCondutor;

    @JsonProperty("UsucodigTrans")
    public Integer UsucodigTrans;

    @JsonProperty("ValorFlete")
    public String ValorFlete;

    @JsonProperty("FechaRecoge")
    public String FechaRecoge;

    @JsonProperty("UbicacionRecoge")
    public String UbicacionRecoge;

    @JsonProperty("UbicacionEntrega")
    public String UbicacionEntrega;

    @JsonProperty("idBodegaEntrega")
    public Integer idBodegaEntrega;

}
