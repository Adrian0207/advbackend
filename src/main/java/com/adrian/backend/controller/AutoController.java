package com.adrian.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.adrian.backend.repository.AutoRepository;
import com.adrian.backend.model.Auto;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8081")//Punto de origen para habilitar el acceso de CORS
@RestController
@RequestMapping("/api")
public class AutoController {

    @Autowired
    private AutoRepository autoRepository;

    @PostMapping("/auto")
    public Auto createAuto(@RequestBody Auto auto){
        return autoRepository.save(auto);
    }

    //obtener todos los autos
    @GetMapping("/autos")
    public List<Auto> getAllAutos(){
        return autoRepository.findAll();
    }

    @GetMapping("/")
    public Auto getAuto(@RequestParam(required = false) String placa ){
        return autoRepository.findByPlaca(placa);
    }




}
