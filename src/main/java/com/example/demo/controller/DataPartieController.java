package com.example.demo.controller;

import com.example.demo.entities.DataPartie;
import com.example.demo.entities.Plaint;
import com.example.demo.service.DataPartieService;
import com.example.demo.service.PlaintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DataPartieControler {

    @Autowired
    private DataPartieService dataPartieService;

    //Get all Data
    @GetMapping("/dataPartie")
    public List<DataPartie> findAllDataPartie() {
        return dataPartieService.getDataPartie();
    }
    // Get Data By ID
    @GetMapping("/dataPartieById/{id}")
    public DataPartie findDataPartieById(@PathVariable int id) {
        return dataPartieService.getDataPartieByid(id);
    }


    // POST
    // Post one object
    @PostMapping("/addDataPartie")
    public DataPartie addDataPartie(@RequestBody DataPartie dataPartie) {
        return (DataPartie) dataPartieService.saveDataPartie(dataPartie);
    }

    // Post a list of DataPartie
    @PostMapping("/addDataPaetie")
    public List<DataPartie> addDataPartie(@RequestBody List<DataPartie> dataPartie) {
        return dataPartieService.saveDataPartie(dataPartie);
    }


    // Update
    @PutMapping("/updateDataPartie")
    public DataPartie updateDataPartie(@RequestBody DataPartie dataPartie) {
        return dataPartieService.updateDataPartie(dataPartie);
    }

    // Delete
    @DeleteMapping("/deletePlaint/{id}")
    public String deletePlaint(@PathVariable int id) {
        return dataPartieService.deleteDataPartie(id);
    }

}





