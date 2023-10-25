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
            name = "Pac_ListaProductos",
            procedureName = "Pac_ListaProductos",
            resultClasses = CListaProductosEntity.class)
})
public class CListaProductosEntity {

    @Id
    @JsonProperty("CD_PRDCTO")
    public Integer CD_PRDCTO;

    @JsonProperty("DSCRPCION")
    public String DSCRPCION;

    @JsonProperty("PRFJO")
    public String PRFJO;

    @JsonProperty("CD_ESTADO")
    public Integer CD_ESTADO;

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
}
