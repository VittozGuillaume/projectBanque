package com.adaming.entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("epargne")
public class CompteEpargne extends Compte{
	

	private static final long serialVersionUID = 1L;
	
	
	private double taux;
	
	
	public CompteEpargne() {
		super();
	}

	public CompteEpargne(Date dateCreation, double solde, double taux) {
		super(dateCreation, solde);
		this.taux = taux;
	}

	public CompteEpargne(Long idCompte, Date dateCreation, double solde, double taux) {
		super(idCompte, dateCreation, solde);
		this.taux = taux;
	}

	public double getTaux() {
		return taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}

}
