package com.codeclan.example.WhiskyTracker.controllers;

import com.codeclan.example.WhiskyTracker.models.Whisky;
import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository.WhiskyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/whiskies")
public class WhiskyController {
    @Autowired
    WhiskyRepository whiskyRepository;
    @GetMapping(value = "/year/{year}")
    public List<Whisky> findByYear(@PathVariable int year){
        return whiskyRepository.findWhiskyByYear(year);
    }
    @GetMapping(value= "/Distillery/named/{named}/age/{age}")
    public List<Whisky> findParticularDistilleryAgeWhisky(@PathVariable String named ,  int age) {
    return  whiskyRepository.findWhiskyOfParticularDistilleryAge(named ,age);
    }
}
