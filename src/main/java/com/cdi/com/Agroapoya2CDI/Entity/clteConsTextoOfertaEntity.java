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
            name = "cliente_ConsultaTextoOferta",
            procedureName = "cliente_ConsultaTextoOferta",
            resultClasses = clteConsTextoOfertaEntity.class)
})
public class clteConsTextoOfertaEntity {

    @Id
    @JsonProperty("Id")
    public Integer Id;

    @JsonProperty("Cd_cnsctvo")
    public Integer Cd_cnsctvo;

    @JsonProperty("IdSector")
    public Integer IdSector;

    @JsonProperty("ImagenUno")
    public String ImagenUno;

    @JsonProperty("TextoUno")
    public String TextoUno;

    @JsonProperty("TextoDos")
    public String TextoDos;

    @JsonProperty("TextoTres")
    public String TextoTres;
}
