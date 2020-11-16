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

import com.adaming.entities.Utilisateur;
import com.adaming.services.IUtilisateurService;

@RestController
public class UtilisateurController {
	
	@Autowired
	private IUtilisateurService uServ;
	
	@GetMapping(value = "/users")
	public List<Utilisateur> getAll() {
		return uServ.getAll();
	}

	@GetMapping(value = "/users/{pId}")
	public Utilisateur findOne(@PathVariable(value = "pId")Long id) {
		return uServ.findOne(id);
	}

	@PostMapping(value = "/users")
	public Utilisateur save(@RequestBody Utilisateur uIn) {
		return uServ.save(uIn);
	}

	@DeleteMapping(value = "users/{pId}")
	public void delete(@PathVariable(value = "pId")Long id) {
		uServ.delete(id);
	}
	
	@PutMapping(value = "users/{pId}")
	public Utilisateur update(@PathVariable(value = "pId") Long id,@RequestBody Utilisateur uIn) {
		Utilisateur uOut = uServ.findOne(id);
		
		uOut.setNomUtilisateur(uIn.getNomUtilisateur());
		uOut.setPrenomUtilisateur(uIn.getPrenomUtilisateur());
		uOut.setComptes(uIn.getComptes());
		
		return uOut;
	}

}
