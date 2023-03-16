package com.cdi.com.Agroapoya2CDI.Comun;

import java.util.Map;

public class Record {

    private String description;
    private Map<String, Double> features;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Map<String, Double> getFeatures() {
        return features;
    }

    public void setFeatures(Map<String, Double> features) {
        this.features = features;
    }

    public Record(String description, Map<String, Double> features) {
        this.description = description;
        this.features = features;
    }
    
}
