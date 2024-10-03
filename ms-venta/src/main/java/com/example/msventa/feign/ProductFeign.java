package com.example.msventa.feign;


import com.example.msventa.dto.ProductDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@FeignClient(name = "ms-catalog-service" ,path = "/product")
public interface ProductFeign {
    @GetMapping("/{id}")
    public ResponseEntity<ProductDto> getById(@PathVariable Integer id);
}
