package com.example.demo.service;

import com.example.demo.model.City;
import com.example.demo.repositories.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {

    @Autowired
    CityRepository cityRepository;

    public List<City> getAllCity() {
        return cityRepository.findAll();
    }
}
