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
            name = "PaC_Clis",
            procedureName = "PaC_Clis",
            resultClasses = CClisEntity.class)
})
public class CClisEntity {

    @Id
    @JsonProperty("Id")
    public Integer Id;

    @JsonProperty("Cedula")
    public String Cedula;

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
