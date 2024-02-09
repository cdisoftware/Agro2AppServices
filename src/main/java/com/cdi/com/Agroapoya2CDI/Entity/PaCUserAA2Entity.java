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
            name = "PaCUserAA2",
            procedureName = "PaCUserAA2",
            resultClasses = PaCUserAA2Entity.class)
})
public class PaCUserAA2Entity {

    @Id
    @JsonProperty("USUCODIG")
    public Integer USUCODIG;

    @JsonProperty("TipoPersona")
    public String TipoPersona;

    @JsonProperty("NOMBRES_PERSONA")
    public String NOMBRES_PERSONA;

    @JsonProperty("CELULAR_PERSONA")
    public String CELULAR_PERSONA;

    @JsonProperty("CORREO_PERSONA")
    public String CORREO_PERSONA;

    @JsonProperty("FECHA_CREACION")
    public String FECHA_CREACION;

    @JsonProperty("DRCCION")
    public String DRCCION;

    @JsonProperty("id_manychat")
    public String id_manychat;

    @JsonProperty("Parametro")
    public String Parametro;

}
