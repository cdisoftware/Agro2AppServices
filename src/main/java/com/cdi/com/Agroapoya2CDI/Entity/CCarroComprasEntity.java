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
            name = "paC_CarroCompras",
            procedureName = "paC_CarroCompras",
            resultClasses = CCarroComprasEntity.class)
})
public class CCarroComprasEntity {

    @Id
    @JsonProperty("ID_CARRO")
    public Integer ID_CARRO;

    @JsonProperty("IDGRUPO_PARTI")
    public String IDGRUPO_PARTI;

    @JsonProperty("EsParti")
    public String EsParti;

    @JsonProperty("Usucodig")
    public Integer Usucodig;

    @JsonProperty("tipodescuento")
    public String tipodescuento;
    
    @JsonProperty("NumReg")
    public String NumReg;
    
    @JsonProperty("valorDesc")
    public String valorDesc;
    
    @JsonProperty("valorDesForm")
    public String valorDesForm;

    @JsonProperty("Imagen")
    public String Imagen;

    @JsonProperty("Producto")
    public String Producto;

    @JsonProperty("Campesino")
    public String Campesino;

    @JsonProperty("Tamano")
    public String Tamano;

    @JsonProperty("CondicionEntrega")
    public String CondicionEntrega;

    @JsonProperty("Empaque")
    public String Empaque;

    @JsonProperty("DescripcionProducto")
    public String DescripcionProducto;

    @JsonProperty("DepOrigen")
    public String DepOrigen;

    @JsonProperty("CiudadOrigen")
    public String CiudadOrigen;

    @JsonProperty("VigenciaDesde")
    public String VigenciaDesde;

    @JsonProperty("VigenciaHasta")
    public String VigenciaHasta;

    @JsonProperty("FechaEntrega")
    public String FechaEntrega;

    @JsonProperty("Caracterizacion")
    public String Caracterizacion;

    @JsonProperty("IdEstdoCarrito")
    public Integer IdEstdoCarrito;

    @JsonProperty("fechaCompra")
    public String fechaCompra;

    @JsonProperty("Cd_cnsctivo")
    public Integer Cd_cnsctivo;

    @JsonProperty("IdSecor")
    public Integer IdSecor;

    @JsonProperty("DSCRPCION_SCTOR")
    public String DSCRPCION_SCTOR;

    @JsonProperty("IdGrupo")
    public Integer IdGrupo;

    @JsonProperty("CodigoMostrar")
    public String CodigoMostrar;

    @JsonProperty("IdTipoUsuCompra")
    public Integer IdTipoUsuCompra;

    @JsonProperty("DesTipoUsuCompra")
    public String DesTipoUsuCompra;

    @JsonProperty("Unidades")
    public Integer Unidades;

    @JsonProperty("Observaciones")
    public String Observaciones;

    @JsonProperty("ValorPagar")
    public String ValorPagar;

    @JsonProperty("ValorPagarForm")
    public String ValorPagarForm;

    @JsonProperty("MinUni")
    public Integer MinUni;

    @JsonProperty("MaxUnd")
    public Integer MaxUnd;

    @JsonProperty("btnComprar")
    public Integer btnComprar;

    @JsonProperty("btnEliminar")
    public Integer btnEliminar;

    @JsonProperty("DescToppings")
    public String DescToppings;

    @JsonProperty("smsNoCompra")
    public String smsNoCompra;

    @JsonProperty("PosiblePago")
    public String PosiblePago;

    @JsonProperty("IdPosiblePago")
    public Integer IdPosiblePago;

    @JsonProperty("VlorDmcInd")
    public String VlorDmcInd;

    @JsonProperty("VlorDmcGrupal")
    public String VlorDmcGrupal;

    @JsonProperty("LinkParticipante")
    public String LinkParticipante;

    @JsonProperty("CodCompra")
    public String CodCompra;

    @JsonProperty("DireccionEntrega")
    public String DireccionEntrega;

}
