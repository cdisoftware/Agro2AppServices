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
            name = "pac_PagosElectronicosToppings",
            procedureName = "pac_PagosElectronicosToppings",
            resultClasses = PagosElectronicosToppingsEntity.class)
})
public class PagosElectronicosToppingsEntity {

    @Id
    @JsonProperty("IdTopping")
    public Integer IdTopping;

    @JsonProperty("Id_Sector")
    public Integer Id_Sector;

    @JsonProperty("cd_cnctivo")
    public Integer cd_cnctivo;

    @JsonProperty("imagen")
    public String imagen;

    @JsonProperty("CrctrzcionCrta")
    public String CrctrzcionCrta;

    @JsonProperty("Descripcion")
    public String Descripcion;

    @JsonProperty("Cantidad")
    public Integer Cantidad;

    @JsonProperty("VlorTotal")
    public String VlorTotal;
}
