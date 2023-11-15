package com.cdi.com.Agroapoya2CDI.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import lombok.Data;

@Entity
@Data
@NamedStoredProcedureQueries({
    @NamedStoredProcedureQuery(
            name = "paC_PerfilCampesinoMod",
            procedureName = "paC_PerfilCampesinoMod",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class CPerfilCampesinoModEntity {

    @Id
    @JsonProperty("Usucodig")
    public Integer Usucodig;

    @JsonProperty("CorreoPersona")
    public String CorreoPersona;

    @JsonProperty("NombrePersona")
    public String NombrePersona;

    @JsonProperty("ApellidoPersona")
    public String ApellidoPersona;

    @JsonProperty("CelularPersona")
    public String CelularPersona;

    @JsonProperty("TipoDocumento")
    public Integer TipoDocumento;

    @JsonProperty("DocumentoUsuario")
    public String DocumentoUsuario;

    @JsonProperty("IdDepto")
    public Integer IdDepto;

    @JsonProperty("IdCiudad")
    public Integer IdCiudad;

    @JsonProperty("Direccion")
    public String Direccion;

    @JsonProperty("Comentario")
    public String Comentario;

    @JsonProperty("complementoDireccion")
    public String complementoDireccion;

    @JsonProperty("IdManychat")
    public String IdManychat;

    @JsonProperty("DescripUno")
    public String DescripUno;

    @JsonProperty("DescripDos")
    public String DescripDos;

    @JsonProperty("DescripTres")
    public String DescripTres;

    @JsonProperty("Observacion")
    public String Observacion;

    @JsonProperty("FechaNacimiento")
    public String FechaNacimiento;

    @JsonProperty("Vereda")
    public String Vereda;

    @JsonProperty("Finca")
    public String Finca;
}
