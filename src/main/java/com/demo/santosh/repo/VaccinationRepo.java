package com.demo.santosh.repo;

import com.demo.santosh.entity.Vaccination;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VaccinationRepo extends CrudRepository<Vaccination,Integer> {
}
