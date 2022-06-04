package com.example.demo.controller;

import com.example.demo.entities.TypePlaints;
import com.example.demo.service.TypePlaintsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TypePlaintsController {

    @Autowired
    private TypePlaintsService typePlaintsService;

    //Get all types of plaints
    @GetMapping("/typeplaints")
    public List<TypePlaints> findAllTypePlaints() {
        return typePlaintsService.getTypePlaints();
    }

    @GetMapping("/typeplaintsById/{id}")
    public TypePlaints findTypePlaintsById(@PathVariable int id) {
        return typePlaintsService.getTypePlaintsById(id);
    }

    @GetMapping("/typeplaints/{name}")
    public TypePlaints findTypePlaintsByName(@PathVariable String name) {
        return typePlaintsService.getTypePlaintsByName(name);
    }

    // POST
    @PostMapping("/addTypePlaints")
    public TypePlaints addTypePlaints(@RequestBody TypePlaints typePlaints) {
        return typePlaintsService.saveTypePlaints(typePlaints);
    }

    @PostMapping("/addTypesPlaints")
    public List<TypePlaints> addProducts(@RequestBody List<TypePlaints> typePlaints) {
        return typePlaintsService.saveTypesPlaints(typePlaints);
    }


    // Update
    @PutMapping("/updateTypePlaints")
    public TypePlaints updateTypePlaints(@RequestBody TypePlaints typePlaints) {
        return typePlaintsService.updateTypePlaints(typePlaints);
    }

    @DeleteMapping("/deleteTypePlaints/{id}")
    public String deleteTypePlaints(@PathVariable int id) {
        return typePlaintsService.deleteTypePlaints(id);
    }



}
