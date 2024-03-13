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
            name = "pac_RelacionProdToppingMod",
            procedureName = "pac_RelacionProdToppingMod",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})

public class cRelacionProdToppingModEntity {

    @Id
    @JsonProperty("IdTopping")
    public Integer IdTopping;

    @JsonProperty("IdRelacion")
    public Integer IdRelacion;

    @JsonProperty("Presentacion")
    public String Presentacion;

    @JsonProperty("ValorReal")
    public Integer ValorReal;

    @JsonProperty("ValorReferencia")
    public Integer ValorReferencia;

    @JsonProperty("UnidadesOferta")
    public Integer UnidadesOferta;

    @JsonProperty("MximoUnidades")
    public Integer MximoUnidades;

    @JsonProperty("PesoUnidad")
    public String PesoUnidad;

    @JsonProperty("Id_Sector")
    public Integer Id_Sector;

    @JsonProperty("UnidadesPeso")
    public Integer UnidadesPeso;

    @JsonProperty("DefectoUnidadesPeso")
    public Integer DefectoUnidadesPeso;

}
