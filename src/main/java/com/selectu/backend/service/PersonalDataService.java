package com.selectu.backend.service;
import com.selectu.backend.model.PersonalData;
import com.selectu.backend.repository.PersonalDataRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonalDataService {


    private final PersonalDataRepository repository;

    public PersonalDataService(PersonalDataRepository repository) {
        this.repository = repository;
    }

    public PersonalData guardar(PersonalData personalData) {  //método Guardar
        return repository.save(personalData);
    }

    public List<PersonalData> mostrarTodos() {
        return repository.findAll();
    }
}