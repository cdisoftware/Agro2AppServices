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
            name = "paCRrazabilidadEstadoOferta",
            procedureName = "paCRrazabilidadEstadoOferta",
            resultClasses = CTrazabilidadEstadoOfertaEntity.class)
})
public class CTrazabilidadEstadoOfertaEntity {

    @Id
    @JsonProperty("ID")
    public Integer ID;

    @JsonProperty("fecha")
    public String fecha;

    @JsonProperty("estado")
    public String estado;

    @JsonProperty("usuario")
    public String usuario;
    
    @JsonProperty("observaciones")
    public String observaciones;
}
