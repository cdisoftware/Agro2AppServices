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
            name = "paC_ultimMilla",
            procedureName = "paC_ultimMilla",
            resultClasses = CultimMillaEntity.class)
})
public class CultimMillaEntity {

    @Id
    @JsonProperty("IdUltimaMilla")
    public Integer IdUltimaMilla;

    @JsonProperty("IdGrupo")
    public Integer IdGrupo;

    @JsonProperty("NombreGrupo")
    public Integer NombreGrupo;

    @JsonProperty("cd_cnctvo")
    public Integer cd_cnctvo;

    @JsonProperty("id_sector")
    public Integer id_sector;

    @JsonProperty("ValorTransporte")
    public String ValorTransporte;
}
