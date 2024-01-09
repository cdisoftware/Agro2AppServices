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
            name = "admin_listaPersona",
            procedureName = "admin_listaPersona",
            resultClasses = adlistaPersonaEntity.class)
})
public class adlistaPersonaEntity {

    @Id
    @JsonProperty("usucodig")
    public String usucodig;

    @JsonProperty("nombres_persona")
    public String nombres_persona;

    @JsonProperty("APELLIDOS_PERSONA")
    public String APELLIDOS_PERSONA;

    @JsonProperty("CELULAR_PERSONA")
    public String CELULAR_PERSONA;

    @JsonProperty("CORREO_PERSONA")
    public String CORREO_PERSONA;

    @JsonProperty("FECHA_CREACION")
    public String FECHA_CREACION;

    @JsonProperty("DRCCION")
    public String DRCCION;

    @JsonProperty("CMNTRIO")
    public String CMNTRIO;

    @JsonProperty("CMPLMNTO_DRRCCION")
    public String CMPLMNTO_DRRCCION;

    @JsonProperty("coordenadas_entr")
    public String coordenadas_entr;

    @JsonProperty("NombreCompleto")
    public String NombreCompleto;
}
