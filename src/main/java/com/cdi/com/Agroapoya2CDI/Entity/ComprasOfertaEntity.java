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
            name = "paCComprasOferta",
            procedureName = "paCComprasOferta",
            resultClasses = ComprasOfertaEntity.class)
})
public class ComprasOfertaEntity {

    @Id
    @JsonProperty("usuario")
    public Integer usuario;

    @JsonProperty("OFERTA")
    public Integer OFERTA;

    @JsonProperty("SECTOR")
    public String SECTOR;

    @JsonProperty("FECHA_COMPRA")
    public String FECHA_COMPRA;

    @JsonProperty("TIPO_USUARIO_COMPRA")
    public String TIPO_USUARIO_COMPRA;

    @JsonProperty("CODIGO_COMPARTIR")
    public String CODIGO_COMPARTIR;

    @JsonProperty("CODIGO_LIDER")
    public String CODIGO_LIDER;

    @JsonProperty("NOMBRES_PERSONA")
    public String NOMBRES_PERSONA;

    @JsonProperty("PRODUCTO")
    public String PRODUCTO;

    @JsonProperty("Unidades")
    public Integer Unidades;

    @JsonProperty("ADICIONALES")
    public String ADICIONALES;

    @JsonProperty("VALOR_PAGO")
    public String VALOR_PAGO;

    @JsonProperty("DIRECCION_ENTREGA")
    public String DIRECCION_ENTREGA;

    @JsonProperty("CELULAR_PERSONA")
    public String CELULAR_PERSONA;

    @JsonProperty("CORREO_PERSONA")
    public String CORREO_PERSONA;

    @JsonProperty("registros")
    public Integer registros;

    @JsonProperty("compras")
    public Integer compras;

    @JsonProperty("comprasRegistros")
    public Integer comprasRegistros;

    @JsonProperty("Linckcarrocompras")
    public String Linckcarrocompras;

    @JsonProperty("LickOferta")
    public String LickOferta;

    @JsonProperty("pertenecesector")
    public String pertenecesector;

    @JsonProperty("textosWhats")
    public String textosWhats;

    @JsonProperty("id_manychat")
    public String id_manychat;
    
}
