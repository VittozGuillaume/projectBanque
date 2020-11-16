package com.adaming.services;

import java.util.List;

import com.adaming.entities.CompteEpargne;

public interface ICEService {
	
	List<CompteEpargne> getAll();
	CompteEpargne findOne(Long id);
	CompteEpargne save(CompteEpargne ceIn);
	void delete(Long id);

}
