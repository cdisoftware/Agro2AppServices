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
            name = "agro_DescuentoConsulta",
            procedureName = "agro_DescuentoConsulta",
            resultClasses = agroDescuentoConsultaEntity.class)
})
public class agroDescuentoConsultaEntity {

    @Id
    @JsonProperty("id")
    public Integer id;

    @JsonProperty("Cd_cnsctvo")
    public Integer Cd_cnsctvo;

    @JsonProperty("id_sctor")
    public Integer id_sctor;

    @JsonProperty("ValorDesde")
    public String ValorDesde;

    @JsonProperty("Descuento")
    public String Descuento;

}
