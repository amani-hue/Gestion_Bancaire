package tn.esprit.entities;

import java.util.Date;




import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Facture {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int numFacture;
	 private Date datePaiement;
	 private Date dateFacture;
	 
	public Facture() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	@ManyToOne
	private Client client;

	

	public int getNumFacture() {
		return numFacture;
	}


	public void setNumFacture(int numFacture) {
		this.numFacture = numFacture;
	}


	public Date getDatePaiement() {
		return datePaiement;
	}


	public void setDatePaiement(Date datePaiement) {
		this.datePaiement = datePaiement;
	}


	public Date getDateFacture() {
		return dateFacture;
	}


	public void setDateFacture(Date dateFacture) {
		this.dateFacture = dateFacture;
	}
	
	
	
	
	 
}
