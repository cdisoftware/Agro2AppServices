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
            name = "admin_millaGrupos",
            procedureName = "admin_millaGrupos",
            resultClasses = admillaGruposEntity.class)
})
public class admillaGruposEntity {

    @Id
    @JsonProperty("IdCarro")
    public Integer IdCarro;

    @JsonProperty("IdGrupo")
    public Integer IdGrupo;

    @JsonProperty("Orden")
    public Integer Orden;

    @JsonProperty("DireccionEntrega")
    public String DireccionEntrega;

    @JsonProperty("CoordenadasEntrega")
    public String CoordenadasEntrega;

    @JsonProperty("NombrePersona")
    public String NombrePersona;

    @JsonProperty("CELULAR_PERSONA")
    public String CELULAR_PERSONA;

    @JsonProperty("Producto")
    public String Producto;
}
