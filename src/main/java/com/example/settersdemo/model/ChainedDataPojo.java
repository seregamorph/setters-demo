package com.example.settersdemo.model;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ChainedDataPojo {
    private String value;
}






