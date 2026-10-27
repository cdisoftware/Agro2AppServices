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
            name = "Ikon_AuditoriaManychat",
            procedureName = "Ikon_AuditoriaManychat",
            resultClasses = Ikon_AuditoriaManychatEntity.class)
})
public class Ikon_AuditoriaManychatEntity {

    @Id
    @JsonProperty("id")
    public Integer id;

    @JsonProperty("HoraEjecucion")
    public String HoraEjecucion;

    @JsonProperty("CodigoPlantilla")
    public String CodigoPlantilla;
}
