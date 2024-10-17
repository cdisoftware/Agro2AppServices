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
            name = "z_OfertaRegalos_Cons",
            procedureName = "z_OfertaRegalos_Cons",
            resultClasses = zOfertaRegalosConsEntity.class)
})

public class zOfertaRegalosConsEntity {

    @Id
    @JsonProperty("Id")
    public Integer Id;

    @JsonProperty("IdTipoRegalo")
    public Integer IdTipoRegalo;

    @JsonProperty("DesTipoRegalo")
    public String DesTipoRegalo;

    @JsonProperty("AplicablePersona")
    public Integer AplicablePersona;

    @JsonProperty("DesAplicablePer")
    public String DesAplicablePer;

    @JsonProperty("TipoEstado")
    public Integer TipoEstado;

    @JsonProperty("DesTipoEstado")
    public String DesTipoEstado;
}
