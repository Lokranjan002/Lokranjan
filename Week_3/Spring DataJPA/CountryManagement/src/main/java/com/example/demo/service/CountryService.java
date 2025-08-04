package com.example.demo.service;

import com.example.demo.entity.Country;
import com.example.demo.repository.CountryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {
    private final CountryRepository repo;

    public CountryService(CountryRepository repo) {
        this.repo = repo;
    }

    public List<Country> getAllCountries() {
        return repo.findAll();
    }

    public Country findByCode(String code) {
        return repo.findByCode(code);
    }

    public Country addCountry(Country country) {
        return repo.save(country);
    }
}
