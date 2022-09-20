package biblioteca;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class ElementoBiblioteca {
	
@Id
	private String codIsbn;
	private String titolo;
	private int annoPubblicazione;
	private int numPagg;
	
	//creo il costruttore
	public ElementoBiblioteca(String codIsbn, String titolo, int annoPubblicazione, int numPagg) {
		this.codIsbn = codIsbn;
		this.titolo = titolo;
		this.annoPubblicazione = annoPubblicazione;
		this.numPagg = numPagg;
	}
	
	//creo i getter e i setter

	public String getCodIsbn() {
		return codIsbn;
	}


	public void setCodIsbn(String codIsbn) {
		this.codIsbn = codIsbn;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public int getAnnoPubblicazione() {
		return annoPubblicazione;
	}

	public void setAnnoPubblicazione(int annoPubblicazione) {
		this.annoPubblicazione = annoPubblicazione;
	}

	public int getNumPagg() {
		return numPagg;
	}

	public void setNumPagg(int numPagg) {
		this.numPagg = numPagg;
	}
	
	//metodo che trasforma le variabili in stringhe, così che si possano leggere in console
		@Override
		public String toString() {
			return "ElementoLetterario [codIsbn=" + codIsbn + ", titolo=" + titolo + ", annoPubblicazione="
					+ annoPubblicazione + ", numPagg=" + numPagg + "]";
		}
	
		public ElementoBiblioteca() {
			super();
		}
	

}

