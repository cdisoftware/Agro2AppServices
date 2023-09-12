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
            name = "paC_ValidaUnidadesRegaloGrupo",
            procedureName = "paC_ValidaUnidadesRegaloGrupo",
            resultClasses = CValidaUniRegaloGrupEntity.class)
})
public class CValidaUniRegaloGrupEntity {

    @Id
    @JsonProperty("Id")
    public Integer Id;

    @JsonProperty("nombreLider")
    public String nombreLider;

    @JsonProperty("CodigLider")
    public String CodigLider;

    @JsonProperty("UnidadesFaltan")
    public Integer UnidadesFaltan;

    @JsonProperty("TotalAlcanzar")
    public Integer TotalAlcanzar;

    @JsonProperty("Regalo")
    public String Regalo;

    @JsonProperty("id_manychat")
    public String id_manychat;
}
