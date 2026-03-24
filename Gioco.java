package IndovinaIlPokemon;

import java.util.Scanner;

public class Gioco {
    private Lista lista; //riferimento alla classe Lista
    private Pokemon daIndovinare;
    private int numeroTentativi = 5;

    public Gioco() {
        lista = new Lista();              // 1) creo la lista
        lista.caricaPokemonInLista();     // 2) la riempio
        daIndovinare = lista.pokemonCasuale(); // 3) prendo il Pokémon casuale
    }

    public void avvia() {
        Scanner scanner = new Scanner(System.in);

        for (int tentativo = 1; tentativo <= numeroTentativi; tentativo++) {
            System.out.println("Indovina il Pokémon tra questi:");
            System.out.println("Pikachu, Cyndaquil, Mudkip, Dragonite, Makuhita, Houndour," +
                    " Bulbasaur, Rayquaza, Umbreon, \nSuicune, Pidgey, Hoppip, Poliwag, Mareep, " +
                    "Torkoal, Hoothoot, Hitmonchan");


            String risposta = scanner.nextLine();

            if (risposta.equalsIgnoreCase(daIndovinare.getNome())) {
                System.out.println("Indovinato");
                return;
            } else {
                System.out.println("Sbagliato");
                mostraSuggerimento(tentativo);
            }

            System.out.println("Hai finito i tentativi, il Pokémon da indovinare era: " + daIndovinare.getNome());
        }
    }

    public void mostraSuggerimento(int tentativo) {
        switch (tentativo) {
            case 1:
                System.out.println("Suggerimento: il tipo del Pokémon da indovinare è: " + daIndovinare.getTipo());
                break;
            case 2:
                System.out.println("Suggerimento: la generazione del Pokémon da indovinare è: " + daIndovinare.getGenerazione());
                break;
            case 3:
                System.out.println("Suggerimento: il nome del Pokémon da indovinare inizia con: " + daIndovinare.getNome().charAt(0));
                break;
        }
    }

}
