package com.adaming.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.adaming.entities.CompteCourant;
import com.adaming.services.ICCService;

@RestController
public class CCController {
	
	@Autowired
	private ICCService ccServ;
	
	@GetMapping(value = "/cc")
	public List<CompteCourant> getAll() {
		return ccServ.getAll();
	}

	@GetMapping(value = "/cc/{pId}")
	public CompteCourant findOne(@PathVariable(value = "pId")Long id) {
		return ccServ.findOne(id);
	}

	@PostMapping(value = "/cc")
	public CompteCourant save(@RequestBody CompteCourant ccIn) {
		return ccServ.save(ccIn);
	}

	@DeleteMapping(value = "cc/{pId}")
	public void delete(@PathVariable(value = "pId")Long id) {
		ccServ.delete(id);
	}
	
	@PutMapping(value = "cc/{pId}")
	public CompteCourant update(@PathVariable(value = "pId") Long id,@RequestBody CompteCourant ccIn) {
		CompteCourant ccOut = ccServ.findOne(id);
		
		ccOut.setDateCreation(ccIn.getDateCreation());
		ccOut.setDecouvert(ccIn.getDecouvert());
		ccOut.setSolde(ccIn.getSolde());
		ccOut.setUtilisateur(ccIn.getUtilisateur());
		
		return ccOut;
	}

}
