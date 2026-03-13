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
            name = "sp_ReporteVecinoConjuntos",
            procedureName = "sp_ReporteVecinoConjuntos",
            resultClasses = sp_ReporteVecinoConjuntosEntity.class)
})
public class sp_ReporteVecinoConjuntosEntity {

    @Id
    @JsonProperty("Id")
    public Integer Id;

    @JsonProperty("NombreVecino")
    public String NombreVecino;

    @JsonProperty("CorreoVecino")
    public String CorreoVecino;

    @JsonProperty("CelularVecino")
    public String CelularVecino;

    @JsonProperty("UsucodigVecino")
    public String UsucodigVecino;

    @JsonProperty("FechaRelacion")
    public String FechaRelacion;

    @JsonProperty("DireccionVecino")
    public String DireccionVecino;

    @JsonProperty("NumeroComprasVecino")
    public String NumeroComprasVecino;

    @JsonProperty("ValorComprasVecino")
    public String ValorComprasVecino;

    @JsonProperty("NoPendientes")
    public String NoPendientes;

    @JsonProperty("NoReclamadas")
    public String NoReclamadas;

    @JsonProperty("ValorGananciaReclamada")
    public String ValorGananciaReclamada;

    @JsonProperty("ValorGananciaPendiente")
    public String ValorGananciaPendiente;
    
    @JsonProperty("NoProceso")
    public String NoProceso;

    @JsonProperty("ValorGananciaProceso")
    public String ValorGananciaProceso;

}
