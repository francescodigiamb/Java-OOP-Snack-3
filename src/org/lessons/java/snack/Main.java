package org.lessons.java.snack;

public class Main {
	
	public static void main(String[] args) { 
		
		Studente studente1 = new Studente("Mario", "Bianchi");
		Studente studente2 = new Studente ("Giuseppe", "Rossi");
		Studente studente3 = new Studente ("Francesco", "Di Giambattista");
		
		RegistroStudenti registro = new RegistroStudenti();
		
		registro.aggiungiStudente(studente1);
		registro.aggiungiStudente(studente2);
		registro.aggiungiStudente(studente3);		
		
		registro.stampaStudenti();
		
	}
}
