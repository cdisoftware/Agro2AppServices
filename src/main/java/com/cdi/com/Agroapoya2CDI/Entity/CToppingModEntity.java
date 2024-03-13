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
            name = "paC_ToppingMod",
            procedureName = "paC_ToppingMod",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class CToppingModEntity {

    @Id
    @JsonProperty("IdTopping")
    public Integer IdTopping;

    @JsonProperty("Id_Sector")
    public Integer Id_Sector;

    @JsonProperty("cd_cnctivo")
    public Integer cd_cnctivo;

    @JsonProperty("Descricpcion")
    public String Descricpcion;

    @JsonProperty("MaxCantidad")
    public Integer MaxCantidad;

    @JsonProperty("IdTipoTopping")
    public Integer IdTipoTopping;

    @JsonProperty("ValorUnitario")
    public Integer ValorUnitario;

    @JsonProperty("cantidadReserva")
    public Integer cantidadReserva;

    @JsonProperty("imagen")
    public String imagen;

    @JsonProperty("PesoKiloUnd")
    public String PesoKiloUnd;

    @JsonProperty("CrctrzcionCrta")
    public String CrctrzcionCrta;

    @JsonProperty("CrctrzcionLrga")
    public String CrctrzcionLrga;

    @JsonProperty("ImgDos")
    public String ImgDos;

    @JsonProperty("ImgTres")
    public String ImgTres;

    @JsonProperty("VlorRefencia")
    public Integer VlorRefencia;

    @JsonProperty("IdTipoTopingVenta")
    public Integer IdTipoTopingVenta;

    @JsonProperty("IdProdTopin")
    public Integer IdProdTopin;

    @JsonProperty("PresentacionProd")
    public String PresentacionProd;

    @JsonProperty("IdCampesino")
    public Integer IdCampesino;

    @JsonProperty("UnidadesPeso")
    public Integer UnidadesPeso;

    @JsonProperty("DefectoUnidadesPeso")
    public Integer DefectoUnidadesPeso;
}
