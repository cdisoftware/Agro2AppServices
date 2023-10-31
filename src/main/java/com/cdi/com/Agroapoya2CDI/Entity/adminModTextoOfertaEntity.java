package com.cdi.com.Agroapoya2CDI.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import lombok.Data;

@Entity
@Data
@NamedStoredProcedureQueries({
    @NamedStoredProcedureQuery(
            name = "admin_ModificacionTextoOferta",
            procedureName = "admin_ModificacionTextoOferta",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class adminModTextoOfertaEntity {

    @Id
    @JsonProperty("cd_cnsctivo")
    public Integer cd_cnsctivo;

    @JsonProperty("idsector")
    public Integer idsector;

    @JsonProperty("ModalRegistroTextoUno")
    public String ModalRegistroTextoUno;

    @JsonProperty("ModalRegistroTextoDos")
    public String ModalRegistroTextoDos;

    @JsonProperty("ModalRegistroTextoTres")
    public String ModalRegistroTextoTres;

    @JsonProperty("ModalRegistroImagenUno")
    public String ModalRegistroImagenUno;

}
