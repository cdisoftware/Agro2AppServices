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
            name = "pac_RelacionProdTopping",
            procedureName = "pac_RelacionProdTopping",
            resultClasses = CRelacionProdToppingEntity.class)
})
public class CRelacionProdToppingEntity {

    @Id
    @JsonProperty("IdRelacion")
    public Integer IdRelacion;

    @JsonProperty("Presentacion")
    public String Presentacion;

    @JsonProperty("ValorUnitario")
    public String ValorUnitario;

    @JsonProperty("VlorRefencia")
    public String VlorRefencia;

    @JsonProperty("MaxCantidad")
    public Integer MaxCantidad;

    @JsonProperty("cantidadReserva")
    public Integer cantidadReserva;

    @JsonProperty("PesoKilos")
    public Integer PesoKilos;

    @JsonProperty("Ancla")
    public Integer Ancla;

    @JsonProperty("cant_disponible")
    public Integer cant_disponible;
}
