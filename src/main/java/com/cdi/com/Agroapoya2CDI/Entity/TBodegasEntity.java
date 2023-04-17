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
            name = "paT_Bodegas",
            procedureName = "paT_Bodegas",
            resultClasses = TBodegasEntity.class)
})
public class TBodegasEntity {

    @Id
    @JsonProperty("IdBodega")
    public Integer IdBodega;

    @JsonProperty("NombreBodega")
    public String NombreBodega;

    @JsonProperty("Descripcion")
    public String Descripcion;

    @JsonProperty("Direccion")
    public String Direccion;

    @JsonProperty("Coordenadas")
    public String Coordenadas;
}
