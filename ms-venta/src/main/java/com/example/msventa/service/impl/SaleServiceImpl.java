package com.example.msventa.service.impl;

import com.example.msventa.entity.Sale;
import com.example.msventa.repository.SaleRepository;
import com.example.msventa.service.SaleService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;


@Service
public class SaleServiceImpl implements SaleService  {
    @Autowired
    private SaleRepository saleRepository;

    @Override
    public List<Sale> list() {
        return saleRepository.findAll();
    }

    @Override
    public Optional<Sale> findById(Integer id) {return saleRepository.findById(id);
    }

    @Override
    public Sale save(Sale sale) {
        return saleRepository.save(sale);
    }

    @Override
    public Sale update(Sale sale) {
        return saleRepository.save(sale);
    }

    @Override
    public void delete(Integer id) {
        saleRepository.deleteById(id);
    }
}
