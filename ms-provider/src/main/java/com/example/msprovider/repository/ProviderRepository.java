package com.example.msprovider.repository;
import com.example.msprovider.entity.Provider;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProviderRepository  extends JpaRepository<Provider, Integer> {
    List<Provider> findByCode(String code);
}