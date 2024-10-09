package org.lessons.java.snack;

public class RegistroStudenti {

    // creazione array privato
    private Studente[] studenti;
    // Contatore per gli studenti che aggiungiamo
    private int numeroStudenti;

    // Costruttore senza parametri con il quale inizializzo il registro vuoto
    public RegistroStudenti() {
        this.studenti = new Studente[3]; // Definisco la grandezza max dell'array
        this.numeroStudenti = 0; // Partiamo da 0 perchè vuoto
    }

    // Metodo per aggiungere uno studente al registro
    public void aggiungiStudente(Studente studente) {
        if (numeroStudenti < studenti.length) {
            studenti[numeroStudenti] = studente;
            numeroStudenti++;
        } else {
            System.out.println("Mi dispiace il registro è pieno!");
        }
    }

    // Metodo per stampare l'array contenente gli studenti
    public void stampaStudenti() {
        System.out.println("Elenco degli studenti:");
        for (int i = 0; i < numeroStudenti; i++) {
            System.out.println(studenti[i]);
        }
    }
}
