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
            name = "sp_ListarVecinosEmbajador",
            procedureName = "sp_ListarVecinosEmbajador",
            resultClasses = sp_ListarVecinosEmbajadorEntity.class)
})
public class sp_ListarVecinosEmbajadorEntity {

    @Id
    @JsonProperty("UsucodigVecino")
    public Integer UsucodigVecino;

    @JsonProperty("NombreCliente")
    public String NombreCliente;

    @JsonProperty("Telefono")
    public String Telefono;

    @JsonProperty("DireccionEntrega")
    public String DireccionEntrega;

    @JsonProperty("FechaRelacion")
    public String FechaRelacion;

    @JsonProperty("TotalCompras")
    public Integer TotalCompras;

    @JsonProperty("ComprasPendientesEntrega")
    public Integer ComprasPendientesEntrega;

    @JsonProperty("ComprasEntregadas")
    public Integer ComprasEntregadas;

    @JsonProperty("ComprasCanceladas")
    public Integer ComprasCanceladas;

    @JsonProperty("GananciaPendienteReclamar")
    public String GananciaPendienteReclamar;

    @JsonProperty("GananciaEnProceso")
    public String GananciaEnProceso;

    @JsonProperty("GananciaReclamada")
    public String GananciaReclamada;

    @JsonProperty("GananciaNoHabilitada")
    public String GananciaNoHabilitada;

}
