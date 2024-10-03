package com.example.msventa.entity;

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
    public SaleDetail() {
        this.price = (double) 0;
        this.amount = (double) 0;
    }
}