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
            name = "Ikon_Usuarios",
            procedureName = "Ikon_Usuarios",
            resultClasses = Ikon_UsuariosEntity.class)
})
public class Ikon_UsuariosEntity {

    @Id
    @JsonProperty("idUsuario")
    public Integer idUsuario;

    @JsonProperty("NombreCompleto")
    public String NombreCompleto;

    @JsonProperty("Celular")
    public String Celular;

    @JsonProperty("IdManychat")
    public String IdManychat;

    @JsonProperty("Correo")
    public String Correo;

    @JsonProperty("Direccion")
    public String Direccion;

    @JsonProperty("COORDENADAS_ENTR")
    public String COORDENADAS_ENTR;

    @JsonProperty("sector")
    public String sector;

    @JsonProperty("Ciudad")
    public String Ciudad;

    @JsonProperty("Coordenadas")
    public String Coordenadas;

    @JsonProperty("EsEmbajador")
    public String EsEmbajador;

    @JsonProperty("FechaCreacionEmbajador")
    public String FechaCreacionEmbajador;

    @JsonProperty("LinkEmbajador")
    public String LinkEmbajador;

    @JsonProperty("EsClienteReferido")
    public String EsClienteReferido;

    @JsonProperty("fechaCreacionVecino")
    public String fechaCreacionVecino;

    @JsonProperty("NumeroCompras")
    public String NumeroCompras;

    @JsonProperty("ValorCompradoTotal")
    public String ValorCompradoTotal;

    @JsonProperty("FechaCreacionUsuario")
    public String FechaCreacionUsuario;

}
