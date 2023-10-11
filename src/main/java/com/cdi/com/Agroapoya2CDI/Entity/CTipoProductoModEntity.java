package com.cdi.com.Agroapoya2CDI.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import lombok.Data;

@Entity
@Data
@NamedStoredProcedureQueries({
    @NamedStoredProcedureQuery(
            name = "paC_TipoProductoMod",
            procedureName = "paC_TipoProductoMod",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class CTipoProductoModEntity {

    @Id
    @JsonProperty("DSCRPCION")
    public String DSCRPCION;

    @JsonProperty("imagen")
    public String imagen;

    @JsonProperty("imagenDos")
    public String imagenDos;

    @JsonProperty("imagenTres")
    public String imagenTres;

    @JsonProperty("crctzcionCrta")
    public String crctzcionCrta;

    @JsonProperty("crctzcionLrga")
    public String crctzcionLrga;

    @JsonProperty("ESTADO")
    public Integer ESTADO;

    @JsonProperty("CD_PRDCTO")
    public Integer CD_PRDCTO;

    @JsonProperty("PREFIJO")
    public String PREFIJO;
}
