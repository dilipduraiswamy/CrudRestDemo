package com.demo.santosh.service;

import com.demo.santosh.entity.Vaccination;

import java.util.List;

public interface VaccinationService {
    Vaccination saveData(Vaccination vaccination);

    Vaccination updateData(Vaccination vaccination);

    void deleteData(Integer vaccinationId);

    List<Vaccination> getAllData();
}
