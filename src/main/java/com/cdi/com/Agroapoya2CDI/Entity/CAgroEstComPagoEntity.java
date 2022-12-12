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
            name = "paCAgro_estados_compra_pago",
            procedureName = "paCAgro_estados_compra_pago",
            resultClasses = CAgroEstComPagoEntity.class)
})
public class CAgroEstComPagoEntity {

    @Id
    @JsonProperty("codigo")
    public Integer codigo;

    @JsonProperty("descripcion")
    public String descripcion;
}
