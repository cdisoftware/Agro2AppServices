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
            name = "movile_consultaEvidencia",
            procedureName = "movile_consultaEvidencia",
            resultClasses = mvconsultaEvidenciaEntity.class)
})
public class mvconsultaEvidenciaEntity {

    @Id
    @JsonProperty("id_evidencia")
    public Integer id_evidencia;

    @JsonProperty("id_conductor")
    public Integer id_conductor;

    @JsonProperty("id_factura")
    public Integer id_factura;

    @JsonProperty("estado_Entrega")
    public Integer estado_Entrega;

    @JsonProperty("descripcion")
    public String descripcion;

    @JsonProperty("imagen")
    public String imagen;

    @JsonProperty("Observacion")
    public String Observacion;

    @JsonProperty("ValorTotaPagar")
    public Integer ValorTotaPagar;
    
    @JsonProperty("ValorPagarSinDomicilio")
    public Integer ValorPagarSinDomicilio;
    
    @JsonProperty("ValorDomicilio")
    public Integer ValorDomicilio;
}
