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
            name = "paC_HistorialCompras",
            procedureName = "paC_HistorialCompras",
            resultClasses = CHistorialComprasEntity.class)
})
public class CHistorialComprasEntity {

    @Id
    @JsonProperty("ID_CLNTE")
    public Integer ID_CLNTE;

    @JsonProperty("ID_CARRO")
    public Integer ID_CARRO;

    @JsonProperty("Usucodig")
    public Integer Usucodig;

    @JsonProperty("DireccionEntrega")
    public String DireccionEntrega;

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

    @JsonProperty("PagoXParti")
    public String PagoXParti;

    @JsonProperty("PagoXPartiForm")
    public String PagoXPartiForm;

    @JsonProperty("ValorPagarPrin")
    public String ValorPagarPrin;

    @JsonProperty("ValorPagarPrinForm")
    public String ValorPagarPrinForm;

    @JsonProperty("ValorPagar")
    public String ValorPagar;

    @JsonProperty("ValorPagarForm")
    public String ValorPagarForm;

    @JsonProperty("DescToppings")
    public String DescToppings;

    @JsonProperty("fechaCompraTotal")
    public String fechaCompraTotal;

    @JsonProperty("CalificacionProd")
    public String CalificacionProd;

    @JsonProperty("ComentarioProd")
    public String ComentarioProd;

    @JsonProperty("rta_encuesta")
    public String rta_encuesta;

    @JsonProperty("IdMedioPago")
    public Integer IdMedioPago;

    @JsonProperty("DesMedioPago")
    public String DesMedioPago;

    @JsonProperty("IdEstadoPago")
    public Integer IdEstadoPago;

    @JsonProperty("DesEstadoPago")
    public String DesEstadoPago;

    @JsonProperty("DesEstdoCarrito")
    public String DesEstdoCarrito;

    @JsonProperty("CodCompra")
    public String CodCompra;

    @JsonProperty("idPagoLider")
    public String idPagoLider;

    @JsonProperty("DesPagoLider")
    public String DesPagoLider;

    @JsonProperty("IdPagoParti")
    public Integer IdPagoParti;

    @JsonProperty("DesPagoParti")
    public String DesPagoParti;

    @JsonProperty("ValorDomicilio")
    public String ValorDomicilio;

    @JsonProperty("RegaloLider")
    public String RegaloLider;

    @JsonProperty("CantidadRegaloLider")
    public String CantidadRegaloLider;

    @JsonProperty("codigo_MostrarParti")
    public String codigo_MostrarParti;

    @JsonProperty("IDGRUPO_PARTI")
    public String IDGRUPO_PARTI;

    @JsonProperty("PerteneceSector")
    public Integer PerteneceSector;

    @JsonProperty("LinkParticipante")
    public String LinkParticipante;

    @JsonProperty("NombrePersona")
    public String NombrePersona;

    @JsonProperty("EstadoOferta")
    public Integer EstadoOferta;

    @JsonProperty("OfertaVinculada")
    public String OfertaVinculada;

    @JsonProperty("CodigoDescuentoGeneral")
    public String CodigoDescuentoGeneral;

    @JsonProperty("TPO_OFRTA")
    public Integer TPO_OFRTA;

    @JsonProperty("RegalosCompra")
    public String RegalosCompra;
    
    @JsonProperty("codigo_mostrar")
    public String codigo_mostrar;
    
    @JsonProperty("descripcion")
    public String descripcion;
    
    @JsonProperty("estado")
    public Integer estado;
    
    @JsonProperty("descuentoAplicable")
    public String descuentoAplicable;
    
    @JsonProperty("NumeParti")
    public String NumeParti;
    
    @JsonProperty("FechaDesdeCupon")
    public String FechaDesdeCupon;
    
    @JsonProperty("FechaHastaCupon")
    public String FechaHastaCupon;
    
}
