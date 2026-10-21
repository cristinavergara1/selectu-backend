package com.selectu.backend.controller;


import com.selectu.backend.model.PersonalData;
import com.selectu.backend.service.PersonalDataService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/personal-data")
@CrossOrigin(origins = "http://localhost:3000")
public class PersonalDataController {

    private final PersonalDataService personalDataService;

    public PersonalDataController(PersonalDataService personalDataService) {
        this.personalDataService = personalDataService;
    }

    @PostMapping
    public PersonalData guardar(@RequestBody PersonalData personalData) {
        return personalDataService.guardar(personalData);
    }

    @GetMapping
    public List<PersonalData> mostrarTodos(){
        return personalDataService.mostrarTodos();
    }

}