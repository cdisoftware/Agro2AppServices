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
            name = "paC_SeguimientoEntregas",
            procedureName = "paC_SeguimientoEntregas",
            resultClasses = CSeguimientoEntrEntity.class)
})
public class CSeguimientoEntrEntity {

    @Id
    @JsonProperty("ID")
    public Integer ID;

    @JsonProperty("CD_CNSCTVO")
    public Integer CD_CNSCTVO;

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

    @JsonProperty("DRCCION")
    public String DRCCION;

    @JsonProperty("CMPLMNTO_DRRCCION")
    public String CMPLMNTO_DRRCCION;

    @JsonProperty("COORDENADAS_ENTR")
    public String COORDENADAS_ENTR;

    @JsonProperty("unidadesEntregar")
    public Integer unidadesEntregar;

    @JsonProperty("observacionesCliente")
    public String observacionesCliente;

    @JsonProperty("VLOR_PGAR")
    public String VLOR_PGAR;

    @JsonProperty("tipoPago")
    public Integer tipoPago;

    @JsonProperty("descTipoPago")
    public String descTipoPago;

    @JsonProperty("IDGRUPO")
    public String IDGRUPO;

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

    @JsonProperty("COD_PEDIDO")
    public Integer COD_PEDIDO;

    @JsonProperty("ID_CLNTE")
    public Integer ID_CLNTE;

    @JsonProperty("Vlor_PagarForm")
    public String Vlor_PagarForm;

    @JsonProperty("distanciaEvi")
    public String distanciaEvi;

    @JsonProperty("distancia")
    public String distancia;

    @JsonProperty("Producto_ppal")
    public String Producto_ppal;

    @JsonProperty("peso_prod_ppal")
    public String peso_prod_ppal;

    @JsonProperty("producto_add")
    public String producto_add;

    @JsonProperty("peso_add")
    public String peso_add;

    @JsonProperty("id_manychat")
    public Integer id_manychat;

    @JsonProperty("IdSector")
    public Integer IdSector;

    @JsonProperty("ID_CARRO")
    public Integer ID_CARRO;

    @JsonProperty("id_evidencia")
    public Integer id_evidencia;

    @JsonProperty("orden")
    public Integer orden;

    @JsonProperty("USUCODIG")
    public String USUCODIG;

    @JsonProperty("IdGrupoMilla")
    public Integer IdGrupoMilla;

    @JsonProperty("fecha_entrega")
    public String fecha_entrega;

    @JsonProperty("hora_entrega")
    public String hora_entrega;

    @JsonProperty("imagen_evidencia")
    public String imagen_evidencia;
}
