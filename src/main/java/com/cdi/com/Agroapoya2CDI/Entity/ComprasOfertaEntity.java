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
    @JsonProperty("id")
    public Integer id;

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

    @JsonProperty("VALOR_PAGO")
    public String VALOR_PAGO;

    @JsonProperty("CELULAR_PERSONA")
    public String CELULAR_PERSONA;

    @JsonProperty("CORREO_PERSONA")
    public String CORREO_PERSONA;

    @JsonProperty("RegistrosAsociados")
    public Integer RegistrosAsociados;

    @JsonProperty("NumeroCompras")
    public Integer NumeroCompras;

    @JsonProperty("LinkCompra")
    public String LinkCompra;

    @JsonProperty("Id_Flujo")
    public String Id_Flujo;

    @JsonProperty("id_manychat")
    public String id_manychat;

    @JsonProperty("descripcion_regalo")
    public String descripcion_regalo;
}
