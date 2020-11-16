package com.adaming.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adaming.entities.CompteCourant;
import com.adaming.repositories.CompteCourantRepository;

@Service
public class CCServiceImpl implements ICCService {

	@Autowired
	private CompteCourantRepository ccRep;

	@Override
	public List<CompteCourant> getAll() {
		return ccRep.findAll();
	}

	@Override
	public CompteCourant findOne(Long id) {
		return ccRep.getOne(id);
	}

	@Override
	public CompteCourant save(CompteCourant ccIn) {
		return ccRep.save(ccIn);
	}

	@Override
	public void delete(Long id) {
		ccRep.deleteById(id);
	}

}
