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
            name = "paC_ReporteOfertas",
            procedureName = "paC_ReporteOfertas",
            resultClasses = CReporteOfertasEntity.class)
})
public class CReporteOfertasEntity {

    @Id
    @JsonProperty("ID")
    public Integer ID;
    
    @JsonProperty("CODIGO_OFERTA")
    public Integer CODIGO_OFERTA;

    @JsonProperty("ESTADO_OFERTA")
    public String ESTADO_OFERTA;

    @JsonProperty("Productor")
    public String Productor;

    @JsonProperty("Producto")
    public String Producto;

    @JsonProperty("Condicion_Entrega")
    public String Condicion_Entrega;

    @JsonProperty("Tamano")
    public String Tamano;

    @JsonProperty("Empaque")
    public String Empaque;

    @JsonProperty("Unidades")
    public String Unidades;

    @JsonProperty("Valor_Unidad_productor")
    public String Valor_Unidad_productor;

    @JsonProperty("Valor_Total_Oferta")
    public String Valor_Total_Oferta;

    @JsonProperty("SECTOR")
    public String SECTOR;

    @JsonProperty("VIGENCIA_DESDE")
    public String VIGENCIA_DESDE;

    @JsonProperty("VIGENCIA_HASTA")
    public String VIGENCIA_HASTA;

    @JsonProperty("FECHA_RECOGIDA")
    public String FECHA_RECOGIDA;

    @JsonProperty("FECHA_ENTREGA")
    public String FECHA_ENTREGA;

    @JsonProperty("TIPO_OFERTA")
    public String TIPO_OFERTA;

    @JsonProperty("Tipo_comisión_individual")
    public String Tipo_comisión_individual;

    @JsonProperty("vlor_cmsion_indvdual")
    public String vlor_cmsion_indvdual;

    @JsonProperty("vlor_domicilio_indvdual")
    public String vlor_domicilio_indvdual;

    @JsonProperty("vlor_fnal_indvdual")
    public String vlor_fnal_indvdual;

    @JsonProperty("Tipo_comisión_grupal")
    public String Tipo_comisión_grupal;

    @JsonProperty("vlor_cmsion_grpal")
    public String vlor_cmsion_grpal;

    @JsonProperty("Porcentaje_descuento_lider")
    public String Porcentaje_descuento_lider;

    @JsonProperty("valor_domicilio_grupal")
    public String valor_domicilio_grupal;

    @JsonProperty("cantidad_grupos")
    public String cantidad_grupos;

    @JsonProperty("maximo_personas_grupo")
    public String maximo_personas_grupo;

    @JsonProperty("valor_arranque_lider")
    public String valor_arranque_lider;

    @JsonProperty("vlor_final_participante")
    public String vlor_final_participante;

    @JsonProperty("tipo_descuento_grupal")
    public String tipo_descuento_grupal;

    @JsonProperty("PRODUCTOS_ADICIONALES")
    public String PRODUCTOS_ADICIONALES;

}
