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
            name = "Admin_CamposPreQuery",
            procedureName = "Admin_CamposPreQuery",
            resultClasses = AdmCamposPreQueryEntity.class)
})
public class AdmCamposPreQueryEntity {

    @Id
    @JsonProperty("Id")
    public Integer Id;

    @JsonProperty("Campo")
    public String Campo;

    @JsonProperty("Descripcion")
    public String Descripcion;

}
