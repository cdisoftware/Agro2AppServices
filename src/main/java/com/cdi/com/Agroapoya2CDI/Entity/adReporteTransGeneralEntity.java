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
            name = "admin_ReporteTransGeneral",
            procedureName = "admin_ReporteTransGeneral",
            resultClasses = adReporteTransGeneralEntity.class)
})
public class adReporteTransGeneralEntity {

    @Id
    @JsonProperty("ID")
    public String ID;

    @JsonProperty("CD_PRDCTO")
    public String CD_PRDCTO;

    @JsonProperty("PRODUCTO")
    public String PRODUCTO;

    @JsonProperty("CANTIDAD_TOTAL")
    public Integer CANTIDAD_TOTAL;

    @JsonProperty("CANTIDAD_ENTREGADA")
    public Integer CANTIDAD_ENTREGADA;

    @JsonProperty("CANTIDAD_PENDIENTE")
    public Integer CANTIDAD_PENDIENTE;

    @JsonProperty("CANTIDAD_DEVUELTA")
    public Integer CANTIDAD_DEVUELTA;

    @JsonProperty("VLOR_TTL_RECAUDAR")
    public String VLOR_TTL_RECAUDAR;

    @JsonProperty("VLR_RECAUDADO")
    public String VLR_RECAUDADO;

    @JsonProperty("VLR_PENDIENTE_RECAUDO")
    public String VLR_PENDIENTE_RECAUDO;

    @JsonProperty("VLOR_DEVOLUCION")
    public String VLOR_DEVOLUCION;

    @JsonProperty("VLRRECAUDADOCONTRAENTREGA")
    public String VLRRECAUDADOCONTRAENTREGA;

    @JsonProperty("VLRRECAUDADOELECTRONICO")
    public String VLRRECAUDADOELECTRONICO;

    @JsonProperty("PesoProdUnidad")
    public String PesoProdUnidad;

    @JsonProperty("NombreProd")
    public String NombreProd;

    @JsonProperty("PesoProdTotal")
    public String PesoProdTotal;

    @JsonProperty("IdGrupo")
    public Integer IdGrupo;

}
