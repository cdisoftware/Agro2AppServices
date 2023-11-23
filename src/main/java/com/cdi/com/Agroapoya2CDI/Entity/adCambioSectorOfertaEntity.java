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
            name = "admin_cambioSectorOferta",
            procedureName = "admin_cambioSectorOferta",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class adCambioSectorOfertaEntity {

    @Id
    @JsonProperty("cd_cnstvo")
    public Integer cd_cnstvo;

    @JsonProperty("Id_sectorNuevo")
    public Integer Id_sectorNuevo;

    @JsonProperty("Id_sectorViejo")
    public Integer Id_sectorViejo;

}
