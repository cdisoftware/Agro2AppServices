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
            name = "admin_SeguiTarjetaDetalle",
            procedureName = "admin_SeguiTarjetaDetalle",
            resultClasses = admin_SeguiTarjetaDetalleEntity.class)
})
public class admin_SeguiTarjetaDetalleEntity {

    @Id
    @JsonProperty("IdGrupoMilla")
    public Integer IdGrupoMilla;

    @JsonProperty("NombreGrupo")
    public String NombreGrupo;

    @JsonProperty("UbicacionEntrega")
    public String UbicacionEntrega;

    @JsonProperty("NumeroParadas")
    public Integer NumeroParadas;

    @JsonProperty("idConductor")
    public Integer idConductor;

    @JsonProperty("NombreConductor")
    public String NombreConductor;

    @JsonProperty("NombreBodegaSalida")
    public String NombreBodegaSalida;

    @JsonProperty("DirBodSalida")
    public String DirBodSalida;

    @JsonProperty("FechaTransporte")
    public String FechaTransporte;
}
