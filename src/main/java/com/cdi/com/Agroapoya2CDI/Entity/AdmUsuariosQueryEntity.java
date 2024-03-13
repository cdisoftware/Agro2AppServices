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
            name = "Admin_UsuariosQuery",
            procedureName = "Admin_UsuariosQuery",
            resultClasses = AdmUsuariosQueryEntity.class)
})
public class AdmUsuariosQueryEntity {

    @Id
    @JsonProperty("ID")
    public String ID;

    @JsonProperty("USUCODIG")
    public Integer USUCODIG;

    @JsonProperty("USUARIO")
    public String USUARIO;

    @JsonProperty("CELULAR")
    public String CELULAR;

    @JsonProperty("ID_MANYCHAT")
    public String ID_MANYCHAT;

    @JsonProperty("IDSECTOR")
    public Integer IDSECTOR;

    @JsonProperty("QueryPre")
    public String QueryPre;

    @JsonProperty("CORREO_PERSONA")
    public String CORREO_PERSONA;

    @JsonProperty("id_carro")
    public String id_carro;
}
