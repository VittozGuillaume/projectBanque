package com.adaming.entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("courant")
public class CompteCourant extends Compte{

	private static final long serialVersionUID = 1L;
	
	private double decouvert;
	
	

	public CompteCourant() {
		super();
	}
	
	

	public CompteCourant(Date dateCreation, double solde, double decouvert) {
		super(dateCreation, solde);
		this.decouvert = decouvert;
	}
	
	
	public CompteCourant(Long idCompte, Date dateCreation, double solde, double decouvert) {
		super(idCompte, dateCreation, solde);
		this.decouvert = decouvert;
	}

	public double getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}

}
