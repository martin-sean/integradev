package main.model;

import java.io.Serializable;
import java.util.*;

public class Attribute implements Serializable {
    
    private String key;
    private String message;
    private List<String> values;
    
    public Attribute(String key, String message) {
        this.key = key;
        this.message = message;
        this.values = new ArrayList<>();
        values.add("UNKNOWN");
    }
    
    // Adds a value to the attribute if it does not already exist
    public void addValue(String value) {
        if (!this.values.contains(value)) {
            this.values.add(value);
        }
    }
    
    public List<String> getValues() {
        return this.values;
    }
    
    public String getKey() {
        return this.key;
    }
    
    public String getMessage() {
        return this.message;
    }
    
}