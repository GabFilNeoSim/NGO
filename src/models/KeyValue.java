package models;

import javax.swing.JTextField;

public class KeyValue {
    private String key;
    private String value;

    public KeyValue(String key, String value) {
        this.key = key;
        this.value = value;
    }
    
    public KeyValue(String key, JTextField field) {
        this.key = key;
        this.value = field.getText();
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}
