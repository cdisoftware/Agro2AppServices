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
            name = "z_MensajesParametrizablesCons",
            procedureName = "z_MensajesParametrizablesCons",
            resultClasses = zMensajesParametrizablesConsEntity.class)
})

public class zMensajesParametrizablesConsEntity {

    @Id
    @JsonProperty("IdMensaje")
    public Integer IdMensaje;

    @JsonProperty("Nombre")
    public String Nombre;

    @JsonProperty("MensajeUno")
    public String MensajeUno;

    @JsonProperty("DatoUno")
    public String DatoUno;
}
