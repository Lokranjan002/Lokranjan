package com.cognizant.spring-learn.controller;

import com.cognizant.spring-learn.model.Country;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CountryController.class);

    @RequestMapping("/country")
    public Country getCountryIndia() {
        LOGGER.info("Start getCountryIndia()");

        // Load bean from XML
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        com.cognizant.spring.Country country = (com.cognizant.spring.Country) context.getBean("in");

        LOGGER.info("End getCountryIndia()");
        return country;
    }
}
