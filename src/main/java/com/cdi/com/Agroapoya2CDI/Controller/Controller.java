package com.cdi.com.Agroapoya2CDI.Controller;

import com.cdi.com.Agroapoya2CDI.Entity.AGROPREGUNTAMODEntity;
import com.cdi.com.Agroapoya2CDI.Entity.AOfertasEntity;
import com.cdi.com.Agroapoya2CDI.Entity.AestadoOfertaModEntity;
import com.cdi.com.Agroapoya2CDI.Entity.AgroCompraUsuModEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CAPlantillaCorreoModEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CATipoCamposCorreoEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CAgroEstComPagoEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CAgroPreguntaOfertaEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CAgroPreguntaOfertaModEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CAgroPreguntasEncuestaEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CAgroRespEncCompEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CAgroRespuestasEncuestaModEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CAgroRmenOfertaMenuEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CAgroTipoNovedadEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CAgroValidaEncuestaEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CAgro_GruposUltimaMillaEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CAplantillaCorreoEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CAsignaBodegaModEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CCalculaPrecioFinGrupalEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CCalculaPrecioFinIndividualEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CCalculaPrecioFinMixtaEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CCalificaAppEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CCambiaEstadoOfertaModEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CCarroComprasEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CCarroComprasModEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CCarroLinkModEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CCiudadDistribucionOfertEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CComprasEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CComprasModEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CConductorCondEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CConductorEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CConductorSectorOfertaEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CConductorSectorOfertaModEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CConsultaEstadoOfertaEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CCordenadasSectorEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CCordenadasSectorModEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CDatBasicSubItemEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CDatosBasicosSubItemModEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CDatosTransportistaEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CDetalleNuevosTransAppEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CDocumentoCorreoEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CDocumentoCorreoModEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CDtlleDescargasEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CDtlleDescargasModEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CEntregaSegEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CEnvioCorreoIndEmailEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CEstadoTransporteModEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CGeneracionQueryEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CGrupoMillaModEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CHistorialComprasEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CInfoOfertaEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CLinkConsultaEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CLinkSectorEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CLinkSectorService;
import com.cdi.com.Agroapoya2CDI.Entity.CLinksCPyGModEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CLinksModEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CListaConductorEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CListadoToppingEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CMascaraDatBasicEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CMisToppingsEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CModuloModEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CNovedadModEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CNuevasOfertasEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CNuevasOfertasVdosEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CNuevosTransAppEntity;
import com.cdi.com.Agroapoya2CDI.Entity.COfertaEntity;
import com.cdi.com.Agroapoya2CDI.Entity.COfertaEstadosEntity;
import com.cdi.com.Agroapoya2CDI.Entity.COfertaImagenModEntity;
import com.cdi.com.Agroapoya2CDI.Entity.COfertaModEntity;
import com.cdi.com.Agroapoya2CDI.Entity.COfertasExternasEntity;
import com.cdi.com.Agroapoya2CDI.Entity.COfertasNuevasEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CPersonaMenuEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CPersonaTransEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CPersonasEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CPinMillaModEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CPinUltimaMillaEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CPubliModEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CPublicidadEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CPublicidadModEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CRelacionDBasicosSubItemEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CRelacionDBasicosSubItemsModEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CRelacionDatosBasicosEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CRelacionLiderPartiEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CRelacionLiderPartiModEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CReporteOfertasEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CReporteUsuariosEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CReporteVentasEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CSectorConductorEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CSectorOfertaEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CSectorOfertaModEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CSeguimientoGeneralEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CSubSeguimientoEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CTipoCamposMasivoEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CTipoClienteEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CTipoConductorEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CTipoCosteoModEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CTipoCosteoOfertaEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CTipoNoEntrgaEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CTipoPagosTransEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CTipoToppinEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CTipoTransporEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CToppingModEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CTransportesNuevosEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CTrazabilidadEstadoOfertaEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CUltimaMillaInicialEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CUnidadesDisponiblesEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CUnidadesDisponiblesListaEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CValidaCodigoEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CValorUbersGeneralEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CValorUbersOfertaModEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CValoracionOfertaEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CValoracionOfertaModEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CVigenciaOfertaEntoty;
import com.cdi.com.Agroapoya2CDI.Entity.CVigenciaOfertaModEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CZonasSectorEntity;
import com.cdi.com.Agroapoya2CDI.Entity.C_LinkEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CalcSidorPgsClintEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CalculadoraPagosClienteEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CalificaProdModEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CcarrroLinkGrupoEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CconductoresTransportesNuevosEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CcorreoManualEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CcorreoManualModEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CdescargasTransEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CdetalleAppEntity;
import com.cdi.com.Agroapoya2CDI.Entity.ChatGPTentity;
import com.cdi.com.Agroapoya2CDI.Entity.CiudadOfertaModEntity;
import com.cdi.com.Agroapoya2CDI.Entity.ClientePagosTransEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CondrsTransNMillaEntity;
import com.cdi.com.Agroapoya2CDI.Entity.ConductorEntity;
import com.cdi.com.Agroapoya2CDI.Entity.ConductorOfertaModEntity;
import com.cdi.com.Agroapoya2CDI.Entity.ConductorSectorModEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CorreoMomentoEnvioEntoty;
import com.cdi.com.Agroapoya2CDI.Entity.CorreosMasivosPandaEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CosteoOfertaEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CosteoOfertaModEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CpagosLiderEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CparticipanteGrupoEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CperfilClienteEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CpersonaCampesinoModEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CpersonaClienteModEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CpersonaTransportistaModEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CseguimientoEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CtableroEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CtableroModEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CtipoMomentoEnvioEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CtipoPlantillaEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CtipoUsuarioEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CtokenPersonaModEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CtorUltMillaModEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CultimMillaEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CultimaUbicacionEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CundCarroModEntity;
import com.cdi.com.Agroapoya2CDI.Entity.CusuariosCorreoEntity;
import com.cdi.com.Agroapoya2CDI.Entity.EmailEntity;
import com.cdi.com.Agroapoya2CDI.Entity.EncriptacionEntity;
import com.cdi.com.Agroapoya2CDI.Entity.EnvioCorreo_IndividualEntity;
import com.cdi.com.Agroapoya2CDI.Entity.EnvioSMSNuevaEntregaEntity;
import com.cdi.com.Agroapoya2CDI.Entity.EstadosOfertaEntity;
import com.cdi.com.Agroapoya2CDI.Entity.INFOGENERALEntity;
import com.cdi.com.Agroapoya2CDI.Entity.ImagesApiEntity;
import com.cdi.com.Agroapoya2CDI.Entity.JornadasOfertaEntity;
import com.cdi.com.Agroapoya2CDI.Entity.ListasDatosBancoEntity;
import com.cdi.com.Agroapoya2CDI.Entity.MV_INSERT_AGRO_PERSONASVDOSEntity;
import com.cdi.com.Agroapoya2CDI.Entity.OfertasCarritoComprasEntity;
import com.cdi.com.Agroapoya2CDI.Entity.OfertasHistorialEntity;
import com.cdi.com.Agroapoya2CDI.Entity.ProductoEntity;
import com.cdi.com.Agroapoya2CDI.Entity.RemitenteCorreoEntity;
import com.cdi.com.Agroapoya2CDI.Entity.SELECT_MNCPIOEntity;
import com.cdi.com.Agroapoya2CDI.Entity.SectoresEntity;
import com.cdi.com.Agroapoya2CDI.Entity.SectoresModEntity;
import com.cdi.com.Agroapoya2CDI.Entity.Select_TipoDocumentoEntity;
import com.cdi.com.Agroapoya2CDI.Entity.SmsItCloudEntity;
import com.cdi.com.Agroapoya2CDI.Entity.TBodegasEntity;
import com.cdi.com.Agroapoya2CDI.Entity.TDatosBasicosEntity;
import com.cdi.com.Agroapoya2CDI.Entity.THoraioTareaEntity;
import com.cdi.com.Agroapoya2CDI.Entity.TModDatosBasicEntity;
import com.cdi.com.Agroapoya2CDI.Entity.TSectoresEtvEntity;
import com.cdi.com.Agroapoya2CDI.Entity.TSubMenuEntity;
import com.cdi.com.Agroapoya2CDI.Entity.TaccionPubliEntity;
import com.cdi.com.Agroapoya2CDI.Entity.TipObliCorreoManualEntity;
import com.cdi.com.Agroapoya2CDI.Entity.TipObliCrroManModEntity;
import com.cdi.com.Agroapoya2CDI.Entity.TipoViasEntity;
import com.cdi.com.Agroapoya2CDI.Entity.TransActivosEntity;
import com.cdi.com.Agroapoya2CDI.Entity.TvistasPubliEntity;
import com.cdi.com.Agroapoya2CDI.Entity.UploadFileResponse;
import com.cdi.com.Agroapoya2CDI.Entity.UrlShortnerEntity;
import com.cdi.com.Agroapoya2CDI.Entity.UsuarioAdminEntity;
import com.cdi.com.Agroapoya2CDI.Entity.cTipoPreguntaEntity;
import com.cdi.com.Agroapoya2CDI.Entity.cliente_select_ofertasNuevasEntity;
import com.cdi.com.Agroapoya2CDI.Entity.conductorModEntity;
import com.cdi.com.Agroapoya2CDI.Entity.consultaProductoEntity;
import com.cdi.com.Agroapoya2CDI.Entity.entregasConductorEntity;
import com.cdi.com.Agroapoya2CDI.Entity.estadoEntregaEntity;
import com.cdi.com.Agroapoya2CDI.Entity.evidenciaEntity;
import com.cdi.com.Agroapoya2CDI.Entity.evidenciaModEntity;
import com.cdi.com.Agroapoya2CDI.Entity.imagenesOfertaEntity;
import com.cdi.com.Agroapoya2CDI.Entity.listaCondicionEntity;
import com.cdi.com.Agroapoya2CDI.Entity.listaEmpaqueEntity;
import com.cdi.com.Agroapoya2CDI.Entity.listaTamanoEntity;
import com.cdi.com.Agroapoya2CDI.Entity.loginClienteEntity;
import com.cdi.com.Agroapoya2CDI.Entity.loginTransEntity;
import com.cdi.com.Agroapoya2CDI.Entity.menuEntity;
import com.cdi.com.Agroapoya2CDI.Entity.mv_CiudadesActivasEntity;
import com.cdi.com.Agroapoya2CDI.Entity.mv_EnvioCorreoTransprtistaViejeEntity;
import com.cdi.com.Agroapoya2CDI.Entity.mv_infoBasicaUsuarioEntity;
import com.cdi.com.Agroapoya2CDI.Entity.mv_listaSectoresConOfertasEntity;
import com.cdi.com.Agroapoya2CDI.Entity.pa_CTextosOfertaConsultaEntity;
import com.cdi.com.Agroapoya2CDI.Entity.pa_CTextosOfertaEntity;
import com.cdi.com.Agroapoya2CDI.Entity.productosEntity;
import com.cdi.com.Agroapoya2CDI.Entity.tipo_carro_carroceriaEntity;
import com.cdi.com.Agroapoya2CDI.Entity.tipo_carro_pesoEntity;
import com.cdi.com.Agroapoya2CDI.ServiceImplementacion.FileStorageException;
import com.cdi.com.Agroapoya2CDI.ServiceImplementacion.FileStorageService;
import com.cdi.com.Agroapoya2CDI.Services.AGROPREGUNTAMODService;
import com.cdi.com.Agroapoya2CDI.Services.AOfertasService;
import com.cdi.com.Agroapoya2CDI.Services.AestadoOfertaModService;
import com.cdi.com.Agroapoya2CDI.Services.AgroCompraUsuModService;
import com.cdi.com.Agroapoya2CDI.Services.CALCULADORA_VALORPAGOService;
import com.cdi.com.Agroapoya2CDI.Services.CAPlantillaCorreoModService;
import com.cdi.com.Agroapoya2CDI.Services.CATipoCamposCorreoService;
import com.cdi.com.Agroapoya2CDI.Services.CAgGruposUltimaMillaService;
import com.cdi.com.Agroapoya2CDI.Services.CAgroEstComPagoService;
import com.cdi.com.Agroapoya2CDI.Services.CAgroPreguntaOfertaModService;
import com.cdi.com.Agroapoya2CDI.Services.CAgroPreguntaOfertaService;
import com.cdi.com.Agroapoya2CDI.Services.CAgroPreguntasEncuestaService;
import com.cdi.com.Agroapoya2CDI.Services.CAgroRespEncCompService;
import com.cdi.com.Agroapoya2CDI.Services.CAgroRespuestasEncuestaModService;
import com.cdi.com.Agroapoya2CDI.Services.CAgroRmenOfertaMenuService;
import com.cdi.com.Agroapoya2CDI.Services.CAgroTipoNovedadService;
import com.cdi.com.Agroapoya2CDI.Services.CAgroValidaEncuestaService;
import com.cdi.com.Agroapoya2CDI.Services.CAplantillaCorreoService;
import com.cdi.com.Agroapoya2CDI.Services.CAsignaBodegaModService;
import com.cdi.com.Agroapoya2CDI.Services.CCalculaPrecioFinGrupalService;
import com.cdi.com.Agroapoya2CDI.Services.CCalculaPrecioFinIndividualService;
import com.cdi.com.Agroapoya2CDI.Services.CCalculaPrecioFinMixtaService;
import com.cdi.com.Agroapoya2CDI.Services.CCalificaAppService;
import com.cdi.com.Agroapoya2CDI.Services.CCambiaEstadoOfertaModService;
import com.cdi.com.Agroapoya2CDI.Services.CCarroCompraService;
import com.cdi.com.Agroapoya2CDI.Services.CCarroComprasModService;
import com.cdi.com.Agroapoya2CDI.Services.CCarroLinkModService;
import com.cdi.com.Agroapoya2CDI.Services.CCiudadDistribucionOfertService;
import com.cdi.com.Agroapoya2CDI.Services.CComprasModService;
import com.cdi.com.Agroapoya2CDI.Services.CComprasService;
import com.cdi.com.Agroapoya2CDI.Services.CConductorCondService;
import com.cdi.com.Agroapoya2CDI.Services.CConductorSectorOfertaModService;
import com.cdi.com.Agroapoya2CDI.Services.CConductorSectorOfertaService;
import com.cdi.com.Agroapoya2CDI.Services.CConductorService;
import com.cdi.com.Agroapoya2CDI.Services.CConsultaEstadoOfertaService;
import com.cdi.com.Agroapoya2CDI.Services.CCordenadasSectorModService;
import com.cdi.com.Agroapoya2CDI.Services.CCordenadasSectorService;
import com.cdi.com.Agroapoya2CDI.Services.CDatBasicSubItemService;
import com.cdi.com.Agroapoya2CDI.Services.CDatosBasicosSubItemModService;
import com.cdi.com.Agroapoya2CDI.Services.CDatosTransportistaService;
import com.cdi.com.Agroapoya2CDI.Services.CDetalleNuevosTransAppService;
import com.cdi.com.Agroapoya2CDI.Services.CDocumentoCorreoModService;
import com.cdi.com.Agroapoya2CDI.Services.CDocumentoCorreoService;
import com.cdi.com.Agroapoya2CDI.Services.CDtlleDescargaService;
import com.cdi.com.Agroapoya2CDI.Services.CDtlleDescargasModService;
import com.cdi.com.Agroapoya2CDI.Services.CEntregaSegService;
import com.cdi.com.Agroapoya2CDI.Services.CEnvioCodigoCorreoService;
import com.cdi.com.Agroapoya2CDI.Services.CEnvioCorreoIndEmailService;
import com.cdi.com.Agroapoya2CDI.Services.CEnvioRealCorreoService;
import com.cdi.com.Agroapoya2CDI.Services.CEstadoTransporteModService;
import com.cdi.com.Agroapoya2CDI.Services.CGeneracionQueryService;
import com.cdi.com.Agroapoya2CDI.Services.CGrupoMillaModService;
import com.cdi.com.Agroapoya2CDI.Services.CHistorialCompraService;
import com.cdi.com.Agroapoya2CDI.Services.CInfoOfertaService;
import com.cdi.com.Agroapoya2CDI.Services.CLinkConsultaService;
import com.cdi.com.Agroapoya2CDI.Services.CLinksCPyGModService;
import com.cdi.com.Agroapoya2CDI.Services.CLinksModService;
import com.cdi.com.Agroapoya2CDI.Services.CListaConductorService;
import com.cdi.com.Agroapoya2CDI.Services.CListadoToppingService;
import com.cdi.com.Agroapoya2CDI.Services.CMascaraDatBasicService;
import com.cdi.com.Agroapoya2CDI.Services.CMisToppingsService;
import com.cdi.com.Agroapoya2CDI.Services.CModuloModService;
import com.cdi.com.Agroapoya2CDI.Services.CNovedadModService;
import com.cdi.com.Agroapoya2CDI.Services.CNuevasOfertasService;
import com.cdi.com.Agroapoya2CDI.Services.CNuevasOfertasVdoService;
import com.cdi.com.Agroapoya2CDI.Services.CNuevosTransAppService;
import com.cdi.com.Agroapoya2CDI.Services.CNumUsuSectorService;
import com.cdi.com.Agroapoya2CDI.Services.COfertaEstadosService;
import com.cdi.com.Agroapoya2CDI.Services.COfertaImagenModService;
import com.cdi.com.Agroapoya2CDI.Services.COfertaModService;
import com.cdi.com.Agroapoya2CDI.Services.COfertaService;
import com.cdi.com.Agroapoya2CDI.Services.COfertasExternasService;
import com.cdi.com.Agroapoya2CDI.Services.COfertasNuevasService;
import com.cdi.com.Agroapoya2CDI.Services.CPagosTransTotalesService;
import com.cdi.com.Agroapoya2CDI.Services.CPersonaMenuService;
import com.cdi.com.Agroapoya2CDI.Services.CPersonaTransService;
import com.cdi.com.Agroapoya2CDI.Services.CPersonasService;
import com.cdi.com.Agroapoya2CDI.Services.CPinMillaModService;
import com.cdi.com.Agroapoya2CDI.Services.CPinUltimaMillaService;
import com.cdi.com.Agroapoya2CDI.Services.CPubliModService;
import com.cdi.com.Agroapoya2CDI.Services.CPublicidadModService;
import com.cdi.com.Agroapoya2CDI.Services.CPublicidadService;
import com.cdi.com.Agroapoya2CDI.Services.CRelacionDBasicosSubItemService;
import com.cdi.com.Agroapoya2CDI.Services.CRelacionDBasicosSubItemsModService;
import com.cdi.com.Agroapoya2CDI.Services.CRelacionDatosBasicoService;
import com.cdi.com.Agroapoya2CDI.Services.CRelacionLiderPartiModService;
import com.cdi.com.Agroapoya2CDI.Services.CRelacionLiderPartiService;
import com.cdi.com.Agroapoya2CDI.Services.CReporteOfertaService;
import com.cdi.com.Agroapoya2CDI.Services.CReporteUsuarioService;
import com.cdi.com.Agroapoya2CDI.Services.CReporteVentasService;
import com.cdi.com.Agroapoya2CDI.Services.CSectorConductorService;
import com.cdi.com.Agroapoya2CDI.Services.CSectorOfertaModService;
import com.cdi.com.Agroapoya2CDI.Services.CSectorOfertaService;
import com.cdi.com.Agroapoya2CDI.Services.CSectorPoligonoModService;
import com.cdi.com.Agroapoya2CDI.Services.CSeguimientoGeneralService;
import com.cdi.com.Agroapoya2CDI.Services.CSubSeguimientoService;
import com.cdi.com.Agroapoya2CDI.Services.CTipoCamposMasivoService;
import com.cdi.com.Agroapoya2CDI.Services.CTipoClienteService;
import com.cdi.com.Agroapoya2CDI.Services.CTipoConductorService;
import com.cdi.com.Agroapoya2CDI.Services.CTipoCosteoModService;
import com.cdi.com.Agroapoya2CDI.Services.CTipoCosteoOfertaService;
import com.cdi.com.Agroapoya2CDI.Services.CTipoNoEntrgaService;
import com.cdi.com.Agroapoya2CDI.Services.CTipoPagosTransService;
import com.cdi.com.Agroapoya2CDI.Services.CTipoToppinService;
import com.cdi.com.Agroapoya2CDI.Services.CTipoTransporService;
import com.cdi.com.Agroapoya2CDI.Services.CToppingModService;
import com.cdi.com.Agroapoya2CDI.Services.CTransportesNuevosService;
import com.cdi.com.Agroapoya2CDI.Services.CTrazabilidadEstadoOfertaService;
import com.cdi.com.Agroapoya2CDI.Services.CUltimaMillaInicialService;
import com.cdi.com.Agroapoya2CDI.Services.CUnidadesDisponiblesListaService;
import com.cdi.com.Agroapoya2CDI.Services.CUnidadesDisponiblesService;
import com.cdi.com.Agroapoya2CDI.Services.CValidaCambioEtapaService;
import com.cdi.com.Agroapoya2CDI.Services.CValidaCodigoService;
import com.cdi.com.Agroapoya2CDI.Services.CValidaSectorUsuarioService;
import com.cdi.com.Agroapoya2CDI.Services.CValorUbersGeneralService;
import com.cdi.com.Agroapoya2CDI.Services.CValorUbersOfertaModService;
import com.cdi.com.Agroapoya2CDI.Services.CValoracionOfertaModService;
import com.cdi.com.Agroapoya2CDI.Services.CValoracionOfertaService;
import com.cdi.com.Agroapoya2CDI.Services.CVigenciaOfertaModService;
import com.cdi.com.Agroapoya2CDI.Services.CVigenciaOfertaService;
import com.cdi.com.Agroapoya2CDI.Services.CZonasSectorService;
import com.cdi.com.Agroapoya2CDI.Services.C_LinkService;
import com.cdi.com.Agroapoya2CDI.Services.CalcSidorPgsClintService;
import com.cdi.com.Agroapoya2CDI.Services.CalculadoraPagosClienteService;
import com.cdi.com.Agroapoya2CDI.Services.CalificaProdModService;
import com.cdi.com.Agroapoya2CDI.Services.CcarrroLinkGrupoService;
import com.cdi.com.Agroapoya2CDI.Services.CconductoresTransportesNuevosService;
import com.cdi.com.Agroapoya2CDI.Services.CcorreoManualModService;
import com.cdi.com.Agroapoya2CDI.Services.CcorreoManualService;
import com.cdi.com.Agroapoya2CDI.Services.CdescargasTranService;
import com.cdi.com.Agroapoya2CDI.Services.CdetalleAppService;
import com.cdi.com.Agroapoya2CDI.Services.ChatGPTservice;
import com.cdi.com.Agroapoya2CDI.Services.CiudadOfertaModService;
import com.cdi.com.Agroapoya2CDI.Services.ClientePagosTransService;
import com.cdi.com.Agroapoya2CDI.Services.CondrsTransNMillaService;
import com.cdi.com.Agroapoya2CDI.Services.ConductorOfertaModService;
import com.cdi.com.Agroapoya2CDI.Services.ConductorSectorModService;
import com.cdi.com.Agroapoya2CDI.Services.ConductorService;
import com.cdi.com.Agroapoya2CDI.Services.CorreoIndividualService;
import com.cdi.com.Agroapoya2CDI.Services.CorreoMomentoEnvioService;
import com.cdi.com.Agroapoya2CDI.Services.CorreosMasivosPandaService;
import com.cdi.com.Agroapoya2CDI.Services.CosteoOfertaModService;
import com.cdi.com.Agroapoya2CDI.Services.CosteoOfertaService;
import com.cdi.com.Agroapoya2CDI.Services.CpagosLiderService;
import com.cdi.com.Agroapoya2CDI.Services.CparticipanteGrupoService;
import com.cdi.com.Agroapoya2CDI.Services.CperfilClienteService;
import com.cdi.com.Agroapoya2CDI.Services.CpersonaCampesinoModService;
import com.cdi.com.Agroapoya2CDI.Services.CpersonaClienteModService;
import com.cdi.com.Agroapoya2CDI.Services.CpersonaTransportistaModService;
import com.cdi.com.Agroapoya2CDI.Services.CseguimientoService;
import com.cdi.com.Agroapoya2CDI.Services.CtableroModService;
import com.cdi.com.Agroapoya2CDI.Services.CtableroService;
import com.cdi.com.Agroapoya2CDI.Services.CtipoMomentoEnvioService;
import com.cdi.com.Agroapoya2CDI.Services.CtipoPlantillaService;
import com.cdi.com.Agroapoya2CDI.Services.CtipoUsuarioService;
import com.cdi.com.Agroapoya2CDI.Services.CtokenPersonaModService;
import com.cdi.com.Agroapoya2CDI.Services.CtorUltMillaModService;
import com.cdi.com.Agroapoya2CDI.Services.CultimMillaService;
import com.cdi.com.Agroapoya2CDI.Services.CultimaUbicacionService;
import com.cdi.com.Agroapoya2CDI.Services.CundCarroModService;
import com.cdi.com.Agroapoya2CDI.Services.CusuariosCorreoService;
import com.cdi.com.Agroapoya2CDI.Services.CvalidaNumeroService;
import com.cdi.com.Agroapoya2CDI.Services.CvalidaUsuSectorService;
import com.cdi.com.Agroapoya2CDI.Services.EncriptacionService;
import com.cdi.com.Agroapoya2CDI.Services.EnvioCorreo_IndividualService;
import com.cdi.com.Agroapoya2CDI.Services.EnvioSMSNuevaEntregaService;
import com.cdi.com.Agroapoya2CDI.Services.EnviosmsIndividualService;
import com.cdi.com.Agroapoya2CDI.Services.EstadosOfertaService;
import com.cdi.com.Agroapoya2CDI.Services.FirebaseNotificationService;
import com.cdi.com.Agroapoya2CDI.Services.INFOGENERALService;
import com.cdi.com.Agroapoya2CDI.Services.ImagesApiService;
import com.cdi.com.Agroapoya2CDI.Services.JornadasOfertaService;
import com.cdi.com.Agroapoya2CDI.Services.ListasDatosBancoService;
import com.cdi.com.Agroapoya2CDI.Services.cliente_select_ofertasNuevasService;
import com.cdi.com.Agroapoya2CDI.Services.mv_CiudadesActivasService;
import com.cdi.com.Agroapoya2CDI.Services.mv_infoBasicaUsuarioService;
import com.cdi.com.Agroapoya2CDI.Services.mv_listaSectoresConOfertasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.cdi.com.Agroapoya2CDI.Services.MV_INSERT_AGRO_PERSONASVDOSService;
import com.cdi.com.Agroapoya2CDI.Services.OfertasCarritoComprasService;
import com.cdi.com.Agroapoya2CDI.Services.OfertasHistorialService;
import com.cdi.com.Agroapoya2CDI.Services.OlvidoClaveService;
import com.cdi.com.Agroapoya2CDI.Services.ProductoService;
import com.cdi.com.Agroapoya2CDI.Services.RemitenteCorreoService;
import com.cdi.com.Agroapoya2CDI.Services.RespuestaSmsModService;
import com.cdi.com.Agroapoya2CDI.Services.SELECT_MNCPIOService;
import com.cdi.com.Agroapoya2CDI.Services.SectoresModService;
import com.cdi.com.Agroapoya2CDI.Services.SectoresService;
import com.cdi.com.Agroapoya2CDI.Services.Select_TipoDocumentoService;
import com.cdi.com.Agroapoya2CDI.Services.SmsItCloudService;
import com.cdi.com.Agroapoya2CDI.Services.TBodegaService;
import com.cdi.com.Agroapoya2CDI.Services.TDatosBasicosService;
import com.cdi.com.Agroapoya2CDI.Services.THoraioTareaService;
import com.cdi.com.Agroapoya2CDI.Services.TModDatosBasicService;
import com.cdi.com.Agroapoya2CDI.Services.TSectoresEtvService;
import com.cdi.com.Agroapoya2CDI.Services.TSubMenuService;
import com.cdi.com.Agroapoya2CDI.Services.TaccionPubliService;
import com.cdi.com.Agroapoya2CDI.Services.TipObliCorreoManualService;
import com.cdi.com.Agroapoya2CDI.Services.TipObliCrroManModService;
import com.cdi.com.Agroapoya2CDI.Services.TipoViasService;
import com.cdi.com.Agroapoya2CDI.Services.TransActivosService;
import com.cdi.com.Agroapoya2CDI.Services.TvistasPubliService;
import com.cdi.com.Agroapoya2CDI.Services.UrlShortnerService;
import com.cdi.com.Agroapoya2CDI.Services.UsuarioAdminService;
import com.cdi.com.Agroapoya2CDI.Services.cTipoPreguntaService;
import com.cdi.com.Agroapoya2CDI.Services.codigoPersonaModService;
import com.cdi.com.Agroapoya2CDI.Services.conductorModService;
import com.cdi.com.Agroapoya2CDI.Services.consultaProductoService;
import com.cdi.com.Agroapoya2CDI.Services.entregasConductorService;
import com.cdi.com.Agroapoya2CDI.Services.estadoEntregaService;
import com.cdi.com.Agroapoya2CDI.Services.evidenciaModService;
import com.cdi.com.Agroapoya2CDI.Services.evidenciaService;
import com.cdi.com.Agroapoya2CDI.Services.imagenesOfertaService;
import com.cdi.com.Agroapoya2CDI.Services.listaCondicionService;
import com.cdi.com.Agroapoya2CDI.Services.listaEmpaqueService;
import com.cdi.com.Agroapoya2CDI.Services.listaTamanoService;
import com.cdi.com.Agroapoya2CDI.Services.loginClienteService;
import com.cdi.com.Agroapoya2CDI.Services.loginTransService;
import com.cdi.com.Agroapoya2CDI.Services.menuService;
import com.cdi.com.Agroapoya2CDI.Services.mv_EnvioCorreoTransprtistaViejeService;
import com.cdi.com.Agroapoya2CDI.Services.pa_CTextosOfertaConsultaService;
import com.cdi.com.Agroapoya2CDI.Services.pa_CTextosOfertaService;
import com.cdi.com.Agroapoya2CDI.Services.productosService;
import com.cdi.com.Agroapoya2CDI.Services.tipo_carro_carroceriaService;
import com.cdi.com.Agroapoya2CDI.Services.tipo_carro_pesoService;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequestMapping(value = "/", produces = "application/json", method = {RequestMethod.DELETE, RequestMethod.POST, RequestMethod.PUT, RequestMethod.PATCH})
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.PATCH, RequestMethod.DELETE})

public class Controller {
    
    @Autowired
    INFOGENERALService serviceINFOGENERALService;
    
    @Autowired
    cliente_select_ofertasNuevasService servicecliente_select_ofertasNuevasService;
    
    @Autowired
    mv_listaSectoresConOfertasService servicemv_listaSectoresConOfertasService;
    
    @Autowired
    mv_CiudadesActivasService servicemv_CiudadesActivasService;
    
    @Autowired
    mv_infoBasicaUsuarioService servicemv_infoBasicaUsuarioService;
    
    @Autowired
    MV_INSERT_AGRO_PERSONASVDOSService serviceINSERT_AGRO_PERSONASVDOSService;
    
    @Autowired
    SELECT_MNCPIOService serviceSELECT_MNCPIOService;
    
    @Autowired
    Select_TipoDocumentoService serviceSelect_TipoDocumentoService;
    
    @Autowired
    CALCULADORA_VALORPAGOService serviceCALCULADORA_VALORPAGOService;
    
    @Autowired
    mv_EnvioCorreoTransprtistaViejeService servicemv_EnvioCorreoTransprtistaViejeService;
    
    @Autowired
    productosService serviceproductosService;
    
    @Autowired
    listaEmpaqueService servicelistaEmpaqueService;
    
    @Autowired
    listaCondicionService servicelistaCondicionService;
    
    @Autowired
    listaTamanoService servicelistaTamanoService;
    
    @Autowired
    private FileStorageService fileStorageService;
    
    @Autowired
    imagenesOfertaService serviceimagenesOfertaService;
    
    @Autowired
    COfertaModService serviceCOfertaModService;
    
    @Autowired
    consultaProductoService serviceconsultaProductoService;
    
    @Autowired
    COfertaService serviceCOfertaService;
    
    @Autowired
    COfertaImagenModService serviceCOfertaImagenModService;
    
    @Autowired
    ListasDatosBancoService serviceListasDatosBancoService;
    
    @Autowired
    TipoViasService serviceTipoViasService;
    
    @Autowired
    CPersonasService serviceCPersonasService;
    
    @Autowired
    EstadosOfertaService serviceEstadosOfertaService;
    
    @Autowired
    JornadasOfertaService serviceJornadasOfertaService;
    
    @Autowired
    ProductoService serviceProductoService;
    
    @Autowired
    codigoPersonaModService servicecodigoPersonaModService;
    
    @Autowired
    menuService servicemenuService;
    
    @Autowired
    tipo_carro_carroceriaService servicetipo_carro_carroceriaService;
    
    @Autowired
    tipo_carro_pesoService servicetipo_carro_pesoService;
    
    @Autowired
    conductorModService serviceconductorModService;
    
    @Autowired
    ConductorService serviceConductorService;
    
    @Autowired
    CConductorService serviceCConductorService;
    
    @Autowired
    SectoresService serviceSectoresService;
    
    @Autowired
    CSectorOfertaModService serviceCSectorOfertaModService;
    
    @Autowired
    CSectorOfertaService serviceCSectorOfertaService;
    
    @Autowired
    CConductorSectorOfertaModService serviceCConductorSectorOfertaModService;
    
    @Autowired
    CCiudadDistribucionOfertService serviceCCiudadDistribucionOfertService;
    
    @Autowired
    SectoresModService serviceSectoresModService;
    
    @Autowired
    AOfertasService serviceAOfertasService;
    
    @Autowired
    AestadoOfertaModService serviceAestadoOfertaModService;
    
    @Autowired
    TransActivosService serviceTransActivosService;
    
    @Autowired
    evidenciaModService serviceevidenciaModService;
    
    @Autowired
    CConductorSectorOfertaService serviceCConductorSectorOfertaService;
    
    @Autowired
    estadoEntregaService serviceestadoEntregaService;
    
    @Autowired
    entregasConductorService serviceentregasConductorService;
    
    @Autowired
    evidenciaService serviceevidenciaService;
    
    @Autowired
    CiudadOfertaModService serviceCiudadOfertaModService;
    
    @Autowired
    CValoracionOfertaModService serviceCValoracionOfertaModService;
    
    @Autowired
    CValoracionOfertaService serviceCValoracionOfertaService;
    
    @Autowired
    EnvioCorreo_IndividualService serviceEnvioCorreo_IndividualService;
    
    @Autowired
    RemitenteCorreoService serviceRemitenteCorreoService;
    
    @Autowired
    CEnvioRealCorreoService serviceCEnvioRealCorreoService;
    
    @Autowired
    COfertasNuevasService serviceCOfertasNuevasService;
    
    @Autowired
    OfertasCarritoComprasService serviceOfertasCarritoComprasService;
    
    @Autowired
    OfertasHistorialService serviceOfertasHistorialService;
    
    @Autowired
    UsuarioAdminService serviceUsuarioAdminService;
    
    @Autowired
    OlvidoClaveService serviceOlvidoClaveService;
    
    @Autowired
    loginTransService serviceloginTransService;
    
    @Autowired
    CosteoOfertaService serviceCosteoOfertaService;
    
    @Autowired
    CosteoOfertaModService serviceCosteoOfertaModService;
    
    @Autowired
    loginClienteService serviceloginClienteService;
    
    @Autowired
    CpersonaCampesinoModService serviceCpersonaCampesinoModService;
    
    @Autowired
    CCordenadasSectorModService serviceCCordenadasSectorModService;
    
    @Autowired
    CConsultaEstadoOfertaService serviceCConsultaEstadoOfertaService;
    
    @Autowired
    CCordenadasSectorService serviceCCordenadasSectorService;
    
    @Autowired
    CSectorConductorService serviceCSectorConductorService;
    
    @Autowired
    ConductorOfertaModService serviceConductorOfertaModService;
    
    @Autowired
    CDatosTransportistaService serviceCDatosTransportistaService;
    
    @Autowired
    CTipoCosteoOfertaService serviceCTipoCosteoOfertaService;
    
    @Autowired
    CpersonaTransportistaModService serviceCpersonaTransportistaModService;
    
    @Autowired
    CpersonaClienteModService serviceCpersonaClienteModService;
    
    @Autowired
    CtipoPlantillaService serviceCtipoPlantillaService;
    
    @Autowired
    CorreoMomentoEnvioService serviceCorreoMomentoEnvioService;
    
    @Autowired
    CtipoMomentoEnvioService serviceCtipoMomentoEnvioService;
    
    @Autowired
    CAplantillaCorreoService serviceCAplantillaCorreoService;
    
    @Autowired
    CATipoCamposCorreoService serviceCATipoCamposCorreoService;
    
    @Autowired
    CAPlantillaCorreoModService serviceCAPlantillaCorreoModService;
    
    @Autowired
    CDocumentoCorreoModService serviceCDocumentoCorreoModService;
    
    @Autowired
    CDocumentoCorreoService serviceCDocumentoCorreoService;
    
    @Autowired
    CTransportesNuevosService serviceCTransportesNuevosService;
    
    @Autowired
    CconductoresTransportesNuevosService serviceCconductoresTransportesNuevosService;
    
    @Autowired
    ConductorSectorModService serviceConductorSectorModService;
    
    @Autowired
    CPersonaTransService serviceCPersonaTransService;
    
    @Autowired
    CValidaCambioEtapaService serviceCValidaCambioEtapaService;
    
    @Autowired
    CVigenciaOfertaModService serviceCVigenciaOfertaModService;
    
    @Autowired
    CVigenciaOfertaService serviceCVigenciaOfertaService;
    
    @Autowired
    CCalculaPrecioFinIndividualService serviceCCalculaPrecioFinIndividualService;
    
    @Autowired
    CCalculaPrecioFinGrupalService serviceCCalculaPrecioFinGrupalService;
    
    @Autowired
    CCalculaPrecioFinMixtaService serviceCCalculaPrecioFinMixtaService;
    
    @Autowired
    CCambiaEstadoOfertaModService serviceCCambiaEstadoOfertaModService;
    
    @Autowired
    CCalificaAppService serviceCCalificaAppService;
    
    @Autowired
    CConductorCondService serviceCConductorCondService;
    
    @Autowired
    CNuevasOfertasService serviceCNuevasOfertasService;
    
    @Autowired
    CtokenPersonaModService serviceCtokenPersonaModService;
    
    @Autowired
    CComprasModService serviceCComprasModService;
    
    @Autowired
    CUnidadesDisponiblesService serviceCUnidadesDisponiblesService;
    
    @Autowired
    CComprasService serviceCComprasService;
    
    @Autowired
    RespuestaSmsModService serviceRespuestaSmsModService;
    
    @Autowired
    CPersonaMenuService serviceCPersonaMenuService;
    
    @Autowired
    CparticipanteGrupoService serviceCparticipanteGrupoService;
    
    @Autowired
    CValidaCodigoService serviceCValidaCodigoService;
    
    @Autowired
    CalculadoraPagosClienteService serviceCalculadoraPagosClienteService;
    
    @Autowired
    CUnidadesDisponiblesListaService serviceCUnidadesDisponiblesListaService;
    
    @Autowired
    CTipoNoEntrgaService serviceCTipoNoEntrgaService;
    
    @Autowired
    CultimaUbicacionService serviceCultimaUbicacionService;
    
    @Autowired
    EnvioSMSNuevaEntregaService serviceEnvioSMSNuevaEntregaService;
    
    @Autowired
    CTipoCosteoModService serviceCTipoCosteoModService;
    
    @Autowired
    CalificaProdModService serviceCalificaProdModService;
    
    @Autowired
    CEstadoTransporteModService serviceCEstadoTransporteModService;
    
    @Autowired
    ClientePagosTransService serviceClientePagosTransService;
    
    @Autowired
    CTipoPagosTransService serviceCTipoPagosTransService;
    
    @Autowired
    CPagosTransTotalesService serviceCPagosTransTotalesService;
    
    @Autowired
    EnviosmsIndividualService serviceEnviosmsIndividualService;
    
    @Autowired
    CAgroTipoNovedadService serviceCAgroTipoNovedadService;
    
    @Autowired
    CNovedadModService serviceCNovedadModService;
    
    @Autowired
    CTipoToppinService serviceCTipoToppinService;
    
    @Autowired
    CToppingModService serviceCToppingModService;
    
    @Autowired
    CListadoToppingService serviceCListadoToppingService;
    
    @Autowired
    CReporteUsuarioService serviceCReporteUsuarioService;
    
    @Autowired
    CtipoUsuarioService serviceCtipoUsuarioService;
    
    @Autowired
    CTipoClienteService serviceCTipoClienteService;
    
    @Autowired
    CTipoTransporService serviceCTipoTransporService;
    
    @Autowired
    CTipoConductorService serviceCTipoConductorService;
    
    @Autowired
    CReporteVentasService serviceCReporteVentasService;
    
    @Autowired
    CMisToppingsService serviceCMisToppingsService;
    
    @Autowired
    CtableroService serviceCtableroService;
    
    @Autowired
    CEnvioCodigoCorreoService serviceCEnvioCodigoCorreoService;
    
    @Autowired
    CtableroModService serviceCtableroModService;
    
    @Autowired
    TSubMenuService serviceTSubMenuService;
    
    @Autowired
    CTipoCamposMasivoService serviceCTipoCamposMasivoService;
    
    @Autowired
    CAgroPreguntasEncuestaService serviceCAgroPreguntasEncuestaService;
    
    @Autowired
    CAgroRespuestasEncuestaModService serviceCAgroRespuestasEncuestaModService;
    
    @Autowired
    CAgroPreguntaOfertaModService serviceCAgroPreguntaOfertaModService;
    
    @Autowired
    CAgroPreguntaOfertaService serviceCAgroPreguntaOfertaService;
    
    @Autowired
    CperfilClienteService serviceCperfilClienteService;
    
    @Autowired
    CPublicidadService serviceCPublicidadService;
    
    @Autowired
    TvistasPubliService serviceTvistasPubliService;
    
    @Autowired
    CAgroRespEncCompService serviceCAgroRespEncCompService;
    
    @Autowired
    TaccionPubliService serviceTaccionPubliService;
    
    @Autowired
    CPublicidadModService serviceCPublicidadModService;
    
    @Autowired
    CEnvioCorreoIndEmailService serviceCEnvioCorreoIndEmailService;
    
    @Autowired
    CModuloModService serviceCModuloModService;
    
    @Autowired
    CPubliModService serviceCPubliModService;
    
    @Autowired
    cTipoPreguntaService servicecTipoPreguntaService;
    
    @Autowired
    CSeguimientoGeneralService serviceCSeguimientoGeneralService;
    
    @Autowired
    CseguimientoService serviceCseguimientoService;
    
    @Autowired
    CSubSeguimientoService serviceCSubSeguimientoService;
    
    @Autowired
    CvalidaNumeroService serviceCvalidaNumeroService;
    
    @Autowired
    EncriptacionService serviceEncriptacionService;
    
    @Autowired
    CAgroValidaEncuestaService serviceCAgroValidaEncuestaService;
    
    @Autowired
    CAgroEstComPagoService serviceCAgroEstComPagoService;
    
    @Autowired
    CAgroRmenOfertaMenuService serviceCAgroRmenOfertaMenuService;
    
    @Autowired
    AGROPREGUNTAMODService serviceAGROPREGUNTAMODService;
    
    @Autowired
    FirebaseNotificationService serviceFirebaseNotificationService;
    
    @Autowired
    CEntregaSegService serviceCEntregaSegService;
    
    @Autowired
    COfertasExternasService serviceCOfertasExternasService;
    
    @Autowired
    CSectorPoligonoModService serviceCSectorPoligonoModService;
    
    @Autowired
    CTrazabilidadEstadoOfertaService serviceCTrazabilidadEstadoOfertaService;
    
    @Autowired
    TSectoresEtvService serviceTSectoresEtvService;
    
    @Autowired
    CZonasSectorService serviceCZonasSectorService;
    
    @Autowired
    TModDatosBasicService serviceTModDatosBasicService;
    
    @Autowired
    TDatosBasicosService serviceTDatosBasicosService;
    
    @Autowired
    CDatBasicSubItemService serviceCDatBasicSubItemService;
    
    @Autowired
    CMascaraDatBasicService serviceCMascaraDatBasicService;
    
    @Autowired
    CDatosBasicosSubItemModService serviceCDatosBasicosSubItemModService;
    
    @Autowired
    CRelacionDatosBasicoService serviceCRelacionDatosBasicoService;
    
    @Autowired
    CRelacionDBasicosSubItemService serviceCRelacionDBasicosSubItemService;
    
    @Autowired
    CRelacionDBasicosSubItemsModService serviceCRelacionDBasicosSubItemsModService;
    
    @Autowired
    CCarroCompraService serviceCCarroCompraService;
    
    @Autowired
    CCarroComprasModService serviceCCarroComprasModService;
    
    @Autowired
    CundCarroModService serviceCundCarroModService;
    
    @Autowired
    AgroCompraUsuModService serviceAgroCompraUsuModService;
    
    @Autowired
    CHistorialCompraService serviceCHistorialCompraService;
    
    @Autowired
    CvalidaUsuSectorService serviceCvalidaUsuSectorService;
    
    @Autowired
    CValidaSectorUsuarioService serviceCValidaSectorUsuarioService;
    
    @Autowired
    CNumUsuSectorService serviceCNumUsuSectorService;
    
    @Autowired
    CNuevasOfertasVdoService serviceCNuevasOfertasVdoService;
    
    @Autowired
    C_LinkService serviceC_LinkService;
    
    @Autowired
    UrlShortnerService serviceUrlShortnerService;
    
    @Autowired
    CorreosMasivosPandaService serviceCorreosMasivosPandaService;
    
    @Autowired
    CorreoIndividualService serviceCorreoIndividualService;
    
    @Autowired
    CCarroLinkModService serviceCCarroLinkModService;
    
    @Autowired
    SmsItCloudService serviceSmsItCloudService;
    
    @Autowired
    pa_CTextosOfertaService servicepa_CTextosOfertaService;
    
    @Autowired
    pa_CTextosOfertaConsultaService servicepa_CTextosOfertaConsultaService;
    
    @Autowired
    CcorreoManualModService serviceCcorreoManualModService;
    
    @Autowired
    CcorreoManualService serviceCcorreoManualService;
    
    @Autowired
    CusuariosCorreoService serviceCusuariosCorreoService;
    
    @Autowired
    CGeneracionQueryService serviceCGeneracionQueryService;
    
    @Autowired
    CLinksModService serviceCLinksModService;
    
    @Autowired
    CLinkConsultaService serviceCLinkConsultaService;
    
    @Autowired
    THoraioTareaService serviceTHoraioTareaService;
    
    @Autowired
    TipObliCorreoManualService serviceTipObliCorreoManualService;
    
    @Autowired
    TipObliCrroManModService serviceTipObliCrroManModService;
    
    @Autowired
    CLinkSectorService serviceCLinkSectorService;
    
    @Autowired
    CRelacionLiderPartiModService serviceCRelacionLiderPartiModService;
    
    @Autowired
    CRelacionLiderPartiService serviceCRelacionLiderPartiService;
    
    @Autowired
    CpagosLiderService serviceCpagosLiderService;
    
    @Autowired
    CLinksCPyGModService serviceCLinksCPyGModService;
    
    @Autowired
    ChatGPTservice serviceChatGPTservice;
    
    @Autowired
    ImagesApiService serviceImagesApiService;
    
    @Autowired
    TBodegaService serviceTBodegaService;
    
    @Autowired
    CdescargasTranService serviceCdescargasTranService;
    
    @Autowired
    CAsignaBodegaModService serviceCAsignaBodegaModService;
    
    @Autowired
    CDtlleDescargaService serviceCDtlleDescargaService;
    
    @Autowired
    CDtlleDescargasModService serviceCDtlleDescargasModService;
    
    @Autowired
    CInfoOfertaService serviceCInfoOfertaService;
    
    @Autowired
    COfertaEstadosService serviceCOfertaEstadosService;
    
    @Autowired
    CUltimaMillaInicialService serviceCUltimaMillaInicialService;
    
    @Autowired
    CPinUltimaMillaService serviceCPinUltimaMillaService;
    
    @Autowired
    CGrupoMillaModService serviceCGrupoMillaModService;
    
    @Autowired
    CPinMillaModService serviceCPinMillaModService;
    
    @Autowired
    CultimMillaService serviceCultimMillaService;
    
    @Autowired
    CAgGruposUltimaMillaService serviceCAgGruposUltimaMillaService;
    
    @Autowired
    CValorUbersOfertaModService serviceCValorUbersOfertaModService;
    
    @Autowired
    CValorUbersGeneralService serviceCValorUbersGeneralService;
    
    @Autowired
    CListaConductorService serviceCListaConductorService;
    
    @Autowired
    CtorUltMillaModService serviceCtorUltMillaModService;
    
    @Autowired
    CReporteOfertaService serviceCReporteOfertaService;
    
    @Autowired
    CcarrroLinkGrupoService serviceCcarrroLinkGrupoService;
    
    @Autowired
    CalcSidorPgsClintService serviceCalcSidorPgsClintService;
    
    @Autowired
    CNuevosTransAppService serviceCNuevosTransAppService;
    
    @Autowired
    CDetalleNuevosTransAppService serviceCDetalleNuevosTransAppService;
    
    @Autowired
    CondrsTransNMillaService serviceCondrsTransNMillaService;
    
    @Autowired
    CdetalleAppService serviceCdetalleAppService;
    
    @GetMapping("/consultainfogeneral/{ID}/{subId}")
    public List<INFOGENERALEntity> ConsultaInfoGeneral(
            @PathVariable Integer ID,
            @PathVariable Integer subId) {
        return serviceINFOGENERALService.ConsultaInfoGeneral(ID, subId);
    }
    
    @GetMapping("/consclientselectofert/{US_CLIENTE}")
    public List<cliente_select_ofertasNuevasEntity> ConsultaClienteSelectOfertas(
            @PathVariable Integer US_CLIENTE) {
        return servicecliente_select_ofertasNuevasService.ConsultaClienteSelectOfertas(US_CLIENTE);
    }
    
    @GetMapping("/conslistsctoroferts/{bandera}/{ciudad}")
    public List<mv_listaSectoresConOfertasEntity> ConsultaListSctorsOferts(
            @PathVariable Integer bandera,
            @PathVariable Integer ciudad) {
        return servicemv_listaSectoresConOfertasService.ConsultaListSctorsOferts(bandera, ciudad);
    }
    
    @GetMapping("/consciudadesactivs/{bandera}")
    public List<mv_CiudadesActivasEntity> ConsultaCiudadesActivs(
            @PathVariable Integer bandera) {
        return servicemv_CiudadesActivasService.ConsultaCiudadesActivs(bandera);
    }
    
    @PostMapping("/consinfobascuser/{bandera}")
    public List<mv_infoBasicaUsuarioEntity> ConsultaInfoBascUser(
            @RequestBody mv_infoBasicaUsuarioEntity entidad,
            @PathVariable Integer bandera) {
        return servicemv_infoBasicaUsuarioService.ConsultaInfoBascUser(entidad, bandera);
    }
    
    @PostMapping("/insertagroprsnasvdos/{bandera}/{codUsuario}")
    public String InsertAgroPrsnasvdos(
            @RequestBody MV_INSERT_AGRO_PERSONASVDOSEntity entidad,
            @PathVariable Integer bandera,
            @PathVariable Integer codUsuario) {
        return serviceINSERT_AGRO_PERSONASVDOSService.InsertAgroPrsnasvdos(entidad, bandera, codUsuario);
    }
    
    @GetMapping("/consultmncpio/{CD_RGION}")
    public List<SELECT_MNCPIOEntity> ConsultaMNCPIO(
            @PathVariable Integer CD_RGION) {
        return serviceSELECT_MNCPIOService.ConsultaMNCPIO(CD_RGION);
    }
    
    @GetMapping("/constipodocumento/{Bandera}")
    public List<Select_TipoDocumentoEntity> ConsultaSelectTpoDocumento(
            @PathVariable Integer Bandera) {
        return serviceSelect_TipoDocumentoService.ConsultaSelectTpoDocumento(Bandera);
    }
    
    @GetMapping("/conscalvalorpagos/{TIPOCOMPRA}/{CD_CNSCTVO}/{CD_UNDAD}/{USUCODIG}/{Descarga}/{Bandera}")
    public String ConsultaValorPago(
            @PathVariable Integer TIPOCOMPRA,
            @PathVariable Integer CD_CNSCTVO,
            @PathVariable Integer CD_UNDAD,
            @PathVariable Integer USUCODIG,
            @PathVariable Integer Descarga,
            @PathVariable Integer Bandera) {
        return serviceCALCULADORA_VALORPAGOService.ConsultaValorPago(TIPOCOMPRA, CD_CNSCTVO, CD_UNDAD, USUCODIG, Descarga, Bandera);
    }
    
    @GetMapping("/consenviocorreotransviaje/{id_trans}/{consecutico}")
    public List<mv_EnvioCorreoTransprtistaViejeEntity> ConsultaEnvioCorreoTransptsta(
            @PathVariable Integer id_trans,
            @PathVariable Integer consecutico) {
        return servicemv_EnvioCorreoTransprtistaViejeService.ConsultaEnvioCorreoTransptsta(id_trans, consecutico);
    }
    
    @GetMapping("/consproductos/{bandera}")
    public List<productosEntity> ConsultaProducto(
            @PathVariable Integer bandera) {
        return serviceproductosService.ConsultaProductos(bandera);
    }
    
    @GetMapping("/conslistempaque/{producto}")
    public List<listaEmpaqueEntity> ConsultaListaEmpaque(
            @PathVariable Integer producto) {
        return servicelistaEmpaqueService.ConsultaListaEmpaque(producto);
    }
    
    @GetMapping("/conslistcondicion/{producto}")
    public List<listaCondicionEntity> ConsultaListaCondicion(
            @PathVariable Integer producto) {
        return servicelistaCondicionService.ConsultaListaCondicion(producto);
    }
    
    @GetMapping("/conslistamano/{producto}")
    public List<listaTamanoEntity> ConsultaListatamano(
            @PathVariable Integer producto) {
        return servicelistaTamanoService.ConsultaListaTamano(producto);
    }

    //SUBIR IMAGENES
    @PostMapping("/uploadFile")
    public String uploadOfertas(@RequestParam("file") MultipartFile file) {
        String fileName = null;
        try {
            fileName = fileStorageService.storeFile(file);
        } catch (FileStorageException ex) {
            System.out.println("Error " + ex);
        }
        String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("/ImagenesAgroapoya2/")
                .path(fileName)
                .toUriString();
        fileDownloadUri = fileDownloadUri.replace(":8089/ImagenesAgroapoya2", "");
        try {
            file.transferTo(new File("C:/inetpub/wwwroot/ImagenesAgroapoya2/ImagenesOfertas/" + fileName));
        } catch (IOException | IllegalStateException ex) {
            System.out.println("Error " + ex);
        }
        UploadFileResponse uploadfile = new UploadFileResponse(fileName, fileDownloadUri,
                file.getContentType(), file.getSize());
        uploadfile.getFileDownloadUri();
        return JSONObject.quote("Archivo Subido Correctamente");
    }
    
    @PostMapping("/uploadevidencia")
    public String uploadEvidencia(@RequestParam("file") MultipartFile file) {
        String fileName = null;
        try {
            fileName = fileStorageService.storeFile(file);
        } catch (FileStorageException ex) {
            System.out.println("Error " + ex);
        }
        String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("/ImagenesAgroapoya2/")
                .path(fileName)
                .toUriString();
        fileDownloadUri = fileDownloadUri.replace(":8089/ImagenesAgroapoya2", "");
        try {
            file.transferTo(new File("C:/inetpub/wwwroot/ImagenesAgroapoya2/ImagenesEvidencia/" + fileName));
        } catch (IOException | IllegalStateException ex) {
            System.out.println("Error " + ex);
        }
        UploadFileResponse uploadfile = new UploadFileResponse(fileName, fileDownloadUri,
                file.getContentType(), file.getSize());
        uploadfile.getFileDownloadUri();
        return JSONObject.quote("Archivo Subido Correctamente");
    }
    
    @PostMapping("/uploadconductores")
    public String uploadConductores(@RequestParam("file") MultipartFile file) {
        String fileName = null;
        try {
            fileName = fileStorageService.storeFile(file);
        } catch (FileStorageException ex) {
            System.out.println("Error " + ex);
        }
        String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("/ImagenesAgroapoya2/")
                .path(fileName)
                .toUriString();
        fileDownloadUri = fileDownloadUri.replace(":8089/ImagenesAgroapoya2", "");
        try {
            file.transferTo(new File("C:/inetpub/wwwroot/ImagenesAgroapoya2/ImagenesConductores/" + fileName));
        } catch (IOException | IllegalStateException ex) {
            System.out.println("Error " + ex);
        }
        UploadFileResponse uploadfile = new UploadFileResponse(fileName, fileDownloadUri,
                file.getContentType(), file.getSize());
        uploadfile.getFileDownloadUri();
        return JSONObject.quote("Archivo Subido Correctamente");
    }
    
    @PostMapping("/uploadImgPlantillaCorreo")
    public String uploadPlantillaCorreo(@RequestParam("file") MultipartFile file) {
        String fileName = null;
        try {
            fileName = fileStorageService.storeFile(file);
        } catch (FileStorageException ex) {
            System.out.println("Error " + ex);
        }
        String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("/ImagenesAgroapoya2/")
                .path(fileName)
                .toUriString();
        fileDownloadUri = fileDownloadUri.replace(":8089/ImagenesAgroapoya2", "");
        try {
            file.transferTo(new File("C:/inetpub/wwwroot/ImagenesAgroapoya2/ImagenesPlantillaCorreo/" + fileName));
        } catch (IOException | IllegalStateException ex) {
            System.out.println("Error " + ex);
        }
        UploadFileResponse uploadfile = new UploadFileResponse(fileName, fileDownloadUri,
                file.getContentType(), file.getSize());
        uploadfile.getFileDownloadUri();
        return JSONObject.quote("Archivo Subido Correctamente");
    }
    
    @PostMapping("/uploadArchivos")
    public String uploadAdjuntaArchivos(@RequestParam("file") MultipartFile file) {
        String fileName = null;
        try {
            fileName = fileStorageService.storeFile(file);
        } catch (FileStorageException ex) {
            System.out.println("Error " + ex);
        }
        String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("/ImagenesAgroapoya2/")
                .path(fileName)
                .toUriString();
        fileDownloadUri = fileDownloadUri.replace(":8089/ImagenesAgroapoya2", "");
        try {
            file.transferTo(new File("C:/inetpub/wwwroot/ImagenesAgroapoya2/ImagenesPlantillaCorreo/" + fileName));
        } catch (IOException | IllegalStateException ex) {
            System.out.println("Error " + ex);
        }
        UploadFileResponse uploadfile = new UploadFileResponse(fileName, fileDownloadUri,
                file.getContentType(), file.getSize());
        uploadfile.getFileDownloadUri();
        return JSONObject.quote("Archivo Subido Correctamente");
    }
    
    @PostMapping("/uploadImgToppings")
    public String uploadToppings(@RequestParam("file") MultipartFile file) {
        String fileName = null;
        try {
            fileName = fileStorageService.storeFile(file);
        } catch (FileStorageException ex) {
            System.out.println("Error " + ex);
        }
        String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("/ImagenesAgroapoya2/")
                .path(fileName)
                .toUriString();
        fileDownloadUri = fileDownloadUri.replace(":8089/ImagenesAgroapoya2", "");
        try {
            file.transferTo(new File("C:/inetpub/wwwroot/ImagenesAgroapoya2/ImagenesToppings/" + fileName));
        } catch (IOException | IllegalStateException ex) {
            System.out.println("Error " + ex);
        }
        UploadFileResponse uploadfile = new UploadFileResponse(fileName, fileDownloadUri,
                file.getContentType(), file.getSize());
        uploadfile.getFileDownloadUri();
        return JSONObject.quote("Archivo Subido Correctamente");
    }
    
    @PostMapping("/uploadImgPublicidad")
    public String uploadPublicidad(@RequestParam("file") MultipartFile file) {
        String fileName = null;
        try {
            fileName = fileStorageService.storeFile(file);
        } catch (FileStorageException ex) {
            System.out.println("Error " + ex);
        }
        String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("/ImagenesAgroapoya2/")
                .path(fileName)
                .toUriString();
        fileDownloadUri = fileDownloadUri.replace(":8089/ImagenesAgroapoya2", "");
        try {
            file.transferTo(new File("C:/inetpub/wwwroot/ImagenesAgroapoya2/ImagenesPublicidad/" + fileName));
        } catch (IOException | IllegalStateException ex) {
            System.out.println("Error " + ex);
        }
        UploadFileResponse uploadfile = new UploadFileResponse(fileName, fileDownloadUri,
                file.getContentType(), file.getSize());
        uploadfile.getFileDownloadUri();
        return JSONObject.quote("Archivo Subido Correctamente");
    }
    
    @GetMapping("/consimagenoferta/{Bandera}/{cd_cnsctivo}")
    public List<imagenesOfertaEntity> ConsultaImageOferta(
            @PathVariable Integer Bandera,
            @PathVariable Integer cd_cnsctivo) {
        return serviceimagenesOfertaService.ConsultaImageOferta(Bandera, cd_cnsctivo);
    }
    
    @PostMapping("/cofertamod/{bandera}/{ID_EMPAQUE}")
    public String InAcCOfertaMod(
            @RequestBody COfertaModEntity entidad,
            @PathVariable Integer bandera,
            @PathVariable String ID_EMPAQUE) {
        return serviceCOfertaModService.InAcCOfertaMod(entidad, bandera, ID_EMPAQUE);
    }
    
    @GetMapping("/conscproducto/{cd_consecutivo}")
    public List<consultaProductoEntity> ConsultacProducto(
            @PathVariable Integer cd_consecutivo) {
        return serviceconsultaProductoService.ConsultaProducto(cd_consecutivo);
    }
    
    @GetMapping("/conscoferta/{bandera}/{CD_CNSCTVO}")
    public List<COfertaEntity> ConsultaCOferta(
            @PathVariable Integer bandera,
            @PathVariable String CD_CNSCTVO) {
        return serviceCOfertaService.ConsultaCOferta(bandera, CD_CNSCTVO);
    }
    
    @PostMapping("/actcofertaimagenmod/{bandera}")
    public String ActualizaCOfertaImagenMod(
            @RequestBody COfertaImagenModEntity entidad,
            @PathVariable Integer bandera) {
        return serviceCOfertaImagenModService.ActualizaCOfertaImagenMod(entidad, bandera);
    }
    
    @GetMapping("/conslistdatobanco/{Bandera}")
    public List<ListasDatosBancoEntity> ConsultaListasDatosBanco(
            @PathVariable Integer Bandera) {
        return serviceListasDatosBancoService.ConsultaListasDatosBanco(Bandera);
    }
    
    @GetMapping("/constipovias/{Bandera}")
    public List<TipoViasEntity> ConsultaTipoVias(
            @PathVariable Integer Bandera) {
        return serviceTipoViasService.ConsultaTipoVias(Bandera);
    }
    
    @PostMapping("/conscpersons/{bandera}/{TipoPersona}")
    public List<CPersonasEntity> ConsultaCPersonas(
            @RequestBody CPersonasEntity entidad,
            @PathVariable Integer bandera,
            @PathVariable String TipoPersona) {
        return serviceCPersonasService.ConsultaCPersonas(entidad, bandera, TipoPersona);
    }
    
    @GetMapping("/consestadosofertas/{prmtro}")
    public List<EstadosOfertaEntity> ConsultaEstadoOfertas(
            @PathVariable Integer prmtro) {
        return serviceEstadosOfertaService.ConsultaEstadoOfertas(prmtro);
    }
    
    @GetMapping("/consjorndofertas/{prmtro}")
    public List<JornadasOfertaEntity> ConsultaJornadaOferta(
            @PathVariable Integer prmtro) {
        return serviceJornadasOfertaService.ConsultaJornadaOferta(prmtro);
    }
    
    @PostMapping("/consproducto/{bandera}")
    public List<ProductoEntity> ConsultaProducto(
            @RequestBody ProductoEntity entidad,
            @PathVariable Integer bandera) {
        return serviceProductoService.ConsultaProducto(entidad, bandera);
    }
    
    @GetMapping("/actcodigopersona/{bandera}")
    public String ActualizaCodigoPersona(
            @PathVariable Integer bandera) {
        return servicecodigoPersonaModService.ActualizaCodigoPersona(bandera);
    }
    
    @GetMapping("/consmenu/{Bandera}/{IdTipoUsuario}/{Usucodig}")
    public List<menuEntity> ConsultaMenu(
            @PathVariable Integer Bandera,
            @PathVariable Integer IdTipoUsuario,
            @PathVariable Integer Usucodig) {
        return servicemenuService.ConsultaMenu(Bandera, IdTipoUsuario, Usucodig);
    }
    
    @GetMapping("/constpocarcarroceria/{bandera}")
    public List<tipo_carro_carroceriaEntity> ConsultaTipoCarroCarroceria(
            @PathVariable Integer bandera) {
        return servicetipo_carro_carroceriaService.ConsultaTipoCarroCarroceria(bandera);
    }
    
    @GetMapping("/constipocarropeso/{bandera}")
    public List<tipo_carro_pesoEntity> ConsultaTipoCarroPeso(
            @PathVariable Integer bandera) {
        return servicetipo_carro_pesoService.ConsultaTipoCarroPeso(bandera);
    }
    
    @PostMapping("/conductormod/{bandera}/{id_carroceria}/{id_pesoCargaCarro}")
    public String ConductorMod(
            @RequestBody conductorModEntity entidad,
            @PathVariable Integer bandera,
            @PathVariable Integer id_carroceria,
            @PathVariable Integer id_pesoCargaCarro) {
        return serviceconductorModService.ConductorMod(entidad, bandera, id_carroceria, id_pesoCargaCarro);
    }
    
    @PostMapping("/consconductor/{bandera}/{Cd_cnsctivo}/{CODIGO_TRANS}/{CD_PAIS}/{CD_RGION}/{CD_MNCPIO}")
    public List<ConductorEntity> ConsultaConductor(
            @RequestBody ConductorEntity entidad,
            @PathVariable Integer bandera,
            @PathVariable Integer Cd_cnsctivo,
            @PathVariable Integer CODIGO_TRANS,
            @PathVariable Integer CD_PAIS,
            @PathVariable Integer CD_RGION,
            @PathVariable Integer CD_MNCPIO) {
        return serviceConductorService.ConsultaConductor(entidad, bandera, Cd_cnsctivo, CODIGO_TRANS, CD_PAIS, CD_RGION, CD_MNCPIO);
    }
    
    @PostMapping("/conscconductor/{bandera}")
    public List<CConductorEntity> ConsultaCConductor(
            @RequestBody CConductorEntity entidad,
            @PathVariable Integer bandera) {
        return serviceCConductorService.ConsultaCConductor(entidad, bandera);
    }
    
    @GetMapping("/consectores/{bandera}/{NOMBRE_SECTOR}/{CD_PAIS}/{CD_RGION}/{CD_MNCPIO}")
    public List<SectoresEntity> ConsultaSectores(
            @PathVariable Integer bandera,
            @PathVariable String NOMBRE_SECTOR,
            @PathVariable Integer CD_PAIS,
            @PathVariable Integer CD_RGION,
            @PathVariable Integer CD_MNCPIO) {
        return serviceSectoresService.ConsultaSectores(bandera, NOMBRE_SECTOR, CD_PAIS, CD_RGION, CD_MNCPIO);
    }
    
    @PostMapping("/csectorofertamod/{bandera}")
    public String CSectorOfertaMod(
            @RequestBody CSectorOfertaModEntity entidad,
            @PathVariable Integer bandera) {
        return serviceCSectorOfertaModService.CSectorOfertaMod(entidad, bandera);
    }
    
    @GetMapping("/conscsectoroferta/{bandera}/{CD_CNSCTVO}")
    public List<CSectorOfertaEntity> ConsultaCSectorOferta(
            @PathVariable Integer bandera,
            @PathVariable Integer CD_CNSCTVO) {
        return serviceCSectorOfertaService.ConsultaCSectorOferta(bandera, CD_CNSCTVO);
    }
    
    @PostMapping("/cconductorofertamod/{bandera}")
    public String CConductorOfertaMod(
            @RequestBody CConductorSectorOfertaModEntity entidad,
            @PathVariable Integer bandera) {
        return serviceCConductorSectorOfertaModService.CConductorOfertaMod(entidad, bandera);
    }
    
    @GetMapping("/conscciudadistcionofert/{bandera}/{CD_CNSCTVO}")
    public List<CCiudadDistribucionOfertEntity> ConsultaCCiudadDistcionOferta(
            @PathVariable Integer bandera,
            @PathVariable String CD_CNSCTVO) {
        return serviceCCiudadDistribucionOfertService.ConsultaCCiudadDistcionOferta(bandera, CD_CNSCTVO);
    }
    
    @PostMapping("/sectoresmod/{BANDERA}")
    public String SectoresMod(
            @RequestBody SectoresModEntity entidad,
            @PathVariable Integer BANDERA) {
        return serviceSectoresModService.SectoresMod(entidad, BANDERA);
    }
    
    @PostMapping("/consaofertas/{Bandera}/{cnctivoOferta}/{id_prdcto}/{idProductor}")
    public List<AOfertasEntity> ConsultaAOfertas(
            @RequestBody AOfertasEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable Integer cnctivoOferta,
            @PathVariable Integer id_prdcto,
            @PathVariable Integer idProductor) {
        return serviceAOfertasService.ConsultaAOfertas(entidad, Bandera, cnctivoOferta, id_prdcto, idProductor);
    }
    
    @PostMapping("/aestadofertamod/{Bandera}")
    public String AEstadoOfertaMod(
            @RequestBody AestadoOfertaModEntity entidad,
            @PathVariable Integer Bandera) {
        return serviceAestadoOfertaModService.AEstadoOfertaMod(entidad, Bandera);
    }
    
    @GetMapping("/constransactivos/{bandera}/{id_condutor}/{usucodigTrans}")
    public List<TransActivosEntity> ConsultaTrascActivos(
            @PathVariable Integer bandera,
            @PathVariable Integer id_condutor,
            @PathVariable Integer usucodigTrans) {
        return serviceTransActivosService.ConsultaTrascActivos(bandera, id_condutor, usucodigTrans);
    }
    
    @PostMapping("/evidenciamod/{bandera}/{id_conductor}/{id_factura}/{Entregado}")
    public String EvidenciaMod(
            @RequestBody evidenciaModEntity entidad,
            @PathVariable Integer bandera,
            @PathVariable Integer id_conductor,
            @PathVariable Integer id_factura,
            @PathVariable Integer Entregado) {
        return serviceevidenciaModService.EvidenciaMod(entidad, bandera, id_conductor, id_factura, Entregado);
    }
    
    @GetMapping("/consconductorsectorofert/{bandera}/{CD_CNSCTVO}")
    public List<CConductorSectorOfertaEntity> ConsultaConductSectorOfert(
            @PathVariable Integer bandera,
            @PathVariable String CD_CNSCTVO) {
        return serviceCConductorSectorOfertaService.ConsultaConductSectorOfert(bandera, CD_CNSCTVO);
    }
    
    @GetMapping("/consestadoentrega/{bandera}")
    public List<estadoEntregaEntity> ConsultaEstadoEntrega(
            @PathVariable Integer bandera) {
        return serviceestadoEntregaService.ConsultaEstadoEntrega(bandera);
    }
    
    @GetMapping("/consentregasconductor/{bandera}/{ID_CNDCTOR}/{id_Sector}/{cd_cnctivo}/{coordernadas}")
    public List<entregasConductorEntity> ConsultaEntregasConductor(
            @PathVariable Integer bandera,
            @PathVariable Integer ID_CNDCTOR,
            @PathVariable Integer id_Sector,
            @PathVariable Integer cd_cnctivo,
            @PathVariable String coordernadas) {
        return serviceentregasConductorService.ConsultaEntregasConductor(bandera, ID_CNDCTOR, id_Sector, cd_cnctivo, coordernadas);
    }
    
    @GetMapping("/consevidencia/{bandera}/{id_evidencia}/{id_factura}")
    public List<evidenciaEntity> ConsultaEvidencia(
            @PathVariable Integer bandera,
            @PathVariable Integer id_evidencia,
            @PathVariable Integer id_factura) {
        return serviceevidenciaService.ConsultaEvidencia(bandera, id_evidencia, id_factura);
    }
    
    @PostMapping("/ciudadofertamod/{Bandera}")
    public String CiudadOfertaMod(
            @RequestBody CiudadOfertaModEntity entidad,
            @PathVariable Integer Bandera) {
        return serviceCiudadOfertaModService.CiudadOfertaMod(entidad, Bandera);
    }
    
    @PostMapping("/cvaloracionofertamod/{BANDERA}")
    public String CValoracionOfertaMod(
            @RequestBody CValoracionOfertaModEntity entidad,
            @PathVariable Integer BANDERA) {
        return serviceCValoracionOfertaModService.CValoracionOfertaMod(entidad, BANDERA);
    }
    
    @GetMapping("/conscvaloracionoferta/{BANDERA}/{CD_CNSCTVO}/{ID_SCTOR_OFRTA}")
    public List<CValoracionOfertaEntity> ConsultaCValoracionOferta(
            @PathVariable Integer BANDERA,
            @PathVariable Integer CD_CNSCTVO,
            @PathVariable Integer ID_SCTOR_OFRTA) {
        return serviceCValoracionOfertaService.ConsultaCValoracionOferta(BANDERA, CD_CNSCTVO, ID_SCTOR_OFRTA);
    }
    
    @PostMapping("/enviocorreoindividual/{bandera}/{Id_Clnte}/{IdSctor}")
    public String EnvioCorreoIndividual(
            @RequestBody EnvioCorreo_IndividualEntity entidad,
            @PathVariable Integer bandera,
            @PathVariable Integer Id_Clnte,
            @PathVariable Integer IdSctor) {
        return serviceEnvioCorreo_IndividualService.EnvioCorreoIndividual(entidad, bandera, Id_Clnte, IdSctor);
    }
    
    @GetMapping("/remitentecorreo")
    public List<RemitenteCorreoEntity> ConsRemitenteCorreo() {
        return serviceRemitenteCorreoService.ConsRemitenteCorreo();
    }
    
    @GetMapping("/enviocorreomasivo/{bandera}/{IdPlantilla}/{IdTipoUsuario}/{cd_cnctvo}/{IdSector}")
    public String MasivoEnvioCorreo(
            @PathVariable Integer bandera,
            @PathVariable Integer IdPlantilla,
            @PathVariable Integer IdTipoUsuario,
            @PathVariable Integer cd_cnctvo,
            @PathVariable Integer IdSector) {
        return serviceCEnvioRealCorreoService.ConsultaEnvioRealCorreo(bandera, IdPlantilla, IdTipoUsuario, cd_cnctvo, IdSector);
    }
    
    @GetMapping("/consenviorealcorreocd/{bandera}/{IdPlantilla}/{IdTipoUsuario}/{cd_cnctvo}")
    public String ConsultaEnvioMailCorreo(
            @PathVariable Integer bandera,
            @PathVariable Integer IdPlantilla,
            @PathVariable Integer IdTipoUsuario,
            @PathVariable Integer cd_cnctvo) {
        return serviceCEnvioCodigoCorreoService.ConsultaEnvioMailCorreo(bandera, IdPlantilla, IdTipoUsuario, cd_cnctvo);
    }
    
    @PostMapping("/conscofertasnuevas/{Bandera}/{cnctivoOferta}/{id_prdcto}")
    public List<COfertasNuevasEntity> ConsultaOfertasNuevas(
            @RequestBody COfertasNuevasEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable Integer cnctivoOferta,
            @PathVariable Integer id_prdcto) {
        return serviceCOfertasNuevasService.ConsultaOfertasNuevas(entidad, Bandera, cnctivoOferta, id_prdcto);
    }
    
    @PostMapping("/consofertacarritocompras/{Bandera}/{cnctivoOferta}/{id_prdcto}")
    public List<OfertasCarritoComprasEntity> ConsultaOfertasCarritoCompras(
            @RequestBody OfertasCarritoComprasEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable Integer cnctivoOferta,
            @PathVariable Integer id_prdcto) {
        return serviceOfertasCarritoComprasService.ConsultaOfertasCarritoCompras(entidad, Bandera, cnctivoOferta, id_prdcto);
    }
    
    @PostMapping("/consofertashistorial/{Bandera}/{cnctivoOferta}/{id_prdcto}")
    public List<OfertasHistorialEntity> ConsultaOfertasCarritoCompras(
            @RequestBody OfertasHistorialEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable Integer cnctivoOferta,
            @PathVariable Integer id_prdcto) {
        return serviceOfertasHistorialService.ConsultaOfertasCarritoCompras(entidad, Bandera, cnctivoOferta, id_prdcto);
    }
    
    @PostMapping("/consusuarioadmin/{Bandera}")
    public List<UsuarioAdminEntity> ConsultaUserAdmin(
            @RequestBody UsuarioAdminEntity entidad,
            @PathVariable Integer Bandera) {
        return serviceUsuarioAdminService.ConsultaUserAdmin(entidad, Bandera);
    }
    
    @PostMapping(value = "/send")
    @ResponseBody
    public String SendEmail(@RequestBody EmailEntity emailBody) {
        return serviceOlvidoClaveService.sendEmail(emailBody);
    }
    
    @PostMapping("/conslogintrans/{bandera}")
    public List<loginTransEntity> ConsultaLoginTransportista(
            @RequestBody loginTransEntity entidad,
            @PathVariable Integer bandera) {
        return serviceloginTransService.ConsultaLoginTransportista(entidad, bandera);
    }
    
    @GetMapping("/conscosteoferta/{bandera}/{CD_CNSCTVO}")
    public List<CosteoOfertaEntity> ConsultaCosteoOferta(
            @PathVariable Integer bandera,
            @PathVariable String CD_CNSCTVO) {
        return serviceCosteoOfertaService.ConsultaCosteoOferta(bandera, CD_CNSCTVO);
    }
    
    @PostMapping("/costeofertamod/{bandera}")
    public String CosteOFertaMod(
            @RequestBody CosteoOfertaModEntity entidad,
            @PathVariable Integer bandera) {
        return serviceCosteoOfertaModService.CosteOFertaMod(entidad, bandera);
    }
    
    @PostMapping("/conslogincliente/{bandera}")
    public List<loginClienteEntity> ConsultaLoginCliente(
            @RequestBody loginClienteEntity entidad,
            @PathVariable Integer bandera) {
        return serviceloginClienteService.ConsultaLoginCliente(entidad, bandera);
    }

    // servicio respuesta mensajes
    @GetMapping("/modrespuestasms")
    public String ModRespuestaSms(
            @RequestParam String mensaje,
            @RequestParam String celular) {
        return serviceRespuestaSmsModService.ModRespuestaSms(mensaje, celular);
    }
    
    @PostMapping("/personacampesinamod/{bandera}")
    public String CPersonaCampeMod(
            @RequestBody CpersonaCampesinoModEntity entidad,
            @PathVariable Integer bandera) {
        return serviceCpersonaCampesinoModService.CPersonaCampeMod(entidad, bandera);
    }
    
    @PostMapping("/cordenadassectormod/{BANDERA}")
    public String CordenadasSectorMod(
            @RequestBody CCordenadasSectorModEntity entidad,
            @PathVariable Integer BANDERA) {
        return serviceCCordenadasSectorModService.CordenadasSectorMod(entidad, BANDERA);
    }
    
    @GetMapping("/consultestadoferta/{bandera}/{CD_CNSCTVO}")
    public List<CConsultaEstadoOfertaEntity> ConsultaCEstadoOferta(
            @PathVariable Integer bandera,
            @PathVariable String CD_CNSCTVO) {
        return serviceCConsultaEstadoOfertaService.ConsultaCEstadoOferta(bandera, CD_CNSCTVO);
    }
    
    @GetMapping("/consccordenadasector/{BANDERA}/{ID_SCTOR_OFRTA}")
    public List<CCordenadasSectorEntity> ConsultaCordenadasSector(
            @PathVariable Integer BANDERA,
            @PathVariable Integer ID_SCTOR_OFRTA) {
        return serviceCCordenadasSectorService.ConsultaCordenadasSector(BANDERA, ID_SCTOR_OFRTA);
    }
    
    @GetMapping("/conscsectorconductor/{bandera}/{cd_cnctivo}")
    public List<CSectorConductorEntity> ConsultaSectorConductor(
            @PathVariable Integer bandera,
            @PathVariable Integer cd_cnctivo) {
        return serviceCSectorConductorService.ConsultaSectorConductor(bandera, cd_cnctivo);
    }
    
    @PostMapping("/modconductoroferta/{BANDERA}")
    public String ModConductorOfert(
            @RequestBody ConductorOfertaModEntity entidad,
            @PathVariable Integer BANDERA) {
        return serviceConductorOfertaModService.ModConductorOfert(entidad, BANDERA);
    }
    
    @GetMapping("/conscdatostransportista/{bandera}/{usucodig}/{IdConductor}")
    public List<CDatosTransportistaEntity> ConsultaCDatosTransportista(
            @PathVariable Integer bandera,
            @PathVariable String usucodig,
            @PathVariable Integer IdConductor) {
        return serviceCDatosTransportistaService.ConsultaCDatosTransportista(bandera, usucodig, IdConductor);
    }
    
    @GetMapping("/consctipocosteoferta/{bandera}")
    public List<CTipoCosteoOfertaEntity> ConsultaCTipoCosteoOferta(
            @PathVariable Integer bandera) {
        return serviceCTipoCosteoOfertaService.ConsultaCTipoCosteoOferta(bandera);
    }
    
    @PostMapping("/modpersonatransportista/{bandera}")
    public String ModPersonaTransportista(
            @RequestBody CpersonaTransportistaModEntity entidad,
            @PathVariable Integer bandera) {
        return serviceCpersonaTransportistaModService.ModPersonaTransportista(entidad, bandera);
    }
    
    @PostMapping("/modcpersonacliente/{bandera}/{banderaDos}")
    public String ModCPersonaCliente(
            @RequestBody CpersonaClienteModEntity entidad,
            @PathVariable Integer bandera,
            @PathVariable Integer banderaDos) {
        return serviceCpersonaClienteModService.ModCPersonaCliente(entidad, bandera, banderaDos);
    }
    
    @GetMapping("/consctipoplantilla/{Bandera}")
    public List<CtipoPlantillaEntity> ConsultaTipoPlantillas(
            @PathVariable Integer Bandera) {
        return serviceCtipoPlantillaService.ConsultaTipoPlantillas(Bandera);
    }
    
    @GetMapping("/conscorreomomentoenvio/{Bandera}")
    public List<CorreoMomentoEnvioEntoty> ConsultaCorreoMomentoEnvio(
            @PathVariable Integer Bandera) {
        return serviceCorreoMomentoEnvioService.ConsultaCorreoMomentoEnvio(Bandera);
    }
    
    @GetMapping("/consctipomomentoenvio/{Bandera}")
    public List<CtipoMomentoEnvioEntity> ConsultaTipoMomentoEnvio(
            @PathVariable Integer Bandera) {
        return serviceCtipoMomentoEnvioService.ConsultaTipoMomentoEnvio(Bandera);
    }
    
    @PostMapping("/consaplantillacorreo/{Bandera}")
    public List<CAplantillaCorreoEntity> ConsultaReporteAuditoria(
            @RequestBody CAplantillaCorreoEntity entidad,
            @PathVariable Integer Bandera) {
        return serviceCAplantillaCorreoService.ConsultaAplantillaCorreo(entidad, Bandera);
    }
    
    @GetMapping("/conscatipocamposcorreo/{Bandera}")
    public List<CATipoCamposCorreoEntity> ConsultaTipoCamposCorreo(
            @PathVariable Integer Bandera) {
        return serviceCATipoCamposCorreoService.ConsultaTipoCamposCorreo(Bandera);
    }
    
    @PostMapping("/modcaplantillacorreo/{Bandera}")
    public String ModCAPlantillaCorreo(
            @RequestBody CAPlantillaCorreoModEntity entidad,
            @PathVariable Integer Bandera) {
        return serviceCAPlantillaCorreoModService.ModCAPlantillaCorreo(entidad, Bandera);
    }
    
    @PostMapping("/modcdocumentocorreo/{Bandera}")
    public String ModCDocumentoCorreo(
            @RequestBody CDocumentoCorreoModEntity entidad,
            @PathVariable Integer Bandera) {
        return serviceCDocumentoCorreoModService.ModCDocumentoCorreo(entidad, Bandera);
    }
    
    @GetMapping("/conscdocumentocorreo/{Bandera}/{IdPlantilla}")
    public List<CDocumentoCorreoEntity> ConsultaCDocumentoCorreo(
            @PathVariable Integer Bandera,
            @PathVariable Integer IdPlantilla) {
        return serviceCDocumentoCorreoService.ConsultaCDocumentoCorreo(Bandera, IdPlantilla);
    }
    
    @GetMapping("/consctransportesnuevos/{Bandera}/{usucodigTrans}/{id_conductor}")
    public List<CTransportesNuevosEntity> ConsultaCTransportesNuevos(
            @PathVariable Integer Bandera,
            @PathVariable Integer usucodigTrans,
            @PathVariable Integer id_conductor) {
        return serviceCTransportesNuevosService.ConsultaCTransportesNuevos(Bandera, usucodigTrans, id_conductor);
    }
    
    @GetMapping("/consconductortransportesnuevos/{Bandera}/{usucodigTrans}/{CD_CNSCTVO}/{IdSector}")
    public List<CconductoresTransportesNuevosEntity> ConsultaConductoresTransportes(
            @PathVariable Integer Bandera,
            @PathVariable Integer usucodigTrans,
            @PathVariable Integer CD_CNSCTVO,
            @PathVariable Integer IdSector) {
        return serviceCconductoresTransportesNuevosService.ConsultaConductoresTransportes(Bandera, usucodigTrans, CD_CNSCTVO, IdSector);
    }
    
    @PostMapping("/modconductorsector/{Bandera}")
    public String ModConductorSector(
            @RequestBody ConductorSectorModEntity entidad,
            @PathVariable Integer Bandera) {
        return serviceConductorSectorModService.ModConductorSector(entidad, Bandera);
    }
    
    @GetMapping("/conscpersonatrans/{bandera}/{usucodig}/{id_conductor}")
    public List<CPersonaTransEntity> ConsultaCPersonaTrans(
            @PathVariable Integer bandera,
            @PathVariable Integer usucodig,
            @PathVariable Integer id_conductor) {
        return serviceCPersonaTransService.ConsultaCPersonaTrans(bandera, usucodig, id_conductor);
    }
    
    @GetMapping("/conscvalidacambioetapa/{Bandera}/{CD_CNSCTVO}/{FASE_SIGUIENTE}")
    public String ConsultaCValidaCambioEtapa(
            @PathVariable Integer Bandera,
            @PathVariable Integer CD_CNSCTVO,
            @PathVariable Integer FASE_SIGUIENTE) {
        return serviceCValidaCambioEtapaService.ConsultaCValidaCambioEtapa(Bandera, CD_CNSCTVO, FASE_SIGUIENTE);
    }
    
    @PostMapping("/modcvigenciaoferta/{BANDERA}")
    public String ModCVigenciaOferta(
            @RequestBody CVigenciaOfertaModEntity entidad,
            @PathVariable Integer BANDERA) {
        return serviceCVigenciaOfertaModService.ModCVigenciaOferta(entidad, BANDERA);
    }
    
    @GetMapping("/conscvigenciaoferta/{BANDERA}/{CD_CNSCTVO}/{ID_SCTOR_OFRTA}")
    public List<CVigenciaOfertaEntoty> ConsultaCVigenciaOferta(
            @PathVariable Integer BANDERA,
            @PathVariable Integer CD_CNSCTVO,
            @PathVariable Integer ID_SCTOR_OFRTA) {
        return serviceCVigenciaOfertaService.ConsultaCVigenciaOferta(BANDERA, CD_CNSCTVO, ID_SCTOR_OFRTA);
    }
    
    @GetMapping("/conscalculapreciofinindividual/{BANDERA}/{CD_CNSCTVO}/{ID_SCTOR_OFRTA}/{tpo_cmsion_indvdual}/{vlor_cmsion_indvdual}")
    public List<CCalculaPrecioFinIndividualEntity> ConsultaCalculaPrecioFinIndiv(
            @PathVariable Integer BANDERA,
            @PathVariable Integer CD_CNSCTVO,
            @PathVariable Integer ID_SCTOR_OFRTA,
            @PathVariable Integer tpo_cmsion_indvdual,
            @PathVariable Integer vlor_cmsion_indvdual) {
        return serviceCCalculaPrecioFinIndividualService.ConsultaCalculaPrecioFinIndiv(BANDERA, CD_CNSCTVO, ID_SCTOR_OFRTA, tpo_cmsion_indvdual, vlor_cmsion_indvdual);
    }
    
    @GetMapping("/conscalculapreciofingrupal/{BANDERA}/{CD_CNSCTVO}/{ID_SCTOR_OFRTA}/{tpo_cmsion_grupal}/{vlor_cmsion_grupal}/{vlor_dmcilio_grupal}/{mnmo_prsnas_xgrupo}")
    public List<CCalculaPrecioFinGrupalEntity> ConsultaCCalculaPrecioFinGrupal(
            @PathVariable Integer BANDERA,
            @PathVariable Integer CD_CNSCTVO,
            @PathVariable Integer ID_SCTOR_OFRTA,
            @PathVariable Integer tpo_cmsion_grupal,
            @PathVariable Integer vlor_cmsion_grupal,
            @PathVariable Integer vlor_dmcilio_grupal,
            @PathVariable Integer mnmo_prsnas_xgrupo) {
        return serviceCCalculaPrecioFinGrupalService.ConsultaCCalculaPrecioFinGrupal(BANDERA, CD_CNSCTVO, ID_SCTOR_OFRTA, tpo_cmsion_grupal, vlor_cmsion_grupal, vlor_dmcilio_grupal, mnmo_prsnas_xgrupo);
    }
    
    @GetMapping("/conscalculapreciofinmixta/{BANDERA}/{CD_CNSCTVO}/{ID_SCTOR_OFRTA}/{tpo_cmsion_indvdual}/{vlor_cmsion_indvdual}/{tpo_cmsion_grupal}/{vlor_cmsion_grupal}/{vlor_dmcilio_indvdual}/{vlor_dmcilio_grupal}/{mnmo_prsnas_xgrupo}")
    public List<CCalculaPrecioFinMixtaEntity> ConsultaCalcPrecioFinMixta(
            @PathVariable Integer BANDERA,
            @PathVariable Integer CD_CNSCTVO,
            @PathVariable Integer ID_SCTOR_OFRTA,
            @PathVariable Integer tpo_cmsion_indvdual,
            @PathVariable Integer vlor_cmsion_indvdual,
            @PathVariable Integer tpo_cmsion_grupal,
            @PathVariable Integer vlor_cmsion_grupal,
            @PathVariable Integer vlor_dmcilio_indvdual,
            @PathVariable Integer vlor_dmcilio_grupal,
            @PathVariable Integer mnmo_prsnas_xgrupo) {
        return serviceCCalculaPrecioFinMixtaService.ConsultaCalcPrecioFinMixta(BANDERA, CD_CNSCTVO, ID_SCTOR_OFRTA, tpo_cmsion_indvdual, vlor_cmsion_indvdual, tpo_cmsion_grupal, vlor_cmsion_grupal, vlor_dmcilio_indvdual, vlor_dmcilio_grupal, mnmo_prsnas_xgrupo);
    }
    
    @PostMapping("/modccambiaestadoferta/{Bandera}")
    public String ModCCambiaEstadoOferta(
            @RequestBody CCambiaEstadoOfertaModEntity entidad,
            @PathVariable Integer Bandera) {
        return serviceCCambiaEstadoOfertaModService.ModCCambiaEstadoOferta(entidad, Bandera);
    }
    
    @PostMapping("/conscalificapp")
    public String ConsultaCalificaApp(
            @RequestBody CCalificaAppEntity entidad) {
        return serviceCCalificaAppService.ConsultaCalificaApp(entidad);
    }
    
    @GetMapping("/consconductorcond/{bandera}/{id_conductor}")
    public List<CConductorCondEntity> ConsultaCConductorCond(
            @PathVariable Integer bandera,
            @PathVariable Integer id_conductor) {
        return serviceCConductorCondService.ConsultaCConductorCond(bandera, id_conductor);
    }
    
    @GetMapping("/conscnuevasofertas/{Bandera}/{Usucodig}/{Cd_cnctvo}/{Id_Sector}")
    public List<CNuevasOfertasEntity> ConsultaCConductorCond(
            @PathVariable Integer Bandera,
            @PathVariable Integer Usucodig,
            @PathVariable Integer Cd_cnctvo,
            @PathVariable Integer Id_Sector) {
        return serviceCNuevasOfertasService.ConsultaCNuevasOfertas(Bandera, Usucodig, Cd_cnctvo, Id_Sector);
    }
    
    @PostMapping("/modtokenpersona/{Bandera}")
    public String ModtokenPersona(
            @RequestBody CtokenPersonaModEntity entidad,
            @PathVariable Integer Bandera) {
        return serviceCtokenPersonaModService.ModtokenPersona(entidad, Bandera);
    }
    
    @PostMapping("/modccompras/{Bandera}")
    public String ModCCompras(
            @RequestBody CComprasModEntity entidad,
            @PathVariable Integer Bandera) {
        return serviceCComprasModService.ModCCompras(entidad, Bandera);
    }
    
    @GetMapping("/conscunidadesdisponibles/{Bandera}/{Usucodig}/{Cd_cnctvo}/{Id_Sector}")
    public List<CUnidadesDisponiblesEntity> ConsultaCUnidadesDisponibles(
            @PathVariable Integer Bandera,
            @PathVariable Integer Usucodig,
            @PathVariable Integer Cd_cnctvo,
            @PathVariable Integer Id_Sector) {
        return serviceCUnidadesDisponiblesService.ConsultaCUnidadesDisponibles(Bandera, Usucodig, Cd_cnctvo, Id_Sector);
    }
    
    @GetMapping("/consccompras/{Bandera}/{Usucodig}/{Cd_cnctvo}/{Id_cliente}")
    public List<CComprasEntity> ConsultaCCompras(
            @PathVariable Integer Bandera,
            @PathVariable Integer Usucodig,
            @PathVariable Integer Cd_cnctvo,
            @PathVariable Integer Id_cliente) {
        return serviceCComprasService.ConsultaCCompras(Bandera, Usucodig, Cd_cnctvo, Id_cliente);
    }
    
    @GetMapping("/conscpersonamenu/{Bandera}/{Usucodig}")
    public List<CPersonaMenuEntity> ConsultaCPersonaMenu(
            @PathVariable Integer Bandera,
            @PathVariable Integer Usucodig) {
        return serviceCPersonaMenuService.ConsultaCPersonaMenu(Bandera, Usucodig);
    }
    
    @GetMapping("/conscparticipantegrupo/{Bandera}/{IdGrupo}/{Usucodig}")
    public List<CparticipanteGrupoEntity> ConsultaCParticipanteGrupo(
            @PathVariable Integer Bandera,
            @PathVariable Integer IdGrupo,
            @PathVariable Integer Usucodig) {
        return serviceCparticipanteGrupoService.ConsultaCParticipanteGrupo(Bandera, IdGrupo, Usucodig);
    }
    
    @PostMapping("/conscvalidacodigo/{Bandera}")
    public String ConsultaCValidaCodigo(
            @RequestBody CValidaCodigoEntity entidad,
            @PathVariable Integer Bandera) {
        return serviceCValidaCodigoService.ConsultaCValidaCodigo(entidad, Bandera);
    }
    
    @PostMapping("/conscalculadorapagoscliente/{Bandera}/{Operacion}/{Formato}/{Cd_Cnsctvo}/{Id_Sector}/{Unidades}/{Usucodig}/{CodGrupo}")
    public List<CalculadoraPagosClienteEntity> ConsultaCalculadoraPagosClient(
            @RequestBody CalculadoraPagosClienteEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable Integer Operacion,
            @PathVariable Integer Formato,
            @PathVariable Integer Cd_Cnsctvo,
            @PathVariable Integer Id_Sector,
            @PathVariable Integer Unidades,
            @PathVariable Integer Usucodig,
            @PathVariable String CodGrupo) {
        return serviceCalculadoraPagosClienteService.ConsultaCalculadoraPagosClient(entidad, Bandera, Operacion, Formato, Cd_Cnsctvo, Id_Sector, Unidades, Usucodig, CodGrupo);
    }
    
    @GetMapping("/consunidadesdisponibleslista/{Bandera}/{Usucodig}/{Cd_csctvo}/{Id_Sector}/{codMostrar}")
    public List<CUnidadesDisponiblesListaEntity> ConsultaUnidadesDisponiblesList(
            @PathVariable Integer Bandera,
            @PathVariable Integer Usucodig,
            @PathVariable Integer Cd_csctvo,
            @PathVariable Integer Id_Sector,
            @PathVariable String codMostrar) {
        return serviceCUnidadesDisponiblesListaService.ConsultaUnidadesDisponiblesList(Bandera, Usucodig, Cd_csctvo, Id_Sector, codMostrar);
    }
    
    @GetMapping("/consctiponoentrega/{Bandera}")
    public List<CTipoNoEntrgaEntity> ConsultaTipoNoEntrega(
            @PathVariable Integer Bandera) {
        return serviceCTipoNoEntrgaService.ConsultaTipoNoEntrega(Bandera);
    }
    
    @GetMapping("/conscultimaubicacion/{bandera}/{cd_cnscutivo}/{idConductor}/{IdSector}")
    public List<CultimaUbicacionEntity> ConsultaUltimaUbicacion(
            @PathVariable Integer bandera,
            @PathVariable Integer cd_cnscutivo,
            @PathVariable Integer idConductor,
            @PathVariable Integer IdSector) {
        return serviceCultimaUbicacionService.ConsultaUltimaUbicacion(bandera, cd_cnscutivo, idConductor, IdSector);
    }
    
    @PostMapping("/insenviosmsnuevaentrega/{Bandera}")
    public String InsertEnvioSmsNuevaEntrega(
            @RequestBody EnvioSMSNuevaEntregaEntity entidad,
            @PathVariable Integer Bandera) {
        return serviceEnvioSMSNuevaEntregaService.InsertEnvioSmsNuevaEntrega(entidad, Bandera);
    }
    
    @PostMapping("/modctipocosteo/{Bandera}")
    public String ModCTipoCoste(
            @RequestBody CTipoCosteoModEntity entidad,
            @PathVariable Integer Bandera) {
        return serviceCTipoCosteoModService.ModCTipoCoste(entidad, Bandera);
    }
    
    @PostMapping("/modcalificaprod/{Bandera}")
    public String ModCalificaProdMod(
            @RequestBody CalificaProdModEntity entidad,
            @PathVariable Integer Bandera) {
        return serviceCalificaProdModService.ModCalificaProdMod(entidad, Bandera);
    }
    
    @PostMapping("/actcestadotransporte/{Bandera}")
    public String ActualizaCEstadoTransporte(
            @RequestBody CEstadoTransporteModEntity entidad,
            @PathVariable Integer Bandera) {
        return serviceCEstadoTransporteModService.ActualizaCEstadoTransporte(entidad, Bandera);
    }
    
    @GetMapping("/consclientepagostrans/{Bandera}/{Cd_csnctivo}/{IdSector}/{idConductor}")
    public List<ClientePagosTransEntity> ConsultaClientePagosTrans(
            @PathVariable Integer Bandera,
            @PathVariable Integer Cd_csnctivo,
            @PathVariable Integer IdSector,
            @PathVariable Integer idConductor) {
        return serviceClientePagosTransService.ConsultaClientePagosTrans(Bandera, Cd_csnctivo, IdSector, idConductor);
    }
    
    @GetMapping("/consctipopagostrans/{Bandera}/{Usucodig}")
    public List<CTipoPagosTransEntity> ConsultaCTipoPagosTrans(
            @PathVariable Integer Bandera,
            @PathVariable Integer Usucodig) {
        return serviceCTipoPagosTransService.ConsultaCTipoPagosTrans(Bandera, Usucodig);
    }
    
    @GetMapping("/conscpagostranstotales/{Bandera}/{Cd_csnctivo}/{IdSector}/{idConductor}")
    public String ConsultaCPagosTransTotales(
            @PathVariable Integer Bandera,
            @PathVariable Integer Cd_csnctivo,
            @PathVariable Integer IdSector,
            @PathVariable Integer idConductor) {
        return serviceCPagosTransTotalesService.ConsultaCPagosTransTotales(Bandera, Cd_csnctivo, IdSector, idConductor);
    }
    
    @GetMapping("/enviosmsindividual/{Bandera}/{Usucodig}/{cd_cnctivo}/{idSector}/{idCliente}/{TelefonoP}/{Codigo}")
    public String EnvioSmsIndividual(
            @PathVariable Integer Bandera,
            @PathVariable Integer Usucodig,
            @PathVariable Integer cd_cnctivo,
            @PathVariable Integer idSector,
            @PathVariable Integer idCliente,
            @PathVariable String TelefonoP,
            @PathVariable String Codigo) {
        return serviceEnviosmsIndividualService.EnvioSmsIndividual(Bandera, Usucodig, cd_cnctivo, idSector, idCliente, TelefonoP, Codigo);
    }
    
    @GetMapping("/conscagrotiponovedad/{Bandera}/{IdNovedad}")
    public List<CAgroTipoNovedadEntity> ConsultaCAgroTipoNovedad(
            @PathVariable Integer Bandera,
            @PathVariable Integer IdNovedad) {
        return serviceCAgroTipoNovedadService.ConsultaCAgroTipoNovedad(Bandera, IdNovedad);
    }
    
    @PostMapping("/modcnovedad/{Bandera}")
    public String ModCNovedad(
            @RequestBody CNovedadModEntity entidad,
            @PathVariable Integer Bandera) {
        return serviceCNovedadModService.ModCNovedad(entidad, Bandera);
    }
    
    @GetMapping("/consctipotoppin/{Bandera}")
    public List<CTipoToppinEntity> ConsultaCTipoToppin(
            @PathVariable Integer Bandera) {
        return serviceCTipoToppinService.ConsultaCTipoToppin(Bandera);
    }
    
    @PostMapping("/modctopping/{Bandera}")
    public String ModCTopping(
            @RequestBody CToppingModEntity entidad,
            @PathVariable Integer Bandera) {
        return serviceCToppingModService.ModCTopping(entidad, Bandera);
    }
    
    @GetMapping("/consclistadotopping/{Bandera}/{Id_Sector}/{cd_cnctivo}")
    public List<CListadoToppingEntity> ConsultaCListadoTopping(
            @PathVariable Integer Bandera,
            @PathVariable Integer Id_Sector,
            @PathVariable Integer cd_cnctivo) {
        return serviceCListadoToppingService.ConsultaCListadoTopping(Bandera, Id_Sector, cd_cnctivo);
    }
    
    @PostMapping("/conscreporteusuarios/{Bandera}/{FechaDesde}/{FechaHasta}")
    public List<CReporteUsuariosEntity> ConsultaCReporteUsuario(
            @RequestBody CReporteUsuariosEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable String FechaDesde,
            @PathVariable String FechaHasta) {
        return serviceCReporteUsuarioService.ConsultaCReporteUsuario(entidad, Bandera, FechaDesde, FechaHasta);
    }
    
    @GetMapping("/consctipousuario/{Bandera}")
    public List<CtipoUsuarioEntity> ConsultaCTipoUsuario(
            @PathVariable Integer Bandera) {
        return serviceCtipoUsuarioService.ConsultaCTipoUsuario(Bandera);
    }
    
    @GetMapping("/consctipocliente/{Bandera}/{Usucodig}")
    public List<CTipoClienteEntity> ConsultaCTipoCliente(
            @PathVariable Integer Bandera,
            @PathVariable Integer Usucodig) {
        return serviceCTipoClienteService.ConsultaCTipoCliente(Bandera, Usucodig);
    }
    
    @GetMapping("/consctipotransport/{Bandera}/{Usucodig}")
    public List<CTipoTransporEntity> ConsultaCTipoTranspor(
            @PathVariable Integer Bandera,
            @PathVariable Integer Usucodig) {
        return serviceCTipoTransporService.ConsultaCTipoTranspor(Bandera, Usucodig);
    }
    
    @GetMapping("/consctipoconductor/{Bandera}/{UsucodigTrans}")
    public List<CTipoConductorEntity> ConsultaCTipoConductor(
            @PathVariable Integer Bandera,
            @PathVariable Integer UsucodigTrans) {
        return serviceCTipoConductorService.ConsultaCTipoConductor(Bandera, UsucodigTrans);
    }
    
    @PostMapping("/conscreporteventas/{Bandera}/{cd_cnscutivo}/{IdSector}/{Id_Estado_Compra}/{Id_Estado_pago}")
    public List<CReporteVentasEntity> ConsultaCReporteVentas(
            @RequestBody CReporteVentasEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable Integer cd_cnscutivo,
            @PathVariable Integer IdSector,
            @PathVariable Integer Id_Estado_Compra,
            @PathVariable Integer Id_Estado_pago) {
        return serviceCReporteVentasService.ConsultaCReporteVentas(entidad, Bandera, cd_cnscutivo, IdSector, Id_Estado_Compra, Id_Estado_pago);
    }
    
    @GetMapping("/conscmistoppings/{Bandera}/{IdCliente}")
    public List<CMisToppingsEntity> ConsultaCMisToppings(
            @PathVariable Integer Bandera,
            @PathVariable Integer IdCliente) {
        return serviceCMisToppingsService.ConsultaCMisToppings(Bandera, IdCliente);
    }
    
    @GetMapping("/consctablero/{Bandera}/{UsucodigTrans}/{IdConductor}/{IdPlataforma}")
    public List<CtableroEntity> ConsultaCTablero(
            @PathVariable Integer Bandera,
            @PathVariable Integer UsucodigTrans,
            @PathVariable Integer IdConductor,
            @PathVariable Integer IdPlataforma) {
        return serviceCtableroService.ConsultaCTablero(Bandera, UsucodigTrans, IdConductor, IdPlataforma);
    }
    
    @PostMapping("/modctablero/{Bandera}")
    public String ModCTablero(
            @RequestBody CtableroModEntity entidad,
            @PathVariable Integer Bandera) {
        return serviceCtableroModService.ModCTablero(entidad, Bandera);
    }
    
    @GetMapping("/constsubmenu/{Bandera}/{IdTipoUsuario}/{Usucodig}")
    public List<TSubMenuEntity> ConsultaTSubMenu(
            @PathVariable Integer Bandera,
            @PathVariable Integer IdTipoUsuario,
            @PathVariable Integer Usucodig) {
        return serviceTSubMenuService.ConsultaTSubMenu(Bandera, IdTipoUsuario, Usucodig);
    }
    
    @GetMapping("/consctipocamposmasivo/{Bandera}")
    public List<CTipoCamposMasivoEntity> ConsultaTipoCamposMasivos(
            @PathVariable Integer Bandera) {
        return serviceCTipoCamposMasivoService.ConsultaTipoCamposMasivos(Bandera);
    }
    
    @GetMapping("/conscpreguntencsta/{bandera}/{CD_CNSCTVO}/{ID_SCTOR_OFRTA}")
    public List<CAgroPreguntasEncuestaEntity> ConsultaCAgroPreguntEnc(
            @PathVariable Integer bandera,
            @PathVariable String CD_CNSCTVO,
            @PathVariable String ID_SCTOR_OFRTA) {
        return serviceCAgroPreguntasEncuestaService.ConsultaCAgroPreguntEnc(bandera, CD_CNSCTVO, ID_SCTOR_OFRTA);
    }
    
    @PostMapping("/modcagroprespencsta/{bandera}")
    public String ModCAgroRespEncsta(
            @RequestBody CAgroRespuestasEncuestaModEntity entidad,
            @PathVariable Integer bandera) {
        return serviceCAgroRespuestasEncuestaModService.ModCAgroRespEncsta(entidad, bandera);
    }
    
    @PostMapping("/modagropreguntofert/{bandera}")
    public String ModAgroPreguntOfert(
            @RequestBody CAgroPreguntaOfertaModEntity entidad,
            @PathVariable Integer bandera) {
        return serviceCAgroPreguntaOfertaModService.ModAgroPreguntOfert(entidad, bandera);
    }
    
    @PostMapping("/conscagropreguntofert/{bandera}")
    public List<CAgroPreguntaOfertaEntity> ConsultaCAgroPreguntOfert(
            @RequestBody CAgroPreguntaOfertaEntity entidad,
            @PathVariable Integer bandera) {
        return serviceCAgroPreguntaOfertaService.ConsultaCAgroPreguntOfert(entidad, bandera);
    }
    
    @PostMapping("/conscperfilcliente/{bandera}")
    public List<CperfilClienteEntity> CosnultaCPerfilClient(
            @RequestBody CperfilClienteEntity entidad,
            @PathVariable Integer bandera) {
        return serviceCperfilClienteService.CosnultaCPerfilClient(entidad, bandera);
    }
    
    @GetMapping("/conscpublicidad/{Bandera}/{Id}/{IdVista}/{Usucodig}")
    public List<CPublicidadEntity> ConsultaCAgroPreguntEnc(
            @PathVariable Integer Bandera,
            @PathVariable Integer Id,
            @PathVariable Integer IdVista,
            @PathVariable Integer Usucodig) {
        return serviceCPublicidadService.ConsultaCPublicidad(Bandera, Id, IdVista, Usucodig);
    }
    
    @GetMapping("/constvistaspublic/{Bandera}")
    public List<TvistasPubliEntity> ConsultaTVistasPubli(
            @PathVariable Integer Bandera) {
        return serviceTvistasPubliService.ConsultaTVistasPubli(Bandera);
    }
    
    @GetMapping("/conscagrorespencompr/{bandera}/{ID_COMPRA}")
    public List<CAgroRespEncCompEntity> ConsultaCAgroRespEncComp(
            @PathVariable Integer bandera,
            @PathVariable String ID_COMPRA) {
        return serviceCAgroRespEncCompService.ConsultaCAgroRespEncComp(bandera, ID_COMPRA);
    }
    
    @GetMapping("/constaccionpubli/{Bandera}")
    public List<TaccionPubliEntity> ConsultaTAccionPubli(
            @PathVariable Integer Bandera) {
        return serviceTaccionPubliService.ConsultaTAccionPubli(Bandera);
    }
    
    @PostMapping("/modcpublicidad/{Bandera}")
    public String ModCPublicidad(
            @RequestBody CPublicidadModEntity entidad,
            @PathVariable Integer Bandera) {
        return serviceCPublicidadModService.ModCPublicidad(entidad, Bandera);
    }
    
    @PostMapping("/envioCorreoIndEmail/{bandera}")
    public String EnvioCorreoIndEmail(
            @RequestBody CEnvioCorreoIndEmailEntity entidad,
            @PathVariable Integer bandera) {
        return serviceCEnvioCorreoIndEmailService.EnvioCorreoIndEmail(entidad, bandera);
    }
    
    @PostMapping("/modcmodulo/{Bandera}")
    public String ModCModulo(
            @RequestBody CModuloModEntity entidad,
            @PathVariable Integer Bandera) {
        return serviceCModuloModService.ModCModulo(entidad, Bandera);
    }
    
    @PostMapping("/modcpubli/{Bandera}")
    public String ModCpubli(
            @RequestBody CPubliModEntity entidad,
            @PathVariable Integer Bandera) {
        return serviceCPubliModService.ModCpubli(entidad, Bandera);
    }
    
    @GetMapping("/consctipopregunta/{Bandera}")
    public List<cTipoPreguntaEntity> ConsultaTipoPregunt(
            @PathVariable Integer Bandera) {
        return servicecTipoPreguntaService.ConsultaTipoPregunt(Bandera);
    }
    
    @GetMapping("/consseguiminetogeneral/{Bandera}/{IdCliente}")
    public List<CSeguimientoGeneralEntity> ConsultaCSeguimientoGen(
            @PathVariable Integer Bandera,
            @PathVariable Integer IdCliente) {
        return serviceCSeguimientoGeneralService.ConsultaCSeguimientoGen(Bandera, IdCliente);
    }
    
    @GetMapping("/conscseguimiento/{Bandera}/{IdCliente}")
    public List<CseguimientoEntity> ConsultaCSeguimiento(
            @PathVariable Integer Bandera,
            @PathVariable Integer IdCliente) {
        return serviceCseguimientoService.ConsultaCSeguimiento(Bandera, IdCliente);
    }
    
    @GetMapping("/conscsubseguimiento/{Bandera}/{IdCliente}/{IdSeguimiento}")
    public List<CSubSeguimientoEntity> ConsultaCSubSeguimiento(
            @PathVariable Integer Bandera,
            @PathVariable Integer IdCliente,
            @PathVariable Integer IdSeguimiento) {
        return serviceCSubSeguimientoService.ConsultaCSubSeguimiento(Bandera, IdCliente, IdSeguimiento);
    }
    
    @GetMapping("/conscvalidanumero/{Bandera}/{numeroTel}")
    public String ConsultaCValidaNum(
            @PathVariable Integer Bandera,
            @PathVariable String numeroTel) {
        return serviceCvalidaNumeroService.ConsultaCValidaNum(Bandera, numeroTel);
    }
    
    @PostMapping("/servicioencripta")
    public String ServicioEncriptaDesencripta(
            @RequestBody EncriptacionEntity entidad) {
        return serviceEncriptacionService.Clave(entidad);
    }
    
    @GetMapping("/conscagrovalidaencuestas/{bandera}/{ID_COMPRA}")
    public List<CAgroValidaEncuestaEntity> ConsultaCAgroValEncuestas(
            @PathVariable Integer bandera,
            @PathVariable String ID_COMPRA) {
        return serviceCAgroValidaEncuestaService.ConsultaCAgroValEncuestas(bandera, ID_COMPRA);
    }
    
    @GetMapping("/conscagroestcompago/{bandera}")
    public List<CAgroEstComPagoEntity> ConsultaCAgroEstComPago(
            @PathVariable Integer bandera) {
        return serviceCAgroEstComPagoService.ConsultaCAgroEstComPago(bandera);
    }
    
    @GetMapping("/conscagrormenofertamenu/{bandera}/{CD_CNSCTVO}")
    public List<CAgroRmenOfertaMenuEntity> ConsultaResumenOfertaMenu(
            @PathVariable Integer bandera,
            @PathVariable String CD_CNSCTVO) {
        return serviceCAgroRmenOfertaMenuService.ConsultaResumenOfertaMenu(bandera, CD_CNSCTVO);
    }
    
    @PostMapping("/modagropregunta/{Bandera}")
    public String ActAGROPREGUNTA(
            @RequestBody AGROPREGUNTAMODEntity entidad,
            @PathVariable Integer Bandera) {
        return serviceAGROPREGUNTAMODService.ActAGROPREGUNTA(entidad, Bandera);
    }
    
    @GetMapping("/firebasenotification/{bandera}")
    public String FirebaseNoti(
            @PathVariable Integer bandera) {
        return serviceFirebaseNotificationService.FirebaseNoti(bandera);
    }
    
    @GetMapping("/conscentregaseg/{Bandera}/{cd_cnscutivo}/{IdSector}")
    public List<CEntregaSegEntity> ConsultaCEntregaSeg(
            @PathVariable Integer Bandera,
            @PathVariable Integer cd_cnscutivo,
            @PathVariable Integer IdSector) {
        return serviceCEntregaSegService.ConsultaCEntregaSeg(Bandera, cd_cnscutivo, IdSector);
    }
    
    @GetMapping("/conscofertasexternas/{Bandera}/{Cd_cnctvo}/{Id_Sector}")
    public List<COfertasExternasEntity> ConsultaCOfertasExt(
            @PathVariable Integer Bandera,
            @PathVariable Integer Cd_cnctvo,
            @PathVariable Integer Id_Sector) {
        return serviceCOfertasExternasService.ConsultaCOfertasExt(Bandera, Cd_cnctvo, Id_Sector);
    }
    
    @GetMapping("/modcsectorpoligono/{BANDERA}/{ID_SCTOR}")
    public String ModCSectorPoligono(
            @PathVariable Integer BANDERA,
            @PathVariable Integer ID_SCTOR) {
        return serviceCSectorPoligonoModService.ModCSectorPoligono(BANDERA, ID_SCTOR);
    }
    
    @GetMapping("/constrazestoferta/{bandera}/{CD_CNSCTVO}")
    public List<CTrazabilidadEstadoOfertaEntity> ConsultaTranzEstOferta(
            @PathVariable Integer bandera,
            @PathVariable String CD_CNSCTVO) {
        return serviceCTrazabilidadEstadoOfertaService.ConsultaTranzEstOferta(bandera, CD_CNSCTVO);
    }
    
    @GetMapping("/constsectoresEtv/{bandera}/{NOMBRE_SECTOR}/{ID_ZONA}/{CD_CNSCTIVO}")
    public List<TSectoresEtvEntity> ConsultaSectoresEtv(
            @PathVariable Integer bandera,
            @PathVariable String NOMBRE_SECTOR,
            @PathVariable Integer ID_ZONA,
            @PathVariable Integer CD_CNSCTIVO) {
        return serviceTSectoresEtvService.ConsultaSectoresEtv(bandera, NOMBRE_SECTOR, ID_ZONA, CD_CNSCTIVO);
    }
    
    @PostMapping("/consczonassector/{Bandera}/{id}/{cd_mncpio}/{cd_dpto}")
    public List<CZonasSectorEntity> ConsultaCZonasSector(
            @RequestBody CZonasSectorEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable Integer id,
            @PathVariable Integer cd_mncpio,
            @PathVariable Integer cd_dpto) {
        return serviceCZonasSectorService.ConsultaCZonasSector(entidad, Bandera, id, cd_mncpio, cd_dpto);
    }
    
    @GetMapping("/constmoddatosbasicos/{Bandera}")
    public List<TModDatosBasicEntity> ConsultaTModuloDatBasicos(
            @PathVariable Integer Bandera) {
        return serviceTModDatosBasicService.ConsultaTModuloDatBasicos(Bandera);
    }
    
    @GetMapping("/constdatosbasicos/{Bandera}/{IdModulo}")
    public List<TDatosBasicosEntity> ConsultaTranzEstOferta(
            @PathVariable Integer Bandera,
            @PathVariable Integer IdModulo) {
        return serviceTDatosBasicosService.ConsultaTDatosBasic(Bandera, IdModulo);
    }
    
    @PostMapping("/conscdatosbasicositem/{Bandera}/{IdDatoBasico}")
    public List<CDatBasicSubItemEntity> ConsultaCDatBasicSubItem(
            @RequestBody CDatBasicSubItemEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable Integer IdDatoBasico) {
        return serviceCDatBasicSubItemService.ConsultaCDatBasicSubItem(entidad, Bandera, IdDatoBasico);
    }
    
    @GetMapping("/conscmascaradatbasic/{Bandera}/{IdDtoBasico}")
    public List<CMascaraDatBasicEntity> consultaCMascaraDatBasic(
            @PathVariable Integer Bandera,
            @PathVariable Integer IdDtoBasico) {
        return serviceCMascaraDatBasicService.consultaCMascaraDatBasic(Bandera, IdDtoBasico);
    }
    
    @PostMapping("/modcdatosbasicossubitem/{Bandera}")
    public String ModCDatosBasicosSubItem(
            @RequestBody CDatosBasicosSubItemModEntity entidad,
            @PathVariable Integer Bandera) {
        return serviceCDatosBasicosSubItemModService.ModCDatosBasicosSubItem(entidad, Bandera);
    }
    
    @GetMapping("/conscrelaciondatosbasicos/{Bandera}/{IdDtoBasico}")
    public List<CRelacionDatosBasicosEntity> ConsultaCRelacionDatosBasicos(
            @PathVariable Integer Bandera,
            @PathVariable Integer IdDtoBasico) {
        return serviceCRelacionDatosBasicoService.ConsultaCRelacionDatosBasicos(Bandera, IdDtoBasico);
    }
    
    @GetMapping("/conscrelaciondbasicossubitem/{Bandera}/{IdDtoBasico}/{IdDtoRelacion}/{IdSubitem}")
    public List<CRelacionDBasicosSubItemEntity> ConsultaCRelacionDBasicosSubItem(
            @PathVariable Integer Bandera,
            @PathVariable Integer IdDtoBasico,
            @PathVariable Integer IdDtoRelacion,
            @PathVariable Integer IdSubitem) {
        return serviceCRelacionDBasicosSubItemService.ConsultaCRelacionDBasicosSubItem(Bandera, IdDtoBasico, IdDtoRelacion, IdSubitem);
    }
    
    @PostMapping("/modrelaciondbasicossubitems/{Bandera}")
    public String ModCRelacionDBasicosSubItems(
            @RequestBody CRelacionDBasicosSubItemsModEntity entidad,
            @PathVariable Integer Bandera) {
        return serviceCRelacionDBasicosSubItemsModService.ModCRelacionDBasicosSubItems(entidad, Bandera);
    }
    
    @GetMapping("/consccarrocompras/{Bandera}/{Usucodig}/{ID_CARRO}")
    public List<CCarroComprasEntity> ConsultaCCarroCompra(
            @PathVariable Integer Bandera,
            @PathVariable Integer Usucodig,
            @PathVariable Integer ID_CARRO) {
        return serviceCCarroCompraService.ConsultaCCarroCompra(Bandera, Usucodig, ID_CARRO);
    }
    
    @PostMapping("/modccarrocompras/{Bandera}")
    public String modCCarroCompras(
            @RequestBody CCarroComprasModEntity entidad,
            @PathVariable Integer Bandera) {
        return serviceCCarroComprasModService.modCCarroCompras(entidad, Bandera);
    }
    
    @PostMapping("/modcundcarro/{Bandera}")
    public String ModCUndCarro(
            @RequestBody CundCarroModEntity entidad,
            @PathVariable Integer Bandera) {
        return serviceCundCarroModService.ModCUndCarro(entidad, Bandera);
    }
    
    @PostMapping("/modagrocomprasusu/{Bandera}")
    public String ModAgroComprasUsu(
            @RequestBody AgroCompraUsuModEntity entidad,
            @PathVariable Integer Bandera) {
        return serviceAgroCompraUsuModService.ModAgroComprasUsu(entidad, Bandera);
    }
    
    @GetMapping("/conschistorialcompras/{Bandera}/{Usucodig}/{ID_CARRO}")
    public List<CHistorialComprasEntity> ConsultaCHistorialCompra(
            @PathVariable Integer Bandera,
            @PathVariable Integer Usucodig,
            @PathVariable Integer ID_CARRO) {
        return serviceCHistorialCompraService.ConsultaCHistorialCompra(Bandera, Usucodig, ID_CARRO);
    }
    
    @GetMapping("/conscvalidaususector/{Bandera}/{IdSector}")
    public String ConsultaCValidaUsuSector(
            @PathVariable Integer Bandera,
            @PathVariable Integer IdSector) {
        return serviceCvalidaUsuSectorService.ConsultaCValidaUsuSector(Bandera, IdSector);
    }
    
    @GetMapping("/conscvalidasectorusuario/{Bandera}/{IdUsuario}")
    public String ConsultaCValidaSectorUsuario(
            @PathVariable Integer Bandera,
            @PathVariable Integer IdUsuario) {
        return serviceCValidaSectorUsuarioService.ConsultaCValidaSectorUsuario(Bandera, IdUsuario);
    }
    
    @GetMapping("/conscnumususector/{Bandera}/{IdSector}")
    public String ConsultaNumUsuSector(
            @PathVariable Integer Bandera,
            @PathVariable Integer IdSector) {
        return serviceCNumUsuSectorService.ConsultaNumUsuSector(Bandera, IdSector);
    }
    
    @GetMapping("/conscnuevasofertasvdos/{Bandera}/{Usucodig}/{Cd_cnctvo}/{Id_Sector}")
    public List<CNuevasOfertasVdosEntity> ConsultaCNuevasOfertasVdo(
            @PathVariable Integer Bandera,
            @PathVariable Integer Usucodig,
            @PathVariable Integer Cd_cnctvo,
            @PathVariable Integer Id_Sector) {
        return serviceCNuevasOfertasVdoService.ConsultaCNuevasOfertasVdo(Bandera, Usucodig, Cd_cnctvo, Id_Sector);
    }
    
    @GetMapping("/clink/{Bandera}")
    public List<C_LinkEntity> LinkAcortado(
            @PathVariable Integer Bandera) {
        return serviceC_LinkService.LinkAcortado(Bandera);
    }
    
    @GetMapping("/urlshortner")
    public String ConsultaUrlShortner(
            @RequestBody UrlShortnerEntity entidad) {
        return serviceUrlShortnerService.ConsultaUrlShortner(entidad);
    }
    
    @GetMapping("/correosmasivospanda/{bandera}/{IdPlantilla}/{IdTipoUsuario}/{cd_cnctvo}/{IdSector}")
    public String ConsCorreosMasivosPanda(
            @PathVariable Integer bandera,
            @PathVariable Integer IdPlantilla,
            @PathVariable Integer IdTipoUsuario,
            @PathVariable Integer cd_cnctvo,
            @PathVariable Integer IdSector) {
        return serviceCorreosMasivosPandaService.ConsCorreosMasivosPanda(bandera, IdPlantilla, IdTipoUsuario, cd_cnctvo, IdSector);
    }
    
    @GetMapping("/correoindvalenvio/{bandera}/{IdPlantilla}/{usucodig}/{Cd_cnctvo}/{Id_Clnte}/{IdSctor}")
    public String EnvioCorreoIndividual(
            @PathVariable Integer bandera,
            @PathVariable Integer IdPlantilla,
            @PathVariable Integer usucodig,
            @PathVariable Integer Cd_cnctvo,
            @PathVariable Integer Id_Clnte,
            @PathVariable Integer IdSctor) {
        return serviceCorreoIndividualService.CorreoIndividualEnvio(bandera, IdPlantilla, usucodig, Cd_cnctvo, Id_Clnte, IdSctor);
    }
    
    @PostMapping("/actualizalinkcarro/{Bandera}/{IdGrupo}")
    public String ActualizaLinkCarro(
            @RequestBody CCarroLinkModEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable Integer IdGrupo) {
        return serviceCCarroLinkModService.ActualizaLinkCarro(entidad, Bandera, IdGrupo);
    }
    
    @PostMapping("/enviosmsitcloud")
    public String EnvioSmsItCloud(
            @RequestBody SmsItCloudEntity entidad) {
        return serviceSmsItCloudService.EnvioSmsItCloud(entidad);
    }
    
    @PostMapping("/TextosOferta/{Bandera}")
    public String TectosOferta(
            @RequestBody pa_CTextosOfertaEntity entidad,
            @PathVariable Integer Bandera) {
        return servicepa_CTextosOfertaService.TextOfer(entidad, Bandera);
    }
    
    @GetMapping("/constextosoferta/{Bandera}/{idSector}/{cd_cnctivo}")
    public List<pa_CTextosOfertaConsultaEntity> constextofer(
            @PathVariable Integer Bandera,
            @PathVariable Integer idSector,
            @PathVariable Integer cd_cnctivo) {
        return servicepa_CTextosOfertaConsultaService.ConsTextyOfer(Bandera, idSector, cd_cnctivo);
    }
    
    @PostMapping("/correoManualMod/{Bandera}")
    public String CorreoManual(
            @RequestBody CcorreoManualModEntity entidad,
            @PathVariable Integer Bandera) {
        return serviceCcorreoManualModService.ModCCorreoManual(entidad, Bandera);
    }
    
    @GetMapping("/CcorreoManual/{Bandera}/{IdEnvio}/{IdSector}/{Cd_cnctivo}/{IdPlantilla}/{IdEstado}/{fecha}")
    public List<CcorreoManualEntity> ConsCorreoMnual(
            @PathVariable Integer Bandera,
            @PathVariable Integer IdEnvio,
            @PathVariable Integer IdSector,
            @PathVariable Integer Cd_cnctivo,
            @PathVariable Integer IdPlantilla,
            @PathVariable Integer IdEstado,
            @PathVariable String fecha) {
        return serviceCcorreoManualService.ConsultaCorreos(Bandera, IdEnvio, IdSector, Cd_cnctivo, IdPlantilla, IdEstado, fecha);
    }
    
    @GetMapping("/consusucorreo/{Bandera}/{TipoPersona}/{Correopersona}/{NombrePersona}")
    public List<CusuariosCorreoEntity> ConsUserCorr(
            @PathVariable Integer Bandera,
            @PathVariable Integer TipoPersona,
            @PathVariable String Correopersona,
            @PathVariable String NombrePersona) {
        return serviceCusuariosCorreoService.ConsCooreos(Bandera, TipoPersona, Correopersona, NombrePersona);
    }
    
    @PostMapping("/ConsGenQuery/{Bandera}")
    public String ConsGenQuery(
            @RequestBody CGeneracionQueryEntity entidad,
            @PathVariable Integer Bandera) {
        return serviceCGeneracionQueryService.ConsQuery(entidad, Bandera);
    }
    
    @PostMapping("/modclinks/{BANDERA}")
    public String ModCLinks(
            @RequestBody CLinksModEntity entidad,
            @PathVariable Integer BANDERA) {
        return serviceCLinksModService.ModCLinks(entidad, BANDERA);
    }
    
    @GetMapping("/consclinkconsulta/{bandera}/{CD_HEXA}")
    public List<CLinkConsultaEntity> ConsCLinkConsulta(
            @PathVariable Integer bandera,
            @PathVariable String CD_HEXA) {
        return serviceCLinkConsultaService.ConsCLinkConsulta(bandera, CD_HEXA);
    }
    
    @GetMapping("/consthorariotarea/{Bandera}")
    public List<THoraioTareaEntity> ConsultaTHorarioTarea(
            @PathVariable Integer Bandera) {
        return serviceTHoraioTareaService.ConsultaTHorarioTarea(Bandera);
    }
    
    @GetMapping("/constipoblicorreosmanual/{Bandera}/{IdPlantilla}")
    public List<TipObliCorreoManualEntity> ConsultaObliCorreoMan(
            @PathVariable Integer Bandera,
            @PathVariable Integer IdPlantilla) {
        return serviceTipObliCorreoManualService.ConsultaObliCorreoMan(Bandera, IdPlantilla);
    }
    
    @PostMapping("/modtipoblicorreomanual/{Bandera}")
    public String ModCorreoManual(
            @RequestBody TipObliCrroManModEntity entidad,
            @PathVariable Integer Bandera) {
        return serviceTipObliCrroManModService.ModCorreoManual(entidad, Bandera);
    }
    
    @GetMapping("/consclinksector/{bandera}/{CD_CNSCTVO}/{IDSECTOR}")
    public List<CLinkSectorEntity> ConsCLinkSector(
            @PathVariable Integer bandera,
            @PathVariable Integer CD_CNSCTVO,
            @PathVariable Integer IDSECTOR) {
        return serviceCLinkSectorService.ConsCLinkSector(bandera, CD_CNSCTVO, IDSECTOR);
    }
    
    @PostMapping("/modcrelacionliderpart/{Bandera}")
    public String ModRelacionLiderPart(
            @RequestBody CRelacionLiderPartiModEntity entidad,
            @PathVariable Integer Bandera) {
        return serviceCRelacionLiderPartiModService.ModRelacionLiderPart(entidad, Bandera);
    }
    
    @GetMapping("/consrelacionliderpart/{Bandera}/{IdCarroLider}")
    public List<CRelacionLiderPartiEntity> ConsRelacionLiderPart(
            @PathVariable Integer Bandera,
            @PathVariable Integer IdCarroLider) {
        return serviceCRelacionLiderPartiService.ConsRelacionLiderPart(Bandera, IdCarroLider);
    }
    
    @GetMapping("/conscpagoslider/{Bandera}/{IdCarro}")
    public List<CpagosLiderEntity> ConsPagosLider(
            @PathVariable Integer Bandera,
            @PathVariable Integer IdCarro) {
        return serviceCpagosLiderService.ConsPagosLider(Bandera, IdCarro);
    }
    
    @PostMapping("/modclinkspyg/{BANDERA}")
    public String ModCLinksCPyG(
            @RequestBody CLinksCPyGModEntity entidad,
            @PathVariable Integer BANDERA) {
        return serviceCLinksCPyGModService.ModCLinksCPyG(entidad, BANDERA);
    }
    
    @PostMapping("/ChatGPTservice")
    public String ChatGPTCons(
            @RequestBody ChatGPTentity entidad) {
        return serviceChatGPTservice.ChatGPTCons(entidad);
    }
    
    @GetMapping("/ImagesApi")
    public String ConsultaImagenes() {
        return serviceImagesApiService.ConsultaImagenes();
    }
    
    @GetMapping("/constbodegas/{Bandera}/{IdDepa}/{IdCiudad}")
    public List<TBodegasEntity> ConsultaTBodega(
            @PathVariable Integer Bandera,
            @PathVariable Integer IdDepa,
            @PathVariable Integer IdCiudad) {
        return serviceTBodegaService.ConsultaTBodega(Bandera, IdDepa, IdCiudad);
    }
    
    @GetMapping("/conscdescargastrans/{Bandera}/{cd_cnctvo}")
    public List<CdescargasTransEntity> ConsultaCDescargasTrans(
            @PathVariable Integer Bandera,
            @PathVariable Integer cd_cnctvo) {
        return serviceCdescargasTranService.ConsultaCDescargasTrans(Bandera, cd_cnctvo);
    }
    
    @PostMapping("/modcasignabodega/{Bandera}")
    public String ModCAsignaBodega(
            @RequestBody CAsignaBodegaModEntity entidad,
            @PathVariable Integer Bandera) {
        return serviceCAsignaBodegaModService.ModCAsignaBodega(entidad, Bandera);
    }
    
    @GetMapping("/conscdtlledescargas/{bandera}/{IdSecto}/{Cd_cnsctivo}/{IdBodega}")
    public List<CDtlleDescargasEntity> ConsultaCDtlleDescarga(
            @PathVariable Integer bandera,
            @PathVariable Integer IdSecto,
            @PathVariable Integer Cd_cnsctivo,
            @PathVariable Integer IdBodega) {
        return serviceCDtlleDescargaService.ConsultaCDtlleDescarga(bandera, IdSecto, Cd_cnsctivo, IdBodega);
    }
    
    @PostMapping("/modcdtlledescargas/{bandera}")
    public String ModCDtlleDescargas(
            @RequestBody CDtlleDescargasModEntity entidad,
            @PathVariable Integer bandera) {
        return serviceCDtlleDescargasModService.ModCDtlleDescargas(entidad, bandera);
    }
    
    @GetMapping("/conscinfoferta/{bandera}/{CD_CNSCTVO}/{Id_sector}")
    public List<CInfoOfertaEntity> ConsultaInfoOferta(
            @PathVariable Integer bandera,
            @PathVariable Integer CD_CNSCTVO,
            @PathVariable Integer Id_sector) {
        return serviceCInfoOfertaService.ConsultaInfoOferta(bandera, CD_CNSCTVO, Id_sector);
    }
    
    @GetMapping("/conscofertaestados/{bandera}")
    public List<COfertaEstadosEntity> consultaCOgertaEstados(
            @PathVariable Integer bandera) {
        return serviceCOfertaEstadosService.consultaCOgertaEstados(bandera);
    }
    
    @PostMapping("/modcultimmillainicial/{Bandera}")
    public String ModCUltimMillaIni(
            @RequestBody CUltimaMillaInicialEntity entidad,
            @PathVariable Integer Bandera) {
        return serviceCUltimaMillaInicialService.ModCUltimMillaIni(entidad, Bandera);
    }
    
    @GetMapping("/conscpinultimailla/{Bandera}/{cd_cnctvo}/{idSector}")
    public List<CPinUltimaMillaEntity> consultaCPinUltiMilla(
            @PathVariable Integer Bandera,
            @PathVariable Integer cd_cnctvo,
            @PathVariable Integer idSector) {
        return serviceCPinUltimaMillaService.consultaCPinUltiMilla(Bandera, cd_cnctvo, idSector);
    }
    
    @PostMapping("/modcgrupomilla/{Bandera}")
    public String ModCGrupoMilla(
            @RequestBody CGrupoMillaModEntity entidad,
            @PathVariable Integer Bandera) {
        return serviceCGrupoMillaModService.ModCGrupoMilla(entidad, Bandera);
    }
    
    @PostMapping("/modcpinmilla/{Bandera}")
    public String ModCPinMilla(
            @RequestBody CPinMillaModEntity entidad,
            @PathVariable Integer Bandera) {
        return serviceCPinMillaModService.ModCPinMilla(entidad, Bandera);
    }
    
    @GetMapping("/conscultimamilla/{Bandera}/{cd_cnsctvo}/{id_sector}")
    public List<CultimMillaEntity> ConsultaCuLtMilla(
            @PathVariable Integer Bandera,
            @PathVariable Integer cd_cnsctvo,
            @PathVariable Integer id_sector) {
        return serviceCultimMillaService.ConsultaCuLtMilla(Bandera, cd_cnsctvo, id_sector);
    }
    
    @GetMapping("/conscagrogruposultimamilla/{Bandera}/{idGrupo}/{cd_cnsctivo}/{IdSector}")
    public List<CAgro_GruposUltimaMillaEntity> ConsultaGrupoUltMilla(
            @PathVariable Integer Bandera,
            @PathVariable Integer idGrupo,
            @PathVariable Integer cd_cnsctivo,
            @PathVariable Integer IdSector) {
        return serviceCAgGruposUltimaMillaService.ConsultaGrupoUltMilla(Bandera, idGrupo, cd_cnsctivo, IdSector);
    }
    
    @PostMapping("/modcvaloruberoferta/{Bandera}")
    public String ModCValorUberOfert(
            @RequestBody CValorUbersOfertaModEntity entidad,
            @PathVariable Integer Bandera) {
        return serviceCValorUbersOfertaModService.ModCValorUberOfert(entidad, Bandera);
    }
    
    @GetMapping("/conscvalorubersgen/{Bandera}/{IdeDepto}/{IdCiudad}")
    public List<CValorUbersGeneralEntity> consultaCValorUbersGen(
            @PathVariable Integer Bandera,
            @PathVariable Integer IdeDepto,
            @PathVariable Integer IdCiudad) {
        return serviceCValorUbersGeneralService.consultaCValorUbersGen(Bandera, IdeDepto, IdCiudad);
    }
    
    @GetMapping("/consclistaconductor/{Bandera}/{cd_cnsctivo}/{idSector}")
    public List<CListaConductorEntity> ConsultaCListaConductor(
            @PathVariable Integer Bandera,
            @PathVariable Integer cd_cnsctivo,
            @PathVariable Integer idSector) {
        return serviceCListaConductorService.ConsultaCListaConductor(Bandera, cd_cnsctivo, idSector);
    }
    
    @PostMapping("/modctorultmilla/{Bandera}")
    public String ModCtorUltMilla(
            @RequestBody CtorUltMillaModEntity entidad,
            @PathVariable Integer Bandera) {
        return serviceCtorUltMillaModService.ModCtorUltMilla(entidad, Bandera);
    }
    
    @PostMapping("/conscreporteofertas/{Bandera}/{cd_cnscutivo}/{Id_Estado_oferta}/{cd_producto}")
    public List<CReporteOfertasEntity> CosnultaCReportOferta(
            @RequestBody CReporteOfertasEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable Integer cd_cnscutivo,
            @PathVariable Integer Id_Estado_oferta,
            @PathVariable Integer cd_producto) {
        return serviceCReporteOfertaService.CosnultaCReportOferta(entidad, Bandera, cd_cnscutivo, Id_Estado_oferta, cd_producto);
    }
    
    @PostMapping("/modcarrolinkgrupo/{Bandera}")
    public String ModCarroLinkgrp(
            @RequestBody CcarrroLinkGrupoEntity entidad,
            @PathVariable Integer Bandera) {
        return serviceCcarrroLinkGrupoService.ModCarroLinkgrp(entidad, Bandera);
    }
    
    @PostMapping("/conscalcsimuladorpagosclnte/{Bandera}/{Operacion}/{Formato}/{Cd_Cnsctvo}/{Id_Sector}/{Unidades}/{Usucodig}/{CodGrupo}/{undParti}")
    public List<CalcSidorPgsClintEntity> consCalSimuladorCliente(
            @RequestBody CalcSidorPgsClintEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable Integer Operacion,
            @PathVariable Integer Formato,
            @PathVariable Integer Cd_Cnsctvo,
            @PathVariable Integer Id_Sector,
            @PathVariable Integer Unidades,
            @PathVariable Integer Usucodig,
            @PathVariable String CodGrupo,
            @PathVariable Integer undParti) {
        return serviceCalcSidorPgsClintService.consCalSimuladorCliente(entidad, Bandera, Operacion, Formato, Cd_Cnsctvo, Id_Sector, Unidades, Usucodig, CodGrupo, undParti);
    }
    
    @GetMapping("/conscnuevostransapp/{Bandera}/{UsucodigTrans}")
    public List<CNuevosTransAppEntity> consultaCNewTransApp(
            @PathVariable Integer Bandera,
            @PathVariable Integer UsucodigTrans) {
        return serviceCNuevosTransAppService.consultaCNewTransApp(Bandera, UsucodigTrans);
    }
    
    @GetMapping("/conscdetallenewtransapp/{Bandera}/{Cd_cnsctvo}/{Id_grupo}")
    public List<CDetalleNuevosTransAppEntity> consultaCdtlleNewTransApp(
            @PathVariable Integer Bandera,
            @PathVariable Integer Cd_cnsctvo,
            @PathVariable Integer Id_grupo) {
        return serviceCDetalleNuevosTransAppService.consultaCdtlleNewTransApp(Bandera, Cd_cnsctvo, Id_grupo);
    }
    
    @GetMapping("/consconductorestransnewmilla/{Bandera}/{usucodigTrans}/{IdGrupo}")
    public List<CondrsTransNMillaEntity> consultaCondrsTransNMilla(
            @PathVariable Integer Bandera,
            @PathVariable Integer usucodigTrans,
            @PathVariable Integer IdGrupo) {
        return serviceCondrsTransNMillaService.consultaCondrsTransNMilla(Bandera, usucodigTrans, IdGrupo);
    }
    
    @GetMapping("/conscdetalleapp/{Bandera}/{usucodigTrans}/{cd_cnsctivo}/{Sector}")
    public List<CdetalleAppEntity> ConsultaDetalleApp(
            @PathVariable Integer Bandera,
            @PathVariable Integer usucodigTrans,
            @PathVariable Integer cd_cnsctivo,
            @PathVariable Integer Sector) {
        return serviceCdetalleAppService.ConsultaDetalleApp(Bandera, usucodigTrans, cd_cnsctivo, Sector);
    }
}
