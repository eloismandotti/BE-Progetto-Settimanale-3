package biblioteca;

import javax.persistence.Entity;

@Entity
public class rivistaElementoBiblioteca extends ElementoBiblioteca{
	
	private Periodicita periodicita; //tipizzazione di periodicita

	public rivistaElementoBiblioteca(String codIsbn, String titolo, int annoPubblicazione, int numPagg, Periodicita periodicita) {
		super(codIsbn, titolo, annoPubblicazione, numPagg);
		this.periodicita = periodicita;
	}

	public Periodicita getPeriodicita() {
		return periodicita;
	}

	public void setPeriodicita(Periodicita periodicita) {
		this.periodicita = periodicita;
	}

	@Override
	public String toString() {
		return "Rivista [periodicita=" + periodicita + ", toString()=" + super.toString() + "]";
	}

}
