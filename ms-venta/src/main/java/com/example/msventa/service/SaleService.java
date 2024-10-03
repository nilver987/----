package com.example.msventa.service;
import com.example.msventa.entity.Sale;

import java.util.List;
import java.util.Optional;
public interface SaleService {
    List<Sale> list();
    Optional<Sale> findById(Integer id);
    Sale save(Sale sale);
    Sale update(Sale sale);
    void delete(Integer id);
}
