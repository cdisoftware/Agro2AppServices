package com.cdi.com.Agroapoya2CDI.Entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import lombok.Data;

@Entity
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@NamedStoredProcedureQueries({
    @NamedStoredProcedureQuery(
            name = "sp_SolicitarPagoComision_PorVecino",
            procedureName = "sp_SolicitarPagoComision_PorVecino",
            resultClasses = sp_SolicitarPagoComision_PorVecinoEntity.class)
})
public class sp_SolicitarPagoComision_PorVecinoEntity {

    @Id
    @JsonProperty("ComisionesSolicitadas")
    public Integer ComisionesSolicitadas;

    @JsonProperty("UsucodigEmbajador")
    public Integer UsucodigEmbajador;

    @JsonProperty("UsucodigVecino")
    public Integer UsucodigVecino;

    @JsonProperty("TipoDePago")
    public String TipoDePago;

    @JsonProperty("LlaveDePago")
    public String LlaveDePago;

}
