package com.example.demo.service;

import com.example.demo.model.Country;
import com.example.demo.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryServiceImpl implements CountryService {
    @Autowired
    CountryRepository countryRepository;
    @Override
    public Iterable<Country> findAll() {
        return countryRepository.findAll();
    }
}
