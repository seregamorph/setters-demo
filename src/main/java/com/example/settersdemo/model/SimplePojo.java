package com.example.settersdemo.model;

public class SimplePojo {
    private String value;

    public String getValue() {
        return value;
    }

    public SimplePojo setValue(String value) {
        this.value = value;
        return this;
    }

    // equals, hashCode, toString
}
