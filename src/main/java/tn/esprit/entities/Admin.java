package tn.esprit.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Admin {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idAdmin;
	private String nomAdmin;
	private String prenomAdmin;
	private String loginAdmin;
	private String passwordAdmin;
	private int telAdmin;
	private String emailAdmin;
	
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Client> client;
	
	
	
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getIdAdmin() {
		return idAdmin;
	}
	public void setIdAdmin(long idAdmin) {
		this.idAdmin = idAdmin;
	}
	public String getNomAdmin() {
		return nomAdmin;
	}
	public void setNomAdmin(String nomAdmin) {
		this.nomAdmin = nomAdmin;
	}
	public String getPrenomAdmin() {
		return prenomAdmin;
	}
	public void setPrenomAdmin(String prenomAdmin) {
		this.prenomAdmin = prenomAdmin;
	}
	public String getLoginAdmin() {
		return loginAdmin;
	}
	public void setLoginAdmin(String loginAdmin) {
		this.loginAdmin = loginAdmin;
	}
	public String getPasswordAdmin() {
		return passwordAdmin;
	}
	public void setPasswordAdmin(String passwordAdmin) {
		this.passwordAdmin = passwordAdmin;
	}
	public int getTelAdmin() {
		return telAdmin;
	}
	public void setTelAdmin(int telAdmin) {
		this.telAdmin = telAdmin;
	}
	public String getEmailAdmin() {
		return emailAdmin;
	}
	public void setEmailAdmin(String emailAdmin) {
		this.emailAdmin = emailAdmin;
	}
	public List<Client> getClient() {
		return client;
	}
	public void setClient(List<Client> client) {
		this.client = client;
	}

	
	
	
}
