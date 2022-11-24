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
            name = "paC_Publicidad",
            procedureName = "paC_Publicidad",
            resultClasses = CPublicidadEntity.class)
})
public class CPublicidadEntity {

    @Id
    @JsonProperty("Id")
    public Integer Id;

    @JsonProperty("IdAccion")
    public Integer IdAccion;

    @JsonProperty("DesAccion")
    public String DesAccion;

    @JsonProperty("IdVista")
    public Integer IdVista;

    @JsonProperty("DesVista")
    public String DesVista;

    @JsonProperty("Imagen")
    public String Imagen;

    @JsonProperty("Patch")
    public String Patch;

    @JsonProperty("Orden")
    public Integer Orden;
}
