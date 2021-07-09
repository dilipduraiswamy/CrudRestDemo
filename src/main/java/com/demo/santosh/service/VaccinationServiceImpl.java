package com.demo.santosh.service;

import com.demo.santosh.entity.Vaccination;
import com.demo.santosh.repo.VaccinationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VaccinationServiceImpl implements VaccinationService{

    @Autowired
    VaccinationRepo vaccinationRepo;

    @Override
    public Vaccination saveData(Vaccination vaccination) {
        return vaccinationRepo.save(vaccination);
    }

    @Override
    public Vaccination updateData(Vaccination vaccination) {
        if(vaccination.getId()!=null)
        return vaccinationRepo.save(vaccination);
        else
            return null;
    }

    @Override
    public void deleteData(Integer vaccinationId) {
        Optional<Vaccination> vaccinationOptional= vaccinationRepo.findById(vaccinationId);
        if(vaccinationOptional.isPresent())
        {
            vaccinationRepo.delete(vaccinationOptional.get());
        }
    }

    @Override
    public List<Vaccination> getAllData() {
        return (List<Vaccination>) vaccinationRepo.findAll();
    }
}
