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
            name = "pac_CalculadoraTrans",
            procedureName = "pac_CalculadoraTrans",
            resultClasses = cCalculadoraTransEntity.class)
})
public class cCalculadoraTransEntity {

    @Id
    @JsonProperty("Id")
    public Integer Id;

    @JsonProperty("ValorTotal")
    public String ValorTotal;

    @JsonProperty("ValorSubTotal")
    public String ValorSubTotal;

    @JsonProperty("ValorDomicilio")
    public String ValorDomicilio;

    @JsonProperty("Topping")
    public String Topping;

}
