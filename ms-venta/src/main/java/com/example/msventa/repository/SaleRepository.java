package com.example.msventa.repository;


import com.example.msventa.entity.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SaleRepository  extends JpaRepository<Sale, Integer> {
    List<Sale> findByCode(String code);
}
