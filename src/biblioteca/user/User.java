package biblioteca.user;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class User {
@ManyToOne
	private ArrayList<Prestito> prestiti= new ArrayList<>();
	private String nome;
	private String cognome;
	private int eta;
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int numeroTessera;
	
	public User(String nome, String cognome, int eta, int numeroTessera) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
		this.numeroTessera = numeroTessera;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public int getEta() {
		return eta;
	}
	public void setEta(int eta) {
		this.eta = eta;
	}
	public int getNumeroTessera() {
		return numeroTessera;
	}
	public void setNumeroTessera(int numeroTessera) {
		this.numeroTessera = numeroTessera;
	}
	
	
}
