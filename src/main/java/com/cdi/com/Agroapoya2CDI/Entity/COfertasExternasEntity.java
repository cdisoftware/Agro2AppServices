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
            name = "paC_OfertasExternas",
            procedureName = "paC_OfertasExternas",
            resultClasses = COfertasExternasEntity.class)
})
public class COfertasExternasEntity {

    @Id
    @JsonProperty("id")
    public Integer id;

    @JsonProperty("imagenOferta")
    public String imagenOferta;

    @JsonProperty("cd_cnsctvo")
    public Integer cd_cnsctvo;

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
    public Integer NumGrupos;

    @JsonProperty("PersonasXGrupo")
    public Integer PersonasXGrupo;

    @JsonProperty("PorcentajeDescLider")
    public Integer PorcentajeDescLider;

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

    @JsonProperty("CRCTRZCION")
    public String CRCTRZCION;

    @JsonProperty("ImagenMapaSector")
    public String ImagenMapaSector;

    @JsonProperty("valorReferenciaProd")
    public String valorReferenciaProd;

    @JsonProperty("PerSetor")
    public Integer PerSetor;

    @JsonProperty("vgncia_hastaFormato")
    public String vgncia_hastaFormato;
}
