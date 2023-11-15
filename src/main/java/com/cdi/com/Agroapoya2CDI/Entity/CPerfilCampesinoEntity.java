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
            name = "paC_PerfilCampesino",
            procedureName = "paC_PerfilCampesino",
            resultClasses = CPerfilCampesinoEntity.class)
})
public class CPerfilCampesinoEntity {

    @Id
    @JsonProperty("USUCODIG")
    public Integer USUCODIG;

    @JsonProperty("NOMBRES_PERSONA")
    public String NOMBRES_PERSONA;

    @JsonProperty("APELLIDOS_PERSONA")
    public String APELLIDOS_PERSONA;

    @JsonProperty("CELULAR_PERSONA")
    public String CELULAR_PERSONA;

    @JsonProperty("CORREO_PERSONA")
    public String CORREO_PERSONA;

    @JsonProperty("FECHA_CREACION")
    public String FECHA_CREACION;

    @JsonProperty("TIPO_DOCUMENTO")
    public String TIPO_DOCUMENTO;

    @JsonProperty("DOCUMENTO_USUARIO")
    public String DOCUMENTO_USUARIO;

    @JsonProperty("CD_DPTO")
    public String CD_DPTO;

    @JsonProperty("CD_CDAD")
    public String CD_CDAD;

    @JsonProperty("DRCCION")
    public String DRCCION;

    @JsonProperty("CMNTRIO")
    public String CMNTRIO;

    @JsonProperty("CMPLMNTO_DRRCCION")
    public String CMPLMNTO_DRRCCION;

    @JsonProperty("id_manychat")
    public String id_manychat;

    @JsonProperty("DscripUno")
    public String DscripUno;

    @JsonProperty("DscripDos")
    public String DscripDos;

    @JsonProperty("DscripTres")
    public String DscripTres;

    @JsonProperty("Observacion")
    public String Observacion;

    @JsonProperty("DescDocumento")
    public String DescDocumento;

    @JsonProperty("Vereda")
    public String Vereda;

    @JsonProperty("NombreFinca")
    public String NombreFinca;

    @JsonProperty("FechaNacimiento")
    public String FechaNacimiento;

    @JsonProperty("Edad")
    public Integer Edad;

}
