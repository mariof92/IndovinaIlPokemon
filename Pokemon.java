package IndovinaIlPokemon;

public class Pokemon {
    private String nome;
    private String tipo;
    private int generazione;

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public int getGenerazione() {
        return generazione;
    }

    public Pokemon(String nome, String tipo, int generazione) {
        this.nome = nome;
        this.tipo = tipo;
        this.generazione = generazione;
    }
}
