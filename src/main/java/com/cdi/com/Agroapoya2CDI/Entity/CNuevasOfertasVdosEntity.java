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
            name = "paC_NuevasOfertas_Vdos",
            procedureName = "paC_NuevasOfertas_Vdos",
            resultClasses = CNuevasOfertasVdosEntity.class)
})
public class CNuevasOfertasVdosEntity {

    @Id
    @JsonProperty("id")
    public Integer id;

    @JsonProperty("PerSetor")
    public String PerSetor;

    @JsonProperty("cd_cnsctvo")
    public Integer cd_cnsctvo;

    @JsonProperty("imagenOferta")
    public String imagenOferta;

    @JsonProperty("Productor")
    public String Productor;

    @JsonProperty("Producto")
    public String Producto;

    @JsonProperty("DescripcionProducto")
    public String DescripcionProducto;

    @JsonProperty("CondicionEntrega")
    public String CondicionEntrega;

    @JsonProperty("Tamano")
    public String Tamano;

    @JsonProperty("Empaque")
    public String Empaque;

    @JsonProperty("Dep_Orig")
    public String Dep_Orig;

    @JsonProperty("Ciudad_Orig")
    public String Ciudad_Orig;

    @JsonProperty("CRCTRZCION")
    public String CRCTRZCION;

    @JsonProperty("IdSector")
    public Integer IdSector;

    @JsonProperty("DesSector")
    public String DesSector;

    @JsonProperty("IdTipoOferta")
    public Integer IdTipoOferta;

    @JsonProperty("DesTipoOferta")
    public String DesTipoOferta;

    @JsonProperty("VigenciaDesde")
    public String VigenciaDesde;

    @JsonProperty("VigenciaHasta")
    public String VigenciaHasta;

    @JsonProperty("HoraDesde")
    public String HoraDesde;

    @JsonProperty("hora_hasta")
    public String hora_hasta;

    @JsonProperty("FechaEntrega")
    public String FechaEntrega;

    @JsonProperty("ValorDomicilioInidvidual")
    public String ValorDomicilioInidvidual;

    @JsonProperty("ValorUndIndividual")
    public String ValorUndIndividual;

    @JsonProperty("ValorPrimeraUnidadText")
    public String ValorPrimeraUnidadText;

    @JsonProperty("ValorOtrasUnidadesText")
    public String ValorOtrasUnidadesText;

    @JsonProperty("ValorDomicilioGrupal")
    public String ValorDomicilioGrupal;

    @JsonProperty("NumGrupos")
    public String NumGrupos;

    @JsonProperty("PersonasXGrupo")
    public String PersonasXGrupo;

    @JsonProperty("PorcentajeDescLider")
    public String PorcentajeDescLider;

    @JsonProperty("ValorMinimoPagarLider")
    public String ValorMinimoPagarLider;

    @JsonProperty("ValorMaximoDesLider")
    public String ValorMaximoDesLider;

    @JsonProperty("ValorArranqueLider")
    public String ValorArranqueLider;

    @JsonProperty("ValorMinimoPagarLiderText")
    public String ValorMinimoPagarLiderText;

    @JsonProperty("ValorMaximoDesLiderText")
    public String ValorMaximoDesLiderText;

    @JsonProperty("LiderTextUno")
    public String LiderTextUno;

    @JsonProperty("LiderTextDos")
    public String LiderTextDos;

    @JsonProperty("ValorArranqueLiderText")
    public String ValorArranqueLiderText;

    @JsonProperty("ValorParticipante")
    public String ValorParticipante;

    @JsonProperty("ParticipanteText")
    public String ParticipanteText;

    @JsonProperty("DesUnoCampe")
    public String DesUnoCampe;

    @JsonProperty("DesDosCampe")
    public String DesDosCampe;

    @JsonProperty("DesTresCampe")
    public String DesTresCampe;

    @JsonProperty("ImgCampe")
    public String ImgCampe;

    @JsonProperty("ObsCampe")
    public String ObsCampe;

    @JsonProperty("ORDEN")
    public Integer ORDEN;

    @JsonProperty("ImgCorreo")
    public String ImgCorreo;

    @JsonProperty("valorReferenciaProd")
    public Integer valorReferenciaProd;

    @JsonProperty("mxmo_unddes_indvdual")
    public Integer mxmo_unddes_indvdual;

    @JsonProperty("UrlImagen")
    public String UrlImagen;

    @JsonProperty("carroPer")
    public String carroPer;

    @JsonProperty("tipo_cupon")
    public String tipo_cupon;

    @JsonProperty("desc_cupon")
    public String desc_cupon;

    @JsonProperty("img_cupon")
    public String img_cupon;

    @JsonProperty("IdTipoCompra")
    public Integer IdTipoCompra;

    @JsonProperty("DescTipoCompra")
    public String DescTipoCompra;

    @JsonProperty("mnmo_unddes_indvdual")
    public Integer mnmo_unddes_indvdual;

    @JsonProperty("idtipodomicilio")
    public Integer idtipodomicilio;

    @JsonProperty("VLORAPRTRDMCLIO")
    public String VLORAPRTRDMCLIO;

    @JsonProperty("ValorDmcilio")
    public String ValorDmcilio;

    @JsonProperty("UndRestantes")
    public Integer UndRestantes;

    @JsonProperty("TituloModal")
    public String TituloModal;

    @JsonProperty("TextoModal")
    public String TextoModal;

    @JsonProperty("TycGrupo")
    public String TycGrupo;

    @JsonProperty("TipoVentaRegistro")
    public String TipoVentaRegistro;

    @JsonProperty("PorDecuento")
    public String PorDecuento;

    @JsonProperty("VigenciaDesdeForm")
    public String VigenciaDesdeForm;

    @JsonProperty("VigenciaHastaForm")
    public String VigenciaHastaForm;

    @JsonProperty("FechaEntregaForm")
    public String FechaEntregaForm;

    @JsonProperty("UsucodigCampesino")
    public Integer UsucodigCampesino;

    @JsonProperty("UndEmpa")
    public Integer UndEmpa;

    @JsonProperty("defectpEmpa")
    public Integer defectpEmpa;

    @JsonProperty("CD_PRDCTO")
    public Integer CD_PRDCTO;

    @JsonProperty("TieneReceta")
    public Integer TieneReceta;

    @JsonProperty("TieneConserva")
    public Integer TieneConserva;
}
