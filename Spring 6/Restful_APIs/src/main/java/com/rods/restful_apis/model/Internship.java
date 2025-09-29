package com.rods.restful_apis.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;


@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Internship {
    private int id;
    private String position;
    private String company;
    private double stipend;
    private String desc;
}
