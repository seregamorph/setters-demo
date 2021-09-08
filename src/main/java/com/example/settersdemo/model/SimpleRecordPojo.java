package com.example.settersdemo.model;

record SimpleRecordPojo(int value, String arg) {


    public static void main(String[] args) {
        SimpleRecordPojo pojo = new SimpleRecordPojo(1, "");
        pojo.value();
    }
}
