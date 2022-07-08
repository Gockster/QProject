package com.gdim.qualco.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gdim.qualco.dao.CountriesRepository;
import com.gdim.qualco.entity.Countries;

@RestController
@RequestMapping("/home")
public class CountriesController {
	
	@Autowired
	CountriesRepository cre;
	
	@GetMapping("/countries")
	public List<Countries> getCountries() {
		return cre.findAll();
	}

}
