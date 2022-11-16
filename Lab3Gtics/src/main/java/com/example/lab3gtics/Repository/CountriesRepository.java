package com.example.lab3gtics.Repository;

import com.example.lab3gtics.Entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountriesRepository extends JpaRepository<Country, String> {
}
