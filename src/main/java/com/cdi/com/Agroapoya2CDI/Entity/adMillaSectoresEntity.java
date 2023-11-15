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
            name = "admin_MillaSectores",
            procedureName = "admin_MillaSectores",
            resultClasses = adMillaSectoresEntity.class)
})
public class adMillaSectoresEntity {

    @Id
    @JsonProperty("IdSectorMilla")
    public Integer IdSectorMilla;

    @JsonProperty("NombreSector")
    public String NombreSector;

    @JsonProperty("CD_RGION")
    public Integer CD_RGION;

    @JsonProperty("CD_MNCPIO")
    public Integer CD_MNCPIO;
}
