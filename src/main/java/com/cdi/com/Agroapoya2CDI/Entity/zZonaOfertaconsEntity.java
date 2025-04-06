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
            name = "z_ZonaOferta_cons",
            procedureName = "z_ZonaOferta_cons",
            resultClasses = zZonaOfertaconsEntity.class)
})

public class zZonaOfertaconsEntity {

    @Id
    @JsonProperty("IdZona")
    public Integer IdZona;

    @JsonProperty("DescZona")
    public String DescZona;

    @JsonProperty("IdEstado")
    public Integer IdEstado;

    @JsonProperty("DescEstado")
    public String DescEstado;

    @JsonProperty("Localidades")
    public String Localidades;

    @JsonProperty("NumeroPersonas")
    public Integer NumeroPersonas;
}
