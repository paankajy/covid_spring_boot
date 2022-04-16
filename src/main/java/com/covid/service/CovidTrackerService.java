package com.covid.service;

import com.covid.entity.CovidData;
import com.covid.respository.CovidTrackerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CovidTrackerService {

    @Autowired
    CovidTrackerRepository covidTrackerRepository;

    public List<CovidData> findByState(String state) {
      return  covidTrackerRepository.findByState(state);
    }

    public List<CovidData> getAllData() {
        return covidTrackerRepository.findAll();
    }
}
