package com.example.demo;

import com.example.demo.entity.Country;
import com.example.demo.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    @Autowired
    private CountryService countryService;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) {
        countryService.addCountry(new Country("IN", "India"));
        countryService.addCountry(new Country("US", "United States"));
        System.out.println("Countries: " + countryService.getAllCountries().size());
        System.out.println("Find by Code (IN): " + countryService.findByCode("IN").getName());
    }
}
