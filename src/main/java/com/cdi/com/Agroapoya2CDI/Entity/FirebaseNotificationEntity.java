package com.cdi.com.Agroapoya2CDI.Entity;

public class FirebaseNotificationEntity {

    public String Respuesta;

    public String getRespuesta() {
        return Respuesta;
    }

    public void setRespuesta(String Respuesta) {
        this.Respuesta = Respuesta;
    }

    @Override
    public String toString() {
        return "FirebaseNotificationEntity{" + "Respuesta=" + Respuesta + '}';
    }

}
