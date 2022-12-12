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
            name = "paCAgro_resumen_oferta_menu",
            procedureName = "paCAgro_resumen_oferta_menu",
            resultClasses = CAgroRmenOfertaMenuEntity.class)
})
public class CAgroRmenOfertaMenuEntity {

    @Id
    @JsonProperty("codigo")
    public Integer codigo;

    @JsonProperty("descripcion")
    public String descripcion;

    @JsonProperty("registro")
    public Integer registro;
}
