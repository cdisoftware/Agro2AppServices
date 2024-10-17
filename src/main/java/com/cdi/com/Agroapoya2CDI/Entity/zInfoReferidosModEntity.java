package com.cdi.com.Agroapoya2CDI.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import lombok.Data;

@Entity
@Data
@NamedStoredProcedureQueries({
    @NamedStoredProcedureQuery(
            name = "z_InfoReferidosMod",
            procedureName = "z_InfoReferidosMod",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})

public class zInfoReferidosModEntity {

    @Id
    @JsonProperty("IdOfertaActivaInformacion")
    public Integer IdOfertaActivaInformacion;

    @JsonProperty("TipoRegaloParti")
    public Integer TipoRegaloParti;

    @JsonProperty("TipoRegaloLider")
    public Integer TipoRegaloLider;
}
