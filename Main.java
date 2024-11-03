public class Main {
    public static void main(String[] args)
    {
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.adaugaCarti(new Carte(1, "Ion", "Liviu Rebreanu"));
        biblioteca.adaugaCarti(new Carte(2, "Baltagul", "Mihail Sadoveanu"));
        biblioteca.adaugaCarti(new Carte(3, "Morometii", "Marin Preda"));

        biblioteca.afiseazaCartile();

        biblioteca.imprumutaOCarte_id(2);
        biblioteca.imprumutaOCarte_id(3);
        biblioteca.imprumutaOCarte_Nume_Autor("Baltagul", "Mihail Sadoveanu");
        biblioteca.imprumutaOCarte_Nume_Autor("Ion", "Liviu Rebreanu");


        biblioteca.returneazaCarte_id(1);
        biblioteca.returneazaCarte_Titlu_Autor("Morometii", "Marin Preda");

        biblioteca.afiseazaCartile();
    }
}