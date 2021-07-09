package com.demo.santosh.controller;

import com.demo.santosh.entity.Vaccination;
import com.demo.santosh.service.VaccinationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vaccination")
public class VaccinationController {

    @Autowired
    private VaccinationService vaccinationService;

    @PostMapping("/")
    public Vaccination saveData(@RequestBody Vaccination vaccination)
    {
        return vaccinationService.saveData(vaccination);
    }


    @PutMapping("/")
    public Vaccination updateData(@RequestBody Vaccination vaccination)
    {
        return vaccinationService.updateData(vaccination);
    }


    @DeleteMapping("/{vaccinationId}")
    public void deleteData(@PathVariable("vaccinationId") Integer vaccinationId)
    {
        vaccinationService.deleteData(vaccinationId);
    }

    @GetMapping("/")
    public List<Vaccination> getAllVaccinationData(){

        return vaccinationService.getAllData();
    }
}
