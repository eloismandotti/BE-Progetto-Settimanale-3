package biblioteca;

import java.time.LocalDate;

import biblioteca.user.Prestito;
import biblioteca.user.User;
import bibliotecadao.ElementoDao;
import bibliotecadao.PrestitoDao;
import bibliotecadao.UserDao;

public class Archivio {

	public static void main(String[] args) {
		//lista di libri 
		libroElementoBiblioteca libro1 = new libroElementoBiblioteca("123abc", "Come frodare il fisco", 2008, 670, "biografia", "Teo Truffalfini");
		libroElementoBiblioteca libro2 = new libroElementoBiblioteca("456def", "Come organizzare un buon openday", 2018, 550, "saggio", "Elia Sandrelli");
		libroElementoBiblioteca libro3 = new libroElementoBiblioteca("789ghi", "I fiori del Male", 1857, 890, "poesia", "Charles Baudelaire");
		
		
		
		//lista delle riviste
		rivistaElementoBiblioteca rivista1 = new rivistaElementoBiblioteca("123abc", "I migliori panini imbottiti del mese", 2022, 75, Periodicita.mensile);
		rivistaElementoBiblioteca rivista2 = new rivistaElementoBiblioteca("456scc", "La sciopeta: il settimanale dei cacciatori veneti", 2022, 75, Periodicita.settimanale);
	    ElementoDao elementodao = new ElementoDao();
		
		elementodao.inserisci(libro1);
		elementodao.inserisci(libro2);
		elementodao.inserisci(libro3);
		elementodao.inserisci(rivista1);
		elementodao.inserisci(rivista2);
		
		User utente1 = new User("Giovanni", "Rossi", 55, 6464);
		User utente2 = new User("Pietro", "Verdi", 35, 9009);
		User utente3 = new User("Erika", "Bianchi", 19, 8118);
		
		Prestito prestito1 = new Prestito(utente3, rivista2, LocalDate.of(2022, 6, 20), null);
		Prestito prestito2 = new Prestito(utente3, libro1, LocalDate.of(2022, 7, 20), null);
		Prestito prestito3 = new Prestito(utente3, rivista1, LocalDate.of(2022, 7, 23), LocalDate.of(2022, 8, 07));
		UserDao userdao = new UserDao();
		userdao.inserisci(utente1);
		userdao.inserisci(utente2);
		userdao.inserisci(utente3);
        PrestitoDao prestitodao = new PrestitoDao();
		prestitodao.inserisci(prestito1);
		prestitodao.inserisci(prestito2);
		prestitodao.inserisci(prestito3);
		
		
		
		
		//utenteDao.searchbyNameT(9999);
		
		userdao.searchbyNameT(6464);
		userdao.searchbyNameT(9009);
		userdao.searchbyNameT(8118);
		prestitoDao.recuperadaid(prestito3);
		System.out.println("@@@@@@@@@@@@@@@@@@#######################@@@@@@@@@@@@@@@@@@@@@@");
	
	}
	 
	

}
