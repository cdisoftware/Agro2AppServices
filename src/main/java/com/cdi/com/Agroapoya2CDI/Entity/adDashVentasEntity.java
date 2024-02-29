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
            name = "admin_DashVentas",
            procedureName = "admin_DashVentas",
            resultClasses = adDashVentasEntity.class)
})
public class adDashVentasEntity {

    @Id
    @JsonProperty("id")
    public String id;

    @JsonProperty("IdSector")
    public Integer IdSector;

    @JsonProperty("DescripcionSector")
    public String DescripcionSector;

    @JsonProperty("IdMes")
    public Integer IdMes;

    @JsonProperty("IdAno")
    public Integer IdAno;

    @JsonProperty("NumCompras")
    public Integer NumCompras;
}
