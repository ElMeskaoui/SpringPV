package com.example.demo.service;

import com.example.demo.entities.TypePlaints;
import com.example.demo.repository.TypePlaintsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypePlaintsService {

    @Autowired
    private TypePlaintsRepository typePlaintsRepository;

    // GET methods

    public List<TypePlaints> getTypePlaints() {
        return typePlaintsRepository.findAll();
    }

    public TypePlaints getTypePlaintsById(int id) {
        return typePlaintsRepository.findById(id).orElse(null);
    }

    public TypePlaints getTypePlaintsByName(String name) {
        return typePlaintsRepository.findByName(name);
    }


    //POST methods
    //Save type plaint
    public TypePlaints saveTypePlaints(TypePlaints typePlaints) {
       return typePlaintsRepository.save(typePlaints);
    }


    // Save a list of TypePlaints
    public List<TypePlaints> saveTypesPlaints(List<TypePlaints> typePlaints) {
        return typePlaintsRepository.saveAll(typePlaints);
    }


    // Delete method
    public String deleteTypePlaints(int id) {
        typePlaintsRepository.deleteById(id);
        return "type plaint removed !! " + id;
    }

    // Update method
    public TypePlaints updateTypePlaints(TypePlaints typePlaints) {
        TypePlaints existingTypePlaints = typePlaintsRepository.findById(typePlaints.getId()).orElse(null);
        existingTypePlaints.setName(typePlaints.getName());
        return typePlaintsRepository.save(existingTypePlaints);
    }
}
