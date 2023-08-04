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
            name = "paC_infoOfertaGrupo",
            procedureName = "paC_infoOfertaGrupo",
            resultClasses = CinfoOfertaGrupoEntity.class)
})
public class CinfoOfertaGrupoEntity {

    @Id
    @JsonProperty("USUCODIG")
    public Integer USUCODIG;

    @JsonProperty("NombreLider")
    public String NombreLider;

    @JsonProperty("DireccionEntrega")
    public String DireccionEntrega;

    @JsonProperty("TelefonoPersona")
    public String TelefonoPersona;

    @JsonProperty("Producto")
    public String Producto;

    @JsonProperty("Tamano")
    public String Tamano;

    @JsonProperty("CondicionEntrega")
    public String CondicionEntrega;

    @JsonProperty("Empaque")
    public String Empaque;

    @JsonProperty("CRCTRZCION")
    public String CRCTRZCION;

    @JsonProperty("ValorUnid")
    public String ValorUnid;

    @JsonProperty("DescuentoUnid")
    public String DescuentoUnid;

    @JsonProperty("codigo_Mostrar")
    public String codigo_Mostrar;

}
