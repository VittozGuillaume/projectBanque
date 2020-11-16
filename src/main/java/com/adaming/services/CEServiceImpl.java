package com.adaming.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adaming.entities.CompteEpargne;
import com.adaming.repositories.CompteEpargneRepository;

@Service
public class CEServiceImpl implements ICEService{

	@Autowired
	private CompteEpargneRepository ceRep;
	
	@Override
	public List<CompteEpargne> getAll() {
		return ceRep.findAll();
	}

	@Override
	public CompteEpargne findOne(Long id) {
		return ceRep.findById(id).get();
	}

	@Override
	public CompteEpargne save(CompteEpargne ceIn) {
		return ceRep.save(ceIn);
	}

	@Override
	public void delete(Long id) {
		ceRep.deleteById(id);
	}

}
