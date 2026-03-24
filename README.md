# Indovina Il Pokemon
Semplice gioco creato per prendere confidenza nel creare progetti su Java.
L'obiettivo del gioco è indovinare un Pokémon da una lista già compilata.

## Come funziona il gioco
- All'avvio viene scelto un Pokémon casuale
- Il giocatore ha 5 tentativi per indovinarlo
- Dopo ogni errore il gioco da una serie di suggerimenti basati su:
  - Tipo del Pokémon
  - Generazione del Pokémon
  - Prima lettera del nome del Pokémon
- Se il giocatore indovina allora vince, se sbaglia tutti i tentativi il gioco da la soluzione

## Struttura del progetto
- Classe Pokémon: rappresenta il Pokémon con nome, tipo e generazione
- Classe Lista: contiene la lista dei Pokémon che prendono parte al gioco
- Classe Gioco: contiene la logica del gioco, cioè scelta casuale, tentativi e suggerimenti
- Classe Main: contiene l'oggetto gioco e il metodo avvia per avviare il gioco

## Concetti OOP utilizzati
- Classi e oggetti
- Incapsulamento (attributi privati + metodi pubblici)
- Collezioni (ArrayList)
- Generazione casuale (Random)
- Controllo del flusso (for, if, switch)

## Come eseguirlo
1. Clona il repository  
   ```bash
   git clone https://github.com/mariof92/IndovinaIlPokemon
   ```
Apri il progetto in IntelliJ o VS Code
Esegui la classe Main
