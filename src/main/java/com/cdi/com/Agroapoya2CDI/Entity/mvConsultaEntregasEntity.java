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
            name = "movile_ConsultaEntregas",
            procedureName = "movile_ConsultaEntregas",
            resultClasses = mvConsultaEntregasEntity.class)
})
public class mvConsultaEntregasEntity {

    @Id
    @JsonProperty("ID")
    public Integer ID;

    @JsonProperty("IdSector")
    public Integer IdSector;

    @JsonProperty("ID_CARRO")
    public Integer ID_CARRO;

    @JsonProperty("CD_CNSCTVO")
    public Integer CD_CNSCTVO;

    @JsonProperty("id_evidencia")
    public Integer id_evidencia;

    @JsonProperty("IdGrupoMilla")
    public Integer IdGrupoMilla;

    @JsonProperty("usucodigCliente")
    public Integer usucodigCliente;

    @JsonProperty("NOMBRES_PERSONA")
    public String NOMBRES_PERSONA;

    @JsonProperty("CELULAR_PERSONA")
    public String CELULAR_PERSONA;

    @JsonProperty("DRCCION")
    public String DRCCION;

    @JsonProperty("COORDENADAS_ENTR")
    public String COORDENADAS_ENTR;

    @JsonProperty("VLOR_PGAR")
    public String VLOR_PGAR;

    @JsonProperty("IdTipoPago")
    public Integer IdTipoPago;

    @JsonProperty("descTipoPago")
    public String descTipoPago;

    @JsonProperty("idEstado")
    public Integer idEstado;

    @JsonProperty("descEstado")
    public String descEstado;

    @JsonProperty("NMBRE_CNDCTOR")
    public String NMBRE_CNDCTOR;

    @JsonProperty("TEL_CNDCTOR")
    public String TEL_CNDCTOR;

    @JsonProperty("PLCA")
    public String PLCA;

    @JsonProperty("orden")
    public Integer orden;

    @JsonProperty("id_manychat")
    public String id_manychat;

    @JsonProperty("EstadoEnvioWhat")
    public Integer EstadoEnvioWhat;
}
