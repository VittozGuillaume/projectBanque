package com.adaming.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adaming.entities.Utilisateur;
import com.adaming.repositories.UtilisateurRepository;

@Service
public class UtilisateurServiceImpl implements IUtilisateurService{

	@Autowired
	private UtilisateurRepository uRep;
	
	@Override
	public List<Utilisateur> getAll() {
		return uRep.findAll();
	}

	@Override
	public Utilisateur findOne(Long id) {
		return uRep.findById(id).get();
	}

	@Override
	public Utilisateur save(Utilisateur uIn) {
		return uRep.save(uIn);
	}

	@Override
	public void delete(Long id) {
		uRep.deleteById(id);
	}

}
