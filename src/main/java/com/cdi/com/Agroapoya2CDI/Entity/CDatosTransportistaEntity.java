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
            name = "paCDatosTransportista",
            procedureName = "paCDatosTransportista",
            resultClasses = CDatosTransportistaEntity.class)
})
public class CDatosTransportistaEntity {

    @Id
    @JsonProperty("id")
    public Integer id;

    @JsonProperty("transportista")
    public String transportista;

    @JsonProperty("CORREO_PERSONA")
    public String CORREO_PERSONA;

    @JsonProperty("CELULAR_PERSONA")
    public String CELULAR_PERSONA;

    @JsonProperty("DRCCION")
    public String DRCCION;

    @JsonProperty("CONDUCTOR")
    public String CONDUCTOR;

    @JsonProperty("DIRECCION")
    public String DIRECCION;

    @JsonProperty("TEL_CNDCTOR")
    public String TEL_CNDCTOR;

    @JsonProperty("CIUDAD_TRANS")
    public String CIUDAD_TRANS;

    @JsonProperty("CIUDAD_COND")
    public String CIUDAD_COND;

}
