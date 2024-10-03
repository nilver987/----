package com.example.msventa.dto;


import lombok.Data;

import java.math.BigDecimal;


@Data
public class ProductDto {
    private Integer id;
    private String name;
    private String marca;
    private String description;
    private BigDecimal precio;

    private CategoryDto  categoryDto;
}
