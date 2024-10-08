package org.lessons.java.snack;

public class Studente {

	private String nome;
	private String cognome;
	
	// Costruttore
    public Studente(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }

    // Metodo per ottenere studente in forma di stringa
    @Override
    public String toString() {
        return nome + " " + cognome;
    }
}


