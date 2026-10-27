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
            name = "Ikon_ofertas",
            procedureName = "Ikon_ofertas",
            resultClasses = Ikon_ofertasEntity.class)
})
public class Ikon_ofertasEntity {

    @Id
    @JsonProperty("CD_CNSCTVO")
    public Integer CD_CNSCTVO;

    @JsonProperty("idSector")
    public String idSector;

    @JsonProperty("DescripcionSector")
    public String DescripcionSector;

    @JsonProperty("FechaInicio")
    public String FechaInicio;

    @JsonProperty("FechaFin")
    public String FechaFin;

    @JsonProperty("FechaEntregaProgramada")
    public String FechaEntregaProgramada;

    @JsonProperty("FechaEntregaReal")
    public String FechaEntregaReal;

    @JsonProperty("NumeroCompras")
    public String NumeroCompras;

}
