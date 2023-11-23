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
            name = "admin_SeguimientoInfoGeneral",
            procedureName = "admin_SeguimientoInfoGeneral",
            resultClasses = adSegtoInfoGeneralEntity.class)
})
public class adSegtoInfoGeneralEntity {

    @Id
    @JsonProperty("ID")
    public Integer ID;

    @JsonProperty("CD_CNSCTVO")
    public Integer CD_CNSCTVO;

    @JsonProperty("IdGrupoMilla")
    public Integer IdGrupoMilla;

    @JsonProperty("NombreGrupo")
    public String NombreGrupo;

    @JsonProperty("IdSector")
    public Integer IdSector;

    @JsonProperty("orden")
    public Integer orden;

    @JsonProperty("usucodigCliente")
    public Integer usucodigCliente;

    @JsonProperty("NOMBRES_PERSONA")
    public String NOMBRES_PERSONA;

    @JsonProperty("APELLIDOS_PERSONA")
    public String APELLIDOS_PERSONA;

    @JsonProperty("DOCUMENTO_USUARIO")
    public String DOCUMENTO_USUARIO;

    @JsonProperty("CELULAR_PERSONA")
    public String CELULAR_PERSONA;

    @JsonProperty("id_manychatUsuario")
    public String id_manychatUsuario;

    @JsonProperty("DRCCION")
    public String DRCCION;

    @JsonProperty("CMPLMNTO_DRRCCION")
    public String CMPLMNTO_DRRCCION;

    @JsonProperty("COORDENADAS_ENTR")
    public String COORDENADAS_ENTR;

    @JsonProperty("observacionesCliente")
    public String observacionesCliente;

    @JsonProperty("fecha_entrega")
    public String fecha_entrega;

    @JsonProperty("tipoPago")
    public Integer tipoPago;

    @JsonProperty("descTipoPago")
    public String descTipoPago;

    @JsonProperty("ValorTotalPagar")
    public String ValorTotalPagar;

    @JsonProperty("ValorPagarSinDomicilio")
    public String ValorPagarSinDomicilio;

    @JsonProperty("ValorDomicilio")
    public String ValorDomicilio;

    @JsonProperty("IDGRUPOCOMPRA")
    public String IDGRUPOCOMPRA;

    @JsonProperty("tipo_compra")
    public Integer tipo_compra;

    @JsonProperty("descTipoCompra")
    public String descTipoCompra;

    @JsonProperty("tipo_usuarioCompra")
    public Integer tipo_usuarioCompra;

    @JsonProperty("descUsuarioCompra")
    public String descUsuarioCompra;

    @JsonProperty("ESTDO")
    public Integer ESTDO;

    @JsonProperty("descEstado")
    public String descEstado;

    @JsonProperty("NMBRE_CNDCTOR")
    public String NMBRE_CNDCTOR;

    @JsonProperty("TEL_CNDCTOR")
    public String TEL_CNDCTOR;

    @JsonProperty("PLCA")
    public String PLCA;

    @JsonProperty("IdEvidencia")
    public String IdEvidencia;

    @JsonProperty("imagen_evidencia")
    public String imagen_evidencia;

    @JsonProperty("forma_pago")
    public String forma_pago;

    @JsonProperty("FechaEntrega")
    public String FechaEntrega;

    @JsonProperty("ObsEvidencia")
    public String ObsEvidencia;

    @JsonProperty("ObsEvidenciaDos")
    public String ObsEvidenciaDos;

    @JsonProperty("ProductoPrincipal")
    public String ProductoPrincipal;

    @JsonProperty("EmpaqueProductoPrin")
    public String EmpaqueProductoPrin;

    @JsonProperty("undProdPrincipal")
    public Integer undProdPrincipal;

    @JsonProperty("VlorProductoPrincipal")
    public String VlorProductoPrincipal;

    @JsonProperty("ProductoAdicional")
    public String ProductoAdicional;

    @JsonProperty("TodosLosProductos")
    public String TodosLosProductos;
}
