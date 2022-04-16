package com.covid.controller;

import com.covid.service.CovidTrackerService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin()
@RestController
@RequestMapping("/api/v1")
public class CovidTrackerController {

    @Autowired
    CovidTrackerService covidTrackerService;

    @GetMapping("/state")
    ResponseEntity<Object> dataByState(@RequestParam String state){
        return new ResponseEntity<Object>(covidTrackerService.findByState(state), HttpStatus.OK);
    }

    @GetMapping()
    ResponseEntity<Object> allData(){
        return new ResponseEntity<Object>(covidTrackerService.getAllData(), HttpStatus.OK);
    }
}
