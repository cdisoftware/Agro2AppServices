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
            name = "PaC_ClisMod",
            procedureName = "PaC_ClisMod",
            parameters = {
                @StoredProcedureParameter(name = "respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class CClisModEntity {

    @Id
    @JsonProperty("Cedula")
    public Integer Cedula;

    @JsonProperty("Fecha")
    public String Fecha;

    @JsonProperty("Estado")
    public String Estado;

    @JsonProperty("Empresa")
    public String Empresa;

    @JsonProperty("Nom_Archivo")
    public String Nom_Archivo;

    @JsonProperty("Nombre")
    public String Nombre;

    @JsonProperty("Celular")
    public String Celular;

}
