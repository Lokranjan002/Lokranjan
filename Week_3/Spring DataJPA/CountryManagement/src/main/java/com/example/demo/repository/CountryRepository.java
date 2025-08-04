package com.example.demo.repository;

import com.example.demo.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CountryRepository extends JpaRepository<Country, String> {
    Country findByCode(String code);

    List<Country> findByNameContaining(String keyword);

    @Query("SELECT c FROM Country c WHERE c.name = :name")
    List<Country> findByNameHQL(@Param("name") String name);

    @Query(value = "SELECT * FROM country WHERE name = :name", nativeQuery = true)
    List<Country> findByNameNative(@Param("name") String name);
}
