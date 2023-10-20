package com.caglar.springbootgraphql.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "vehicle")
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100, name = "v_type")
    private String type;

    @Column(length = 100, name = "model_code")
    private String modelCode;

    @Column(length = 100, name = "brand_name")
    private String brandName;

    @Column(length = 100, name = "launch_date")
    private Date launchDate;
}
