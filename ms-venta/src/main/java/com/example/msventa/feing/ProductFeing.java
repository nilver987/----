package com.example.msventa.feing;

import com.example.msventa.dto.ProductDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient (name = "ms-catalog-service" ,path = "/product")
public interface ProductFeing {
    @GetMapping("/{id}")
    public ResponseEntity<ProductDto> getById(@PathVariable Integer id);
}
