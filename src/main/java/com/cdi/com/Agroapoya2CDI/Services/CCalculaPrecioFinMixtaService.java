package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CCalculaPrecioFinMixtaEntity;
import java.util.List;

public interface CCalculaPrecioFinMixtaService {

    public List<CCalculaPrecioFinMixtaEntity> ConsultaCalcPrecioFinMixta(Integer BANDERA, Integer CD_CNSCTVO, Integer ID_SCTOR_OFRTA,
            Integer tpo_cmsion_indvdual, Integer vlor_cmsion_indvdual, Integer tpo_cmsion_grupal, Integer vlor_cmsion_grupal, Integer vlor_dmcilio_indvdual,
            Integer vlor_dmcilio_grupal, Integer mnmo_prsnas_xgrupo);
}
