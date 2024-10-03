package com.example.msventa.entity;

import com.example.msventa.dto.ProductDto;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class SaleDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Double price;
    private Double amount;
    private Integer ProductId;
    @Transient
    private ProductDto productDto;
    public SaleDetail() {
        this.price = (double) 0;
        this.amount = (double) 0;
    }
}