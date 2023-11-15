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
            name = "admin_millaCoordenadasSector",
            procedureName = "admin_millaCoordenadasSector",
            resultClasses = admillaCoordenadasSectorEntity.class)
})
public class admillaCoordenadasSectorEntity {

    @Id
    @JsonProperty("id")
    public Integer id;

    @JsonProperty("ID_SCTOR_MILLA")
    public Integer ID_SCTOR_MILLA;

    @JsonProperty("LTTUD")
    public String LTTUD;

    @JsonProperty("LNGTUD")
    public String LNGTUD;

    @JsonProperty("ORDEN")
    public Integer ORDEN;
}
