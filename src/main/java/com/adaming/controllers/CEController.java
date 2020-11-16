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

import com.adaming.entities.CompteEpargne;
import com.adaming.services.ICEService;

@RestController
public class CEController {
	
	@Autowired
	private ICEService ceServ;
	
	@GetMapping(value = "/ce")
	public List<CompteEpargne> getAll() {
		return ceServ.getAll();
	}

	@GetMapping(value = "/ce/{pId}")
	public CompteEpargne findOne(@PathVariable(value = "pId")Long id) {
		return ceServ.findOne(id);
	}

	@PostMapping(value = "/ce")
	public CompteEpargne save(@RequestBody CompteEpargne ceIn) {
		return ceServ.save(ceIn);
	}

	@DeleteMapping(value = "ce/{pId}")
	public void delete(@PathVariable(value = "pId")Long id) {
		ceServ.delete(id);
	}
	
	@PutMapping(value = "ce/{pId}")
	public CompteEpargne update(@PathVariable(value = "pId") Long id,@RequestBody CompteEpargne ceIn) {
		CompteEpargne ceOut = ceServ.findOne(id);
		
		ceOut.setDateCreation(ceIn.getDateCreation());
		ceOut.setTaux(ceIn.getTaux());
		ceOut.setSolde(ceIn.getSolde());
		ceOut.setUtilisateur(ceIn.getUtilisateur());
		
		return ceOut;
	}

}
