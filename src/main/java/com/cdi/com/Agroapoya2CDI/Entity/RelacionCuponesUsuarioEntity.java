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
            name = "paC_RelacionCuponesUsuario",
            procedureName = "paC_RelacionCuponesUsuario",
            resultClasses = RelacionCuponesUsuarioEntity.class)
})
public class RelacionCuponesUsuarioEntity {

    @Id
    @JsonProperty("idRelacionCupon")
    public Integer idRelacionCupon;

    @JsonProperty("cd_cdgo")
    public Integer cd_cdgo;

    @JsonProperty("usucodig")
    public Integer usucodig;

    @JsonProperty("Id_Carro")
    public Integer Id_Carro;

    @JsonProperty("codigo_Mostrar")
    public String codigo_Mostrar;

    @JsonProperty("descripcion")
    public String descripcion;

    @JsonProperty("FechaInicio")
    public String FechaInicio;

    @JsonProperty("FechaFin")
    public String FechaFin;

    @JsonProperty("DescuentoAplicable")
    public String DescuentoAplicable;

    @JsonProperty("FechaCreacion")
    public String FechaCreacion;

    @JsonProperty("Valor")
    public String Valor;

    @JsonProperty("Compartir")
    public String Compartir;
}
