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
            name = "paC_perfilCliente",
            procedureName = "paC_perfilCliente",
            resultClasses = CperfilClienteEntity.class)
})
public class CperfilClienteEntity {

    @Id
    @JsonProperty("Usucodig")
    public Integer Usucodig;

    @JsonProperty("NombrePersona")
    public String NombrePersona;

    @JsonProperty("ApellidoPersona")
    public String ApellidoPersona;

    @JsonProperty("IdTipoDocumento")
    public Integer IdTipoDocumento;

    @JsonProperty("DescTipoDoc")
    public String DescTipoDoc;

    @JsonProperty("NumDocumento")
    public String NumDocumento;

    @JsonProperty("Celular")
    public String Celular;

    @JsonProperty("CorreoPersona")
    public String CorreoPersona;

    @JsonProperty("direccionPersona")
    public String direccionPersona;

    @JsonProperty("CompleDirecci")
    public String CompleDirecci;

    @JsonProperty("cordenadas")
    public String cordenadas;

    @JsonProperty("IdDepto")
    public Integer IdDepto;

    @JsonProperty("DescDepto")
    public String DescDepto;

    @JsonProperty("IdCiudad")
    public Integer IdCiudad;

    @JsonProperty("DesCiudad")
    public String DesCiudad;

    @JsonProperty("Token")
    public String Token;

    @JsonProperty("idTipoPersona")
    public Integer idTipoPersona;

    @JsonProperty("descripTipoPersona")
    public String descripTipoPersona;

    @JsonProperty("IdTipoCliente")
    public Integer IdTipoCliente;

    @JsonProperty("DesTipoCliente")
    public String DesTipoCliente;

    @JsonProperty("RazonSocial")
    public String RazonSocial;

    @JsonProperty("Nit")
    public String Nit;

}
