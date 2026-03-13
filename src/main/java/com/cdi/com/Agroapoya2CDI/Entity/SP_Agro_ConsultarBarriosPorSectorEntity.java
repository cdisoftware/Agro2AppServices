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
            name = "SP_Agro_ConsultarBarriosPorSector",
            procedureName = "SP_Agro_ConsultarBarriosPorSector",
            resultClasses = SP_Agro_ConsultarBarriosPorSectorEntity.class)
})
public class SP_Agro_ConsultarBarriosPorSectorEntity {

    @Id
    @JsonProperty("id")
    public Integer id;
    
    @JsonProperty("idbarrio")
    public Integer idbarrio;
    
    @JsonProperty("NombreBarrio")
    public String NombreBarrio;
    
    @JsonProperty("idsector")
    public Integer idsector;
}
