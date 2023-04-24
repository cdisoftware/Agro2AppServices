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
    public String NombreGrupo;

    @JsonProperty("cd_cnctvo")
    public Integer cd_cnctvo;

    @JsonProperty("id_sector")
    public Integer id_sector;

    @JsonProperty("ValorTransporte")
    public String ValorTransporte;

    @JsonProperty("estado")
    public Integer estado;

    @JsonProperty("ID_CNDCTOR")
    public Integer ID_CNDCTOR;

    @JsonProperty("NMBRE_CNDCTOR")
    public String NMBRE_CNDCTOR;

    @JsonProperty("PLCA")
    public String PLCA;

    @JsonProperty("IdCiudad")
    public Integer IdCiudad;

    @JsonProperty("IdDepa")
    public Integer IdDepa;

    @JsonProperty("Regitro")
    public String Regitro;

    @JsonProperty("IdRegistro")
    public Integer IdRegistro;

}
