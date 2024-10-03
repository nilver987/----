package com.example.msventa.dto;


import lombok.Data;


@Data
public class ProductDto {
    private Integer id;
    private String nombre;
    private String tipo;
    private String marca;
    private String precio;
    private ClientDto category;
}
