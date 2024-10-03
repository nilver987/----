package com.example.msventa.controller;


import com.example.msventa.entity.Sale;
import com.example.msventa.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/sale")
public class SaleController {
    @Autowired
    private SaleService saleService;

    @GetMapping
    public ResponseEntity<List<Sale>> getAll() {
        return ResponseEntity.ok(saleService.list());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Sale>> getById(@PathVariable Integer id) {
        return ResponseEntity.ok(saleService.findById(id));
    }
    @PostMapping
    public ResponseEntity<Sale> create(@RequestBody Sale sale) {
        return ResponseEntity.ok(saleService.save(sale));
    }
    @PutMapping("/{id}")
    public ResponseEntity<Sale> update(@PathVariable Integer id,
                                        @RequestBody Sale sale) {
        sale.setId(id);
        return ResponseEntity.ok(saleService.save(sale));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<List<Sale>> delete(@PathVariable Integer id) {
        saleService.delete(id);
        return ResponseEntity.ok(saleService.list());
    }
}
