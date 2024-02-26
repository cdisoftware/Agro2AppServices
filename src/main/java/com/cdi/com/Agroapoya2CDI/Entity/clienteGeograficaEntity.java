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
            name = "cliente_Geografica",
            procedureName = "cliente_Geografica",
            resultClasses = clienteGeograficaEntity.class)
})
public class clienteGeograficaEntity {

    @Id
    @JsonProperty("Id")
    public Integer Id;

    @JsonProperty("IdDepto")
    public Integer IdDepto;

    @JsonProperty("IdCiudad")
    public Integer IdCiudad;

    @JsonProperty("Nombre")
    public String Nombre;

    @JsonProperty("Complemento")
    public String Complemento;
}
