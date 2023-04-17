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
            name = "pac_OfertaEstados",
            procedureName = "pac_OfertaEstados",
            resultClasses = COfertaEstadosEntity.class)
})
public class COfertaEstadosEntity {

    @Id
    @JsonProperty("CD_CNSCTVO")
    public Integer CD_CNSCTVO;

    @JsonProperty("Nombre_Producto")
    public String Nombre_Producto;

    @JsonProperty("descipcion")
    public String descipcion;
}
