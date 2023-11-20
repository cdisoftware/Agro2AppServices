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
            name = "admin_millaTransportes",
            procedureName = "admin_millaTransportes",
            resultClasses = adminMillaTransportesEntity.class)
})
public class adminMillaTransportesEntity {

    @Id
    @JsonProperty("IdTrans")
    public Integer IdTrans;

    @JsonProperty("IdGrupoMilla")
    public Integer IdGrupoMilla;

    @JsonProperty("IdTipoTrans")
    public Integer IdTipoTrans;

    @JsonProperty("IdEstadoTrans")
    public Integer IdEstadoTrans;

    @JsonProperty("DesEstadoTrans")
    public String DesEstadoTrans;

    @JsonProperty("IdCondutor")
    public Integer IdCondutor;

    @JsonProperty("UsucodigTrans")
    public Integer UsucodigTrans;

    @JsonProperty("NombreTrans")
    public String NombreTrans;

    @JsonProperty("NombreConductor")
    public String NombreConductor;

    @JsonProperty("PlacaConductor")
    public String PlacaConductor;

    @JsonProperty("TelefonoConductor")
    public String TelefonoConductor;

    @JsonProperty("ValorFlete")
    public String ValorFlete;

    @JsonProperty("Unidades")
    public Integer Unidades;

    @JsonProperty("FechaRecoge")
    public String FechaRecoge;

    @JsonProperty("UbicacionRecoge")
    public String UbicacionRecoge;

    @JsonProperty("UbicacionEntrega")
    public String UbicacionEntrega;

    @JsonProperty("NumeroParadas")
    public Integer NumeroParadas;

    @JsonProperty("PesoKilos")
    public Integer PesoKilos;

    @JsonProperty("NombreGrupo")
    public String NombreGrupo;

}
