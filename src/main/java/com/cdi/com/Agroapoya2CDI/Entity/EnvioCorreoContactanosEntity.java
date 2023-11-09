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
            name = "cliente_CorreoContactanos",
            procedureName = "cliente_CorreoContactanos",
            resultClasses = EnvioCorreoContactanosEntity.class)

})
public class EnvioCorreoContactanosEntity {

    @Id
    @JsonProperty("Email")
    public String Email;

    @JsonProperty("IdPlantilla")
    public Integer IdPlantilla;

    @JsonProperty("Asunto")
    public String Asunto;

    @JsonProperty("Html")
    public String Html;

    @JsonProperty("ImagenEnc")
    public String ImagenEnc;

    @JsonProperty("ImagenPie")
    public String ImagenPie;

    @JsonProperty("EmailOpc")
    public String EmailOpc;

    @JsonProperty("NombrePersona")
    public String NombrePersona;

    @JsonProperty("TelefonoPersona")
    public String TelefonoPersona;

    @JsonProperty("RespuWhat")
    public Integer RespuWhat;

    @JsonProperty("MensajePersona")
    public String MensajePersona;
}
