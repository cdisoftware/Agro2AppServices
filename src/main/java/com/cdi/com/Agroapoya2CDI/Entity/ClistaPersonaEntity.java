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
            name = "paC_listaPersona",
            procedureName = "paC_listaPersona",
            resultClasses = ClistaPersonaEntity.class)
})
public class ClistaPersonaEntity {

    @Id
    @JsonProperty("USUCODIG")
    public Integer USUCODIG;

    @JsonProperty("CD_TPO_PRSNA")
    public Integer CD_TPO_PRSNA;

    @JsonProperty("NOMBRES_PERSONA")
    public String NOMBRES_PERSONA;

    @JsonProperty("APELLIDOS_PERSONA")
    public String APELLIDOS_PERSONA;

    @JsonProperty("CELULAR_PERSONA")
    public String CELULAR_PERSONA;

    @JsonProperty("ESTADO")
    public Integer ESTADO;

    @JsonProperty("CORREO_PERSONA")
    public String CORREO_PERSONA;

    @JsonProperty("FECHA_CREACION")
    public String FECHA_CREACION;

    @JsonProperty("TIPO_DOCUMENTO")
    public Integer TIPO_DOCUMENTO;

    @JsonProperty("DOCUMENTO_USUARIO")
    public String DOCUMENTO_USUARIO;

    @JsonProperty("CD_PAIS")
    public Integer CD_PAIS;

    @JsonProperty("CD_DPTO")
    public Integer CD_DPTO;

    @JsonProperty("CD_CDAD")
    public Integer CD_CDAD;

    @JsonProperty("DRCCION")
    public String DRCCION;

    @JsonProperty("CD_CNSCTVO")
    public String CD_CNSCTVO;

    @JsonProperty("CMNTRIO")
    public String CMNTRIO;

    @JsonProperty("TOKEN_PERSONA")
    public String TOKEN_PERSONA;

    @JsonProperty("FECHA_ENVIO_CORREO")
    public String FECHA_ENVIO_CORREO;

    @JsonProperty("COD_ACTLZAR_CLVE")
    public String COD_ACTLZAR_CLVE;

    @JsonProperty("CMPLMNTO_DRRCCION")
    public String CMPLMNTO_DRRCCION;

    @JsonProperty("id_manychat")
    public String id_manychat;

}
