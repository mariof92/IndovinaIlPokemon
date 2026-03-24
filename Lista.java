package IndovinaIlPokemon;

import java.util.ArrayList;
import java.util.Random;

public class Lista {
    ArrayList <Pokemon> pokemon = new ArrayList<>();

    public void caricaPokemonInLista() {
        pokemon.add(new Pokemon("Pikachu", "Elettro", 1));
        pokemon.add(new Pokemon("Cyndaquil", "Fuoco", 2));
        pokemon.add(new Pokemon("Mudkip", "Acqua", 3));
        pokemon.add(new Pokemon("Dragonite", "Drago", 1));
        pokemon.add(new Pokemon("Makuhita", "Lotta", 3));
        pokemon.add(new Pokemon("Houndour", "Buio", 2));
        pokemon.add(new Pokemon("Bulbasaur", "Erba", 1));
        pokemon.add(new Pokemon("Rayquaza", "Drago", 3));
        pokemon.add(new Pokemon("Umbreon", "Buio", 2));
        pokemon.add(new Pokemon("Suicune", "Acqua", 2));
        pokemon.add(new Pokemon("Pidgey", "Volante", 1));
        pokemon.add(new Pokemon("Hoppip", "Erba", 2));
        pokemon.add(new Pokemon("Poliwag", "Acqua", 1));
        pokemon.add(new Pokemon("Mareep", "Elettro", 2));
        pokemon.add(new Pokemon("Torkoal", "Fuoco", 3));
        pokemon.add(new Pokemon("Hoothoot", "Volante", 2));
        pokemon.add(new Pokemon("Hitmonchan", "Lotta", 1));
    }

    public Pokemon pokemonCasuale() {
        Random random = new Random();
        int indice = random.nextInt(pokemon.size());
        Pokemon scelto = pokemon.get(indice);
        return scelto;
    }
}
