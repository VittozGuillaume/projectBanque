package com.adaming.services;

import java.util.List;

import com.adaming.entities.CompteCourant;

public interface ICCService {

	List<CompteCourant> getAll();
	CompteCourant findOne(Long id);
	CompteCourant save(CompteCourant ccIn);
	void delete(Long id);
	
}
