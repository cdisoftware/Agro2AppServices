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
            name = "paC_Transportes",
            procedureName = "paC_Transportes",
            resultClasses = CTransportesEntity.class)
})
public class CTransportesEntity {

    @Id
    @JsonProperty("IdTrans")
    public Integer IdTrans;

    @JsonProperty("IdTipoEntrega")
    public Integer IdTipoEntrega;

    @JsonProperty("TipoEntrega")
    public String TipoEntrega;

    @JsonProperty("IdSector")
    public Integer IdSector;

    @JsonProperty("Sector")
    public String Sector;

    @JsonProperty("FechaActual")
    public String FechaActual;

    @JsonProperty("IdGrupo")
    public Integer IdGrupo;

    @JsonProperty("cd_cnctivo")
    public Integer cd_cnctivo;
}
