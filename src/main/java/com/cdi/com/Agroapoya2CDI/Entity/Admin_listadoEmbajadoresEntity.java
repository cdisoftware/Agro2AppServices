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
            name = "Admin_listadoEmbajadores",
            procedureName = "Admin_listadoEmbajadores",
            resultClasses = Admin_listadoEmbajadoresEntity.class)
})
public class Admin_listadoEmbajadoresEntity {

    @Id
    @JsonProperty("UsucodigEmbajador")
    public Integer UsucodigEmbajador;

    @JsonProperty("NombreConjunto")
    public String NombreConjunto;

    @JsonProperty("FechaCreacionEmbajador")
    public String FechaCreacionEmbajador;

    @JsonProperty("LinkCortoEmbajador")
    public String LinkCortoEmbajador;

    @JsonProperty("IdEmbajador")
    public String IdEmbajador;

    @JsonProperty("NombreEmbajador")
    public String NombreEmbajador;

    @JsonProperty("CelularEmbajador")
    public String CelularEmbajador;

    @JsonProperty("CorreoEmbajador")
    public String CorreoEmbajador;

    @JsonProperty("FechaRegistro")
    public String FechaRegistro;

    @JsonProperty("DireccionEmbajador")
    public String DireccionEmbajador;

    @JsonProperty("ComplementoDireccionEmbajador")
    public String ComplementoDireccionEmbajador;

    @JsonProperty("IdManichatEmbajador")
    public String IdManichatEmbajador;

    @JsonProperty("NumeroComprasEmbajador")
    public Integer NumeroComprasEmbajador;

    @JsonProperty("NumeroClienteReferidos")
    public Integer NumeroClienteReferidos;

    @JsonProperty("NumeroComprasTotalClienteReferidos")
    public Integer NumeroComprasTotalClienteReferidos;
}
