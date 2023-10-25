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
            name = "paCValoracionOferta",
            procedureName = "paCValoracionOferta",
            resultClasses = CValoracionOfertaEntity.class)
})
public class CValoracionOfertaEntity {

    @Id
    @JsonProperty("CD_CNSCTVO")
    public Integer CD_CNSCTVO;

    @JsonProperty("TPO_OFRTA")
    public Integer TPO_OFRTA;

    @JsonProperty("Dscpcion_tpo_ofrta")
    public String Dscpcion_tpo_ofrta;

    @JsonProperty("tpo_cmsion_indvdual")
    public Integer tpo_cmsion_indvdual;

    @JsonProperty("Nom_tpo_cmsion_indvdual")
    public String Nom_tpo_cmsion_indvdual;

    @JsonProperty("vlor_cmsion_indvdual")
    public String vlor_cmsion_indvdual;

    @JsonProperty("mnmo_unddes_indvdual")
    public Integer mnmo_unddes_indvdual;

    @JsonProperty("mxmo_unddes_indvdual")
    public Integer mxmo_unddes_indvdual;

    @JsonProperty("vlor_dmnclio_indvdual")
    public String vlor_dmnclio_indvdual;

    @JsonProperty("vlor_fnal_indvdual")
    public String vlor_fnal_indvdual;

    @JsonProperty("tpo_cmsion_grpal")
    public Integer tpo_cmsion_grpal;

    @JsonProperty("Nom_tpo_cmsion_grpal")
    public String Nom_tpo_cmsion_grpal;

    @JsonProperty("vlor_cmsion_grpal")
    public String vlor_cmsion_grpal;

    @JsonProperty("mnmo_unddes_lider")
    public String mnmo_unddes_lider;

    @JsonProperty("mxmo_unddes_lider")
    public String mxmo_unddes_lider;

    @JsonProperty("prcntje_dcto_lider")
    public String prcntje_dcto_lider;

    @JsonProperty("vlor_dmnclio_grpal")
    public String vlor_dmnclio_grpal;

    @JsonProperty("cntdad_grpos")
    public String cntdad_grpos;

    @JsonProperty("mnmo_prsnas_xgrupo")
    public String mnmo_prsnas_xgrupo;

    @JsonProperty("mnmo_unddes_prcpnte")
    public String mnmo_unddes_prcpnte;

    @JsonProperty("mxmo_unddes_prcpnte")
    public String mxmo_unddes_prcpnte;

    @JsonProperty("cntdad_cmpras_indvdles")
    public String cntdad_cmpras_indvdles;

    @JsonProperty("vlor_arrnque_lider")
    public String vlor_arrnque_lider;

    @JsonProperty("vlor_fnal_prtcpnte")
    public String vlor_fnal_prtcpnte;

    @JsonProperty("tpo_descuento")
    public Integer tpo_descuento;

    @JsonProperty("valorReferenciaProd")
    public String valorReferenciaProd;

    @JsonProperty("tipo_cupon")
    public String tipo_cupon;

    @JsonProperty("desc_cupon")
    public String desc_cupon;

    @JsonProperty("img_cupon")
    public String img_cupon;

    @JsonProperty("IDTIPODOMICILIO")
    public Integer IDTIPODOMICILIO;

    @JsonProperty("VLORAPRTRDMCLIO")
    public String VLORAPRTRDMCLIO;

    @JsonProperty("NumUsuaCupo")
    public Integer NumUsuaCupo;

    @JsonProperty("DirRegistroVentas")
    public Integer DirRegistroVentas;
}
