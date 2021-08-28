package com.example.settersdemo.model;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class DataPojo {
    private String value;
}






