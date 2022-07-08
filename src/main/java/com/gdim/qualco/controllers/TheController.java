package com.gdim.qualco.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gdim.qualco.dao.ContinentsRepository;
import com.gdim.qualco.dao.CountryLanguagesRepository;
import com.gdim.qualco.dao.CountryStatsRepository;
import com.gdim.qualco.dao.GuestsRepository;
import com.gdim.qualco.dao.LanguagesRepository;
import com.gdim.qualco.dao.RegionsRepository;
import com.gdim.qualco.entity.Continents;
import com.gdim.qualco.entity.CountryLanguages;
import com.gdim.qualco.entity.CountryStats;
import com.gdim.qualco.entity.Guests;
import com.gdim.qualco.entity.Languages;
import com.gdim.qualco.entity.Regions;

@RestController
@RequestMapping("/home")
public class TheController {
	
	@Autowired
	ContinentsRepository con;
	
	@Autowired
	GuestsRepository gue;
	
	@Autowired
	RegionsRepository reg;
	
	@Autowired
	CountryStatsRepository cor;
	
	@Autowired
	CountryLanguagesRepository cla;
	
	@Autowired
	LanguagesRepository lar;

	
	@GetMapping("/continents")
	public List<Continents> getContinents() {
		return con.findAll();
	}
	
	@GetMapping("/guests")
	public List<Guests> getGuests() {
		return gue.findAll();
	}
	
	@GetMapping("/regions")
	public List<Regions> getRegions() {
		return reg.findAll();
	}
	
	@GetMapping("/stats")
	public List<CountryStats> getStats() {
		return cor.findAll();
	}
	
	@GetMapping("/con-languages")
	public List<CountryLanguages> getLans() {
		return cla.findAll();
	}
	
	@GetMapping("/languages")
	public List<Languages> getLanguages() {
		return lar.findAll();
	}
	
	

	
	
	

}
