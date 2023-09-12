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
            name = "paC_realacionCuponOferta",
            procedureName = "paC_realacionCuponOferta",
            resultClasses = CrealacionCuponOfertaEntity.class)
})
public class CrealacionCuponOfertaEntity {

    @Id
    @JsonProperty("IdRelacion")
    public Integer IdRelacion;

    @JsonProperty("codigo_grupo")
    public String codigo_grupo;

    @JsonProperty("codigo_Mostrar")
    public String codigo_Mostrar;

    @JsonProperty("Cd_cnsctvo")
    public Integer Cd_cnsctvo;

    @JsonProperty("Producto")
    public String Producto;

    @JsonProperty("Mascara")
    public String Mascara;

    @JsonProperty("descripcionCupon")
    public String descripcionCupon;
}
