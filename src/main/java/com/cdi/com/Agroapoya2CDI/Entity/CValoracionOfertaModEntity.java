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
            name = "paCValoracionOfertaMod",
            procedureName = "paCValoracionOfertaMod",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})

public class CValoracionOfertaModEntity {

    @Id
    @JsonProperty("CD_CNSCTVO")
    public Integer CD_CNSCTVO;

    @JsonProperty("TPO_OFRTA")
    public Integer TPO_OFRTA;

    @JsonProperty("TPO_CMSION_INDVDUAL")
    public Integer TPO_CMSION_INDVDUAL;

    @JsonProperty("VLOR_CMSION_INDVDUAL")
    public String VLOR_CMSION_INDVDUAL;

    @JsonProperty("MNMO_UNDDES_INDVDUAL")
    public String MNMO_UNDDES_INDVDUAL;

    @JsonProperty("MXMO_UNDDES_INDVDUAL")
    public String MXMO_UNDDES_INDVDUAL;

    @JsonProperty("VLOR_DMNCLIO_INDVDUAL")
    public String VLOR_DMNCLIO_INDVDUAL;

    @JsonProperty("VLOR_FNAL_INDVDUAL")
    public String VLOR_FNAL_INDVDUAL;

    @JsonProperty("TPO_CMSION_GRPAL")
    public String TPO_CMSION_GRPAL;

    @JsonProperty("VLOR_CMSION_GRPAL")
    public String VLOR_CMSION_GRPAL;

    @JsonProperty("MNMO_UNDDES_LIDER")
    public String MNMO_UNDDES_LIDER;

    @JsonProperty("MXMO_UNDDES_LIDER")
    public String MXMO_UNDDES_LIDER;

    @JsonProperty("PRCNTJE_DCTO_LIDER")
    public String PRCNTJE_DCTO_LIDER;

    @JsonProperty("VLOR_DMNCLIO_GRPAL")
    public String VLOR_DMNCLIO_GRPAL;

    @JsonProperty("CNTDAD_GRPOS")
    public String CNTDAD_GRPOS;

    @JsonProperty("MNMO_PRSNAS_XGRUPO")
    public String MNMO_PRSNAS_XGRUPO;

    @JsonProperty("MNMO_UNDDES_PRCPNTE")
    public String MNMO_UNDDES_PRCPNTE;

    @JsonProperty("MXMO_UNDDES_PRCPNTE")
    public String MXMO_UNDDES_PRCPNTE;

    @JsonProperty("CNTDAD_CMPRAS_INDVDLES")
    public String CNTDAD_CMPRAS_INDVDLES;

    @JsonProperty("VLOR_ARRNQUE_LIDER")
    public String VLOR_ARRNQUE_LIDER;

    @JsonProperty("VLOR_FNAL_PRTCPNTE")
    public String VLOR_FNAL_PRTCPNTE;

    @JsonProperty("ID_SCTOR_OFRTA")
    public Integer ID_SCTOR_OFRTA;

    @JsonProperty("LINKLANDIGN")
    public String LINKLANDIGN;

    @JsonProperty("TPO_DESCUENTO")
    public Integer TPO_DESCUENTO;

    @JsonProperty("VALOR_REFERENCIA")
    public Integer VALOR_REFERENCIA;

    @JsonProperty("TIPO_CUPON")
    public Integer TIPO_CUPON;

    @JsonProperty("DES_CUPONREGALO")
    public String DES_CUPONREGALO;

    @JsonProperty("IMG_CUPONREGALO")
    public String IMG_CUPONREGALO;

    @JsonProperty("IDTIPODOMICILIO")
    public Integer IDTIPODOMICILIO;

    @JsonProperty("VLORAPRTRDMCLIO")
    public Integer VLORAPRTRDMCLIO;

    @JsonProperty("NumUsuaCupo")
    public Integer NumUsuaCupo;

    @JsonProperty("DirigidaRegiVent")
    public Integer DirigidaRegiVent;

    @JsonProperty("PorcentajeCuponxCupon")
    public Integer PorcentajeCuponxCupon;

    @JsonProperty("Maximo_PorcentajeCuponxCupon")
    public Integer Maximo_PorcentajeCuponxCupon;
}
