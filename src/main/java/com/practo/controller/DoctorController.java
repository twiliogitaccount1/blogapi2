package com.practo.controller;

import com.practo.entity.Doctor;
import com.practo.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctors")
public class DoctorController {

    private final DoctorService doctorService;

    @Autowired
    public DoctorController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

     // to save doctor
    @PostMapping("/add")
    public ResponseEntity<Doctor> addDoctor(@RequestBody Doctor doctor)
    {

     Doctor savedDoctor =   doctorService.addDoctor(doctor);

     return new ResponseEntity<>(savedDoctor , HttpStatus.CREATED);
    }

    //to find doctor by name or specialization

    @GetMapping("/search")
    public List<Doctor> searchDoctors(@RequestParam String search)
    {
       return doctorService.searchByNameOrSpecialization(search);
    }




}