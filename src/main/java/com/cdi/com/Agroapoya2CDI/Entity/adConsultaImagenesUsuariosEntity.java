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
            name = "admin_ConsultaImagenesUsuarios",
            procedureName = "admin_ConsultaImagenesUsuarios",
            resultClasses = adConsultaImagenesUsuariosEntity.class)
})
public class adConsultaImagenesUsuariosEntity {

    @Id
    @JsonProperty("id")
    public Integer id;

    @JsonProperty("usucodig")
    public Integer usucodig;

    @JsonProperty("nombreimagen")
    public String nombreimagen;

    @JsonProperty("imgprincipal")
    public Integer imgprincipal;

    @JsonProperty("orden")
    public Integer orden;

}
