package com.example.msventa.dto;


import lombok.Data;

import java.math.BigDecimal;


@Data
public class ProductDto {
    private Integer id;
    private String name;
    private String marca;
    private String description;
    private String precio;
    private CategoryDto  categoryDto;
}
