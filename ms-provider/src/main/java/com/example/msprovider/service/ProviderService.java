package com.example.msprovider.service;
import com.example.msprovider.entity.Provider;

import java.util.List;
import java.util.Optional;

public interface ProviderService {
    List<Provider> list();
    Optional<Provider> findById(Integer id);
    Provider save(Provider category);
    Provider update(Provider category);
    void delete(Integer id);
}