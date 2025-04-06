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
            name = "z_ConsultarPagosFiado",
            procedureName = "z_ConsultarPagosFiado",
            resultClasses = zConsultarPagosFiadoEntity.class)
})

public class zConsultarPagosFiadoEntity {

    @Id
    @JsonProperty("NOMBRES_PERSONA")
    public String NOMBRES_PERSONA;

    @JsonProperty("CORREO_PERSONA")
    public String CORREO_PERSONA;

    @JsonProperty("CELULAR_PERSONA")
    public String CELULAR_PERSONA;

    @JsonProperty("id_manychat")
    public String id_manychat;
    
        @JsonProperty("TotalDeuda")
    public String TotalDeuda;

    @JsonProperty("Sectores")
    public String Sectores;

}
