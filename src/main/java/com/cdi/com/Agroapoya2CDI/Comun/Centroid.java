package com.cdi.com.Agroapoya2CDI.Comun;

import java.util.Map;

public class Centroid {

    private Map<String, Double> coordinates;

    public Map<String, Double> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Map<String, Double> coordinates) {
        this.coordinates = coordinates;
    }

    public Centroid(Map<String, Double> coordinates) {
        this.coordinates = coordinates;
    }
}
