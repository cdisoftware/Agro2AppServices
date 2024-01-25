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
            name = "Admin_Tipo_Bodega",
            procedureName = "Admin_Tipo_Bodega",
            resultClasses = AdTipBodegaEntity.class)
})
public class AdTipBodegaEntity {

    @Id
    @JsonProperty("IdBodega")
    public Integer IdBodega;

    @JsonProperty("IdDepa")
    public Integer IdDepa;

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
}
