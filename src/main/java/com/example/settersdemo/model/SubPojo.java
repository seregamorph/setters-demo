package com.example.settersdemo.model;

public class SubPojo extends IdPojo<SubPojo> {

    private String value;

    public SubPojo() {
    }

    public SubPojo(long id) {
        super(id);
    }

//    @Override
//    public SubPojo setId(long id) {
//        return (SubPojo) super.setId(id);
//    }

    public String getValue() {
        return value;
    }

    public SubPojo setValue(String value) {
        this.value = value;
        return this;
    }

    // equals, hashCode, toString


    public static SubPojo create() {
        return new SubPojo()
                .setValue("value")
                .setId(1);
    }
}
