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
            name = "admin_reporteUsuarioServices",
            procedureName = "admin_reporteUsuarioServices",
            resultClasses = adreporteUsuarioServEntity.class)
})
public class adreporteUsuarioServEntity {

    @Id
    @JsonProperty("Usucodig")
    public Integer Usucodig;

    @JsonProperty("NombrePersona")
    public String NombrePersona;

    @JsonProperty("ApellidoPersona")
    public String ApellidoPersona;

    @JsonProperty("CelularPersona")
    public String CelularPersona;

    @JsonProperty("CorreoPersona")
    public String CorreoPersona;

    @JsonProperty("FechaCreacion")
    public String FechaCreacion;

    @JsonProperty("TipoDocumento")
    public Integer TipoDocumento;

    @JsonProperty("NumeroDocumento")
    public String NumeroDocumento;

    @JsonProperty("IdDepto")
    public Integer IdDepto;

    @JsonProperty("IdCiudad")
    public Integer IdCiudad;

    @JsonProperty("Direccion")
    public String Direccion;

    @JsonProperty("ComplementoDireccion")
    public String ComplementoDireccion;

    @JsonProperty("Coordenadas")
    public String Coordenadas;

    @JsonProperty("Comentario")
    public String Comentario;

    @JsonProperty("IdManychat")
    public String IdManychat;

    @JsonProperty("NumCompras")
    public Integer NumCompras;

}
