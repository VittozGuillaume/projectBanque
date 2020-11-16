package com.adaming.services;

import java.util.List;

import com.adaming.entities.Utilisateur;

public interface IUtilisateurService {
	
	List<Utilisateur> getAll();
	Utilisateur findOne(Long id);
	Utilisateur save(Utilisateur uIn);
	void delete(Long id);

}
