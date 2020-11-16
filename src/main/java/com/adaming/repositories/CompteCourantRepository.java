package com.adaming.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adaming.entities.CompteCourant;

@Repository
public interface CompteCourantRepository extends JpaRepository<CompteCourant, Long>{

}
