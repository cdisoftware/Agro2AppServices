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
            name = "paC_BodegaMod",
            procedureName = "paC_BodegaMod",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class CBodegaModEntity {

    @Id
    @JsonProperty("IdBodega")
    public Integer IdBodega;

    @JsonProperty("IdDepto")
    public Integer IdDepto;

    @JsonProperty("IdCiudad")
    public Integer IdCiudad;

    @JsonProperty("NombreBodega")
    public String NombreBodega;

    @JsonProperty("Descripcion")
    public String Descripcion;

    @JsonProperty("Direccion")
    public String Direccion;

    @JsonProperty("Coordenadas")
    public String Coordenadas;

    @JsonProperty("IdSector")
    public Integer IdSector;
}
