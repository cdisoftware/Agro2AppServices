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
            name = "paCOfertaMod",
            procedureName = "paCOfertaMod",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class COfertaModEntity {

    @Id
    @JsonProperty("ID_PRODUCTOR")
    public String ID_PRODUCTOR;

    @JsonProperty("CD_PRDCTO")
    public String CD_PRDCTO;

    @JsonProperty("UND_EMPQUE")
    public String UND_EMPQUE;

    @JsonProperty("CD_CNDCION")
    public String CD_CNDCION;

    @JsonProperty("CD_TMNO")
    public String CD_TMNO;

    @JsonProperty("DSCRPCION_PRDCTO")
    public String DSCRPCION_PRDCTO;

    @JsonProperty("VR_UNDAD_EMPQUE")
    public String VR_UNDAD_EMPQUE;

    @JsonProperty("CD_UNDAD")
    public String CD_UNDAD;

    @JsonProperty("VR_TOTAL_OFRTA")
    public String VR_TOTAL_OFRTA;

    @JsonProperty("VGNCIA_DESDE")
    public String VGNCIA_DESDE;

    @JsonProperty("CD_JRNDA")
    public String CD_JRNDA;

    @JsonProperty("CD_RGION")
    public String CD_RGION;

    @JsonProperty("CD_MNCPIO")
    public String CD_MNCPIO;

    @JsonProperty("UBCCION_PRCLA")
    public String UBCCION_PRCLA;

    @JsonProperty("COORDENADAS_PRCLA")
    public String COORDENADAS_PRCLA;

    @JsonProperty("USUCODIG")
    public String USUCODIG;

    @JsonProperty("CD_CNSCTVO")
    public String CD_CNSCTVO;

    @JsonProperty("CRCTRZCION")
    public String CRCTRZCION;

    @JsonProperty("OBS_EDICION")
    public String OBS_EDICION;

    @JsonProperty("IMAGEN1")
    public String IMAGEN1;

    @JsonProperty("IMAGEN2")
    public String IMAGEN2;

    @JsonProperty("IMAGEN3")
    public String IMAGEN3;

    @JsonProperty("IMAGEN4")
    public String IMAGEN4;

    @JsonProperty("IMAGEN5")
    public String IMAGEN5;

}
