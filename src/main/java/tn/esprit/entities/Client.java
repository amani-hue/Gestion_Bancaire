package tn.esprit.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Client  {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private long idClient;
	private String nomClient;
	private String prenomClient;
	private int cin;
	private Date dateDeNaissance;
	private int telephone;
	private String email;
	private String adresseClient;
	@Enumerated(EnumType.STRING)
	private TypeClient type ;
	
	@OneToOne(mappedBy="client")
	private Credit credit;
	
	@OneToMany(mappedBy="client")
	private List<Reclamation> reclamation;
	
	@ManyToMany(mappedBy="client")
	private List<Intervention> intervention;

	
	@OneToMany(mappedBy="client")
	private List<Facture> factures;
	
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public long getIdClient() {
		return idClient;
	}
	public void setIdClient(long idClient) {
		this.idClient = idClient;
	}
	public String getNomClient() {
		return nomClient;
	}
	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}
	public String getPrenomClient() {
		return prenomClient;
	}
	public void setPrenomClient(String prenomClient) {
		this.prenomClient = prenomClient;
	}
	public int getCin() {
		return cin;
	}
	public void setCin(int cin) {
		this.cin = cin;
	}
	public Date getDateDeNaissance() {
		return dateDeNaissance;
	}
	public void setDateDeNaissance(Date dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}
	public int getTel() {
		return telephone;
	}
	public void setTel(int tel) {
		this.telephone = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAdresseClient() {
		return adresseClient;
	}
	public void setAdresseClient(String adresseClient) {
		this.adresseClient = adresseClient;
	}
	
}
