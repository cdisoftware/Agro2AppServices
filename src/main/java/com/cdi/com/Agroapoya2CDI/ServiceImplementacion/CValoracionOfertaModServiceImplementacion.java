package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CValoracionOfertaModEntity;
import com.cdi.com.Agroapoya2CDI.Services.CValoracionOfertaModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CValoracionOfertaModServiceImplementacion implements CValoracionOfertaModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String CValoracionOfertaMod(CValoracionOfertaModEntity entidad, Integer BANDERA) {
        try {
            StoredProcedureQuery modval = repositorio.createNamedStoredProcedureQuery("paCValoracionOfertaMod");
            modval.registerStoredProcedureParameter("BANDERA", Integer.class, ParameterMode.IN);
            modval.registerStoredProcedureParameter("CD_CNSCTVO", Integer.class, ParameterMode.IN);
            modval.registerStoredProcedureParameter("TPO_OFRTA", Integer.class, ParameterMode.IN);
            modval.registerStoredProcedureParameter("TPO_CMSION_INDVDUAL", Integer.class, ParameterMode.IN);
            modval.registerStoredProcedureParameter("VLOR_CMSION_INDVDUAL", String.class, ParameterMode.IN);
            modval.registerStoredProcedureParameter("MNMO_UNDDES_INDVDUAL", String.class, ParameterMode.IN);
            modval.registerStoredProcedureParameter("MXMO_UNDDES_INDVDUAL", String.class, ParameterMode.IN);
            modval.registerStoredProcedureParameter("VLOR_DMNCLIO_INDVDUAL", String.class, ParameterMode.IN);
            modval.registerStoredProcedureParameter("VLOR_FNAL_INDVDUAL", String.class, ParameterMode.IN);
            modval.registerStoredProcedureParameter("TPO_CMSION_GRPAL", String.class, ParameterMode.IN);
            modval.registerStoredProcedureParameter("VLOR_CMSION_GRPAL", String.class, ParameterMode.IN);
            modval.registerStoredProcedureParameter("MNMO_UNDDES_LIDER", String.class, ParameterMode.IN);
            modval.registerStoredProcedureParameter("MXMO_UNDDES_LIDER", String.class, ParameterMode.IN);
            modval.registerStoredProcedureParameter("PRCNTJE_DCTO_LIDER", String.class, ParameterMode.IN);
            modval.registerStoredProcedureParameter("VLOR_DMNCLIO_GRPAL", String.class, ParameterMode.IN);
            modval.registerStoredProcedureParameter("CNTDAD_GRPOS", String.class, ParameterMode.IN);
            modval.registerStoredProcedureParameter("MNMO_PRSNAS_XGRUPO", String.class, ParameterMode.IN);
            modval.registerStoredProcedureParameter("MNMO_UNDDES_PRCPNTE", String.class, ParameterMode.IN);
            modval.registerStoredProcedureParameter("MXMO_UNDDES_PRCPNTE", String.class, ParameterMode.IN);
            modval.registerStoredProcedureParameter("CNTDAD_CMPRAS_INDVDLES", String.class, ParameterMode.IN);
            modval.registerStoredProcedureParameter("VLOR_ARRNQUE_LIDER", String.class, ParameterMode.IN);
            modval.registerStoredProcedureParameter("VLOR_FNAL_PRTCPNTE", String.class, ParameterMode.IN);
            modval.registerStoredProcedureParameter("ID_SCTOR_OFRTA", Integer.class, ParameterMode.IN);
            modval.registerStoredProcedureParameter("LINKLANDIGN", String.class, ParameterMode.IN);
            modval.registerStoredProcedureParameter("TPO_DESCUENTO", Integer.class, ParameterMode.IN);
            modval.registerStoredProcedureParameter("VALOR_REFERENCIA", Integer.class, ParameterMode.IN);
            modval.registerStoredProcedureParameter("TIPO_CUPON", Integer.class, ParameterMode.IN);
            modval.registerStoredProcedureParameter("DES_CUPONREGALO", String.class, ParameterMode.IN);
            modval.registerStoredProcedureParameter("IMG_CUPONREGALO", String.class, ParameterMode.IN);
            modval.registerStoredProcedureParameter("IDTIPODOMICILIO", Integer.class, ParameterMode.IN);
            modval.registerStoredProcedureParameter("VLORAPRTRDMCLIO", Integer.class, ParameterMode.IN);
            modval.registerStoredProcedureParameter("NumUsuaCupo", Integer.class, ParameterMode.IN);
            modval.registerStoredProcedureParameter("DirigidaRegiVent", Integer.class, ParameterMode.IN);

            modval.setParameter("BANDERA", BANDERA);
            modval.setParameter("CD_CNSCTVO", entidad.getCD_CNSCTVO());
            modval.setParameter("TPO_OFRTA", entidad.getTPO_OFRTA());
            modval.setParameter("TPO_CMSION_INDVDUAL", entidad.getTPO_CMSION_INDVDUAL());
            modval.setParameter("VLOR_CMSION_INDVDUAL", entidad.getVLOR_CMSION_INDVDUAL());
            modval.setParameter("MNMO_UNDDES_INDVDUAL", entidad.getMNMO_UNDDES_INDVDUAL());
            modval.setParameter("MXMO_UNDDES_INDVDUAL", entidad.getMXMO_UNDDES_INDVDUAL());
            modval.setParameter("VLOR_DMNCLIO_INDVDUAL", entidad.getVLOR_DMNCLIO_INDVDUAL());
            modval.setParameter("VLOR_FNAL_INDVDUAL", entidad.getVLOR_FNAL_INDVDUAL());
            modval.setParameter("TPO_CMSION_GRPAL", entidad.getTPO_CMSION_GRPAL());
            modval.setParameter("VLOR_CMSION_GRPAL", entidad.getVLOR_CMSION_GRPAL());
            modval.setParameter("MNMO_UNDDES_LIDER", entidad.getMNMO_UNDDES_LIDER());
            modval.setParameter("MXMO_UNDDES_LIDER", entidad.getMXMO_UNDDES_LIDER());
            modval.setParameter("PRCNTJE_DCTO_LIDER", entidad.getPRCNTJE_DCTO_LIDER());
            modval.setParameter("VLOR_DMNCLIO_GRPAL", entidad.getVLOR_DMNCLIO_GRPAL());
            modval.setParameter("CNTDAD_GRPOS", entidad.getCNTDAD_GRPOS());
            modval.setParameter("MNMO_PRSNAS_XGRUPO", entidad.getMNMO_PRSNAS_XGRUPO());
            modval.setParameter("MNMO_UNDDES_PRCPNTE", entidad.getMNMO_UNDDES_PRCPNTE());
            modval.setParameter("MXMO_UNDDES_PRCPNTE", entidad.getMXMO_UNDDES_PRCPNTE());
            modval.setParameter("CNTDAD_CMPRAS_INDVDLES", entidad.getCNTDAD_CMPRAS_INDVDLES());
            modval.setParameter("VLOR_ARRNQUE_LIDER", entidad.getVLOR_ARRNQUE_LIDER());
            modval.setParameter("VLOR_FNAL_PRTCPNTE", entidad.getVLOR_FNAL_PRTCPNTE());
            modval.setParameter("ID_SCTOR_OFRTA", entidad.getID_SCTOR_OFRTA());
            modval.setParameter("LINKLANDIGN", entidad.getLINKLANDIGN());
            modval.setParameter("TPO_DESCUENTO", entidad.getTPO_DESCUENTO());
            modval.setParameter("VALOR_REFERENCIA", entidad.getVALOR_REFERENCIA());
            modval.setParameter("TIPO_CUPON", entidad.getTIPO_CUPON());
            modval.setParameter("DES_CUPONREGALO", entidad.getDES_CUPONREGALO());
            modval.setParameter("IMG_CUPONREGALO", entidad.getIMG_CUPONREGALO());
            modval.setParameter("IDTIPODOMICILIO", entidad.getIDTIPODOMICILIO());
            modval.setParameter("VLORAPRTRDMCLIO", entidad.getVLORAPRTRDMCLIO());
            modval.setParameter("NumUsuaCupo", entidad.getNumUsuaCupo());
            modval.setParameter("DirigidaRegiVent", entidad.getDirigidaRegiVent());

            modval.execute();
            return JSONObject.quote((String) modval.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }

    }

}
