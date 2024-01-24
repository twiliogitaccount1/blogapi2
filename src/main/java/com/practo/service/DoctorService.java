package com.practo.service;

import com.practo.entity.Doctor;
import com.practo.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {

    private final DoctorRepository doctorRepository;

    @Autowired
    public DoctorService(DoctorRepository doctorRepository)
    {
        this.doctorRepository = doctorRepository;
    }

      // to save Doctor
    public Doctor addDoctor(Doctor doctor)
    {
        return doctorRepository.save(doctor);
    }

    //to find Doctor by name or specialization

   public List<Doctor> searchByNameOrSpecialization(String search)
    {
        return doctorRepository.searchByNameOrSpecialization(search);

    }




}
