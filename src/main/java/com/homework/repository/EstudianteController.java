package com.homework.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.homework.repository.EstudianteRepository;

@RestController
public class EstudianteController {

	@Autowired
	private EstudianteRepository estudianteRepository; 
	
}

