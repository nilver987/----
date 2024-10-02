package com.example.msprovider.service.impl;
import com.example.msprovider.entity.Provider;
import com.example.msprovider.repository.ProviderRepository;
import com.example.msprovider.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProviderServiceImpl implements  ProviderService{
    @Autowired
    private ProviderRepository providerRepository;

    @Override
    public List<Provider> list() {
        return providerRepository.findAll();
    }

    @Override
    public Optional<Provider> findById(Integer id) {
        return providerRepository.findById(id);
    }

    @Override
    public Provider save(Provider category) {
        return providerRepository.save(category);
    }

    @Override
    public Provider update(Provider category) {
        return providerRepository.save(category);
    }

    @Override
    public void delete(Integer id) {
        providerRepository.deleteById(id);
    }
}