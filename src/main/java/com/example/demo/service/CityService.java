package com.example.demo.service;

import com.example.demo.model.City;
import com.example.demo.repositories.CityRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService implements ICityService{

    private final CityRepository cityRepository;

    public CityService(CityRepository repository) {
        this.cityRepository = repository;
    }

    public List<City> findAll() {
        return cityRepository.findCity();
    }
}
