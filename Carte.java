public class Carte {
    private int id;
    private String titlu;
    private String autor;
    private boolean disponibila;

    public Carte(int id, String titlu, String autor) {
        this.id = id;
        this.titlu = titlu;
        this.autor = autor;
        this.disponibila = true;
    }

    public int getId() {
        return this.id;
    }

    public String getTitlu() {
        return this.titlu;
    }

    public String getAutor() {
        return this.autor;
    }

    public boolean getDisponibila() {
        return this.disponibila;
    }

    public void seteazaStatusCarte(boolean disponibila) {
        this.disponibila = disponibila;
    }

    public String toString() {
        return "Cartea : " + this.id + " scrisa de " + this.autor + " este diponibila: " + (this.disponibila ? "da" : "nu");
    }
}
