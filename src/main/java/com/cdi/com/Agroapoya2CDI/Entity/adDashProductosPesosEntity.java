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
            name = "admin_DashProductosPesos",
            procedureName = "admin_DashProductosPesos",
            resultClasses = adDashProductosPesosEntity.class)
})
public class adDashProductosPesosEntity {

    @Id
    @JsonProperty("IdMain")
    public String IdMain;

    @JsonProperty("IdAno")
    public String IdAno;

    @JsonProperty("IdMes")
    public Integer IdMes;

    @JsonProperty("IdProducto")
    public Integer IdProducto;

    @JsonProperty("DSCRPCION")
    public String DSCRPCION;

    @JsonProperty("Presentacion")
    public String Presentacion;

    @JsonProperty("IdSector")
    public Integer IdSector;

    @JsonProperty("DescripcionSector")
    public String DescripcionSector;

    @JsonProperty("VentasPesos")
    public String VentasPesos;
}
