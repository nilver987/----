package com.example.msventa.dto;


import lombok.Data;

@Data
public class ClientDto {
    private Integer id;
    private String name;
    private String apellido_paterno;
    private String apellido_materno;
    private String DNI;
    private String telefono;
    private String direccion;

}
