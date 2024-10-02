package com.example.msprovider.controller;
import com.example.msprovider.entity.Provider;
import com.example.msprovider.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/provider")
public class ProviderController {
    @Autowired
    private ProviderService providerService;

    @GetMapping
    public ResponseEntity<List<Provider>> getAll() {
        return ResponseEntity.ok(providerService.list());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Provider>> getById(@PathVariable Integer id) {
        return ResponseEntity.ok(providerService.findById(id));
    }
    @PostMapping
    public ResponseEntity<Provider> create(@RequestBody Provider provider) {
        return ResponseEntity.ok(providerService.save(provider));
    }
    @PutMapping("/{id}")
    public ResponseEntity<Provider> update(@PathVariable Integer id,
                                           @RequestBody Provider provider) {
        provider.setId(id);
        return ResponseEntity.ok(providerService.save(provider));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<List<Provider>> delete(@PathVariable Integer id) {
        providerService.delete(id);
        return ResponseEntity.ok(providerService.list());
    }
}
