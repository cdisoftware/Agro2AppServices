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
            name = "admin_DashUsuarios",
            procedureName = "admin_DashUsuarios",
            resultClasses = adDashUsuariosEntity.class)
})
public class adDashUsuariosEntity {

    @Id
    @JsonProperty("Id")
    public String Id;

    @JsonProperty("IdSector")
    public String IdSector;

    @JsonProperty("DescripcionSector")
    public String DescripcionSector;

    @JsonProperty("IdMes")
    public Integer IdMes;

    @JsonProperty("IdAno")
    public String IdAno;

    @JsonProperty("NumUsuarios")
    public Integer NumUsuarios;
}
