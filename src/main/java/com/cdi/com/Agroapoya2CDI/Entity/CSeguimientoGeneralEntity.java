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
            name = "paC_SeguimientoGeneral",
            procedureName = "paC_SeguimientoGeneral",
            resultClasses = CSeguimientoGeneralEntity.class)
})
public class CSeguimientoGeneralEntity {

    @Id
    @JsonProperty("ID_CLNTE")
    public Integer ID_CLNTE;

    @JsonProperty("NombreCliente")
    public String NombreCliente;

    @JsonProperty("DrccionEntrega")
    public String DrccionEntrega;

    @JsonProperty("CoordenadasLLegada")
    public String CoordenadasLLegada;

    @JsonProperty("DSCRPCION")
    public String DSCRPCION;

    @JsonProperty("DSCRPCION_PRDCTO")
    public String DSCRPCION_PRDCTO;

    @JsonProperty("IdEstado")
    public Integer IdEstado;

    @JsonProperty("DescEstado")
    public String DescEstado;

    @JsonProperty("FechaEntrega")
    public String FechaEntrega;

    @JsonProperty("UltimaCoord")
    public String UltimaCoord;

    @JsonProperty("DondeEsta")
    public String DondeEsta;

    @JsonProperty("TiempoEntrega")
    public String TiempoEntrega;
}
