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
            name = "z_ImagenesAsociadasSectorOferta_Cons",
            procedureName = "z_ImagenesAsociadasSectorOferta_Cons",
            resultClasses = zImagenesAsociadasSectorOfertaConsEntity.class)
})

public class zImagenesAsociadasSectorOfertaConsEntity {

    @Id
    @JsonProperty("Id")
    public Integer Id;

    @JsonProperty("Nombre")
    public String Nombre;

    @JsonProperty("Relacion")
    public Integer Relacion;

    @JsonProperty("IdOferta")
    public Integer IdOferta;
}
