package com.humber.Week1ThymeleafProject.models;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Dish {
    private int id;
    private String name;
    private String category;
    private double price;
}

