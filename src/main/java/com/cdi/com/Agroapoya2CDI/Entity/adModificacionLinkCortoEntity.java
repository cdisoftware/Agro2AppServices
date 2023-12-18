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
            name = "admin_ModificacionLinkCorto",
            procedureName = "admin_ModificacionLinkCorto",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class adModificacionLinkCortoEntity {

    @Id
    @JsonProperty("cd_cnsctvo")
    public Integer cd_cnsctvo;

    @JsonProperty("IdSector")
    public Integer IdSector;

    @JsonProperty("Cod_descuento")
    public Integer Cod_descuento;

    @JsonProperty("id_carro")
    public Integer id_carro;

    @JsonProperty("idGrupo")
    public Integer idGrupo;

    @JsonProperty("UrlLarga")
    public String UrlLarga;

}
