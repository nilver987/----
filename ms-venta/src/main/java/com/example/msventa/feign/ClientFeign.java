package com.example.msventa.feign;

import com.example.msventa.dto.ClientDto;
import com.example.msventa.dto.ProductDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "ms-client-service" ,path = "/client")
public interface ClientFeign {
    @GetMapping("/{id}")
    public ResponseEntity<ClientDto> getById(@PathVariable Integer id);
}

