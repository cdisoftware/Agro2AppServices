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
            name = "paC_descargasTrans",
            procedureName = "paC_descargasTrans",
            resultClasses = CdescargasTransEntity.class)
})
public class CdescargasTransEntity {

    @Id
    @JsonProperty("IdDescarga")
    public Integer IdDescarga;

    @JsonProperty("cd_cnctvo")
    public Integer cd_cnctvo;

    @JsonProperty("IdBodega")
    public Integer IdBodega;

    @JsonProperty("IdTran")
    public Integer IdTran;

    @JsonProperty("Observacion")
    public String Observacion;
}
