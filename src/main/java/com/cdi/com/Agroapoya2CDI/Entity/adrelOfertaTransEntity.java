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
            name = "admin_relacion_Oferta_Trans",
            procedureName = "admin_relacion_Oferta_Trans",
            resultClasses = adrelOfertaTransEntity.class)
})
public class adrelOfertaTransEntity {

    @Id
    @JsonProperty("id")
    public Integer id;

    @JsonProperty("IdTran")
    public Integer IdTran;

    @JsonProperty("IdProducto")
    public Integer IdProducto;

    @JsonProperty("cantidad")
    public Integer cantidad;

    @JsonProperty("cd_cnsctvo")
    public Integer cd_cnsctvo;

    @JsonProperty("Descripcion")
    public String Descripcion;

    @JsonProperty("Presentacion")
    public String Presentacion;

    @JsonProperty("PesoKilos")
    public String PesoKilos;

    @JsonProperty("TipoProducto")
    public Integer TipoProducto;
}
