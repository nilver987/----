package com.example.msventa.dto;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;


@Data
public class ProductDto {
    private Integer id;
    private String name;
    private String marca;
    private String description;
    private String precio;
    private CategoryDto category;
}
