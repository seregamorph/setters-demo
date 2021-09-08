package com.example.settersdemo.model;

public class IdPojo<T extends IdPojo<T>> {

    private long id;

    public IdPojo() {
    }

    public IdPojo(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public T setId(long id) {
        this.id = id;
        return self();
    }

    private T self() {
        return (T) this;
    }

    // equals, hashCode, toString
}
