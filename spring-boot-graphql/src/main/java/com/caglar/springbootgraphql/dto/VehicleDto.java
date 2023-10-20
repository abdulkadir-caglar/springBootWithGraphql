package com.caglar.springbootgraphql.dto;

import lombok.Data;

import java.util.Date;

@Data
public class VehicleDto {

    private String type;
    private String modelCode;
    private String brandName;
}
