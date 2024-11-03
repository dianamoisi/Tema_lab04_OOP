public class Biblioteca {
    private Carte[] rafturi;
    private int nrCarti;

    public Biblioteca() {
        rafturi = new Carte[20];
        nrCarti = 0;
    }

    public void adaugaCarti(Carte carte) {
        if(nrCarti > rafturi.length) {
            maresteBiblioteca();
        }
        rafturi[nrCarti] = carte;
        nrCarti++;
        System.out.println("Cartea :" + carte.getTitlu() + " " + carte.getAutor()+ " a fost adaugata");
    }

    private void maresteBiblioteca() {
        Carte[] aux = new Carte[rafturi.length + 10];
        for(int i = 0; i < rafturi.length; i++) {
            aux[i] = rafturi[i];
        }
        rafturi = aux;
    }

    public void imprumutaOCarte_id(int id) {
        for(int i = 0; i < nrCarti; i++) {
            if(rafturi[i].getId() == id) {
                if(rafturi[i].getDisponibila()) {
                    rafturi[i].seteazaStatusCarte(false);
                    System.out.println("Cartea cu id-ul : " + rafturi[i].getId() +" a fost imprumutata");
                } else {
                    System.out.println("Cartea cautata nu este disponibila");
                }
            }
        }
    }

    public void imprumutaOCarte_Nume_Autor(String titlu, String autor) {
        for(int i = 0; i < nrCarti; i++) {
            if((rafturi[i].getTitlu() == titlu) && (rafturi[i].getAutor() == autor)) {
                if(rafturi[i].getDisponibila()) {
                    rafturi[i].seteazaStatusCarte(false);
                    System.out.println("Cartea cu id-ul : " + rafturi[i].getId() +" a fost imprumutata");
                } else {
                    System.out.println("Cartea cautata nu este disponibila");
                }
            }
        }
    }
    public void returneazaCarte_id(int id) {
        for(int i = 0; i < nrCarti; i++) {
            if(rafturi[i].getId() == id) {
                if(!rafturi[i].getDisponibila()) {
                    rafturi[i].seteazaStatusCarte(true);
                    System.out.println("Cartea cu id-ul : " + rafturi[i].getId() +" a fost returnata");
                } else {
                    System.out.println("Cartea cautata nu a fost imprumutata");
                }
            }
        }
    }

    public void returneazaCarte_Titlu_Autor(String titlu, String autor) {
        for(int i = 0; i < nrCarti; i++) {
            if((rafturi[i].getTitlu() == titlu) && (rafturi[i].getAutor() == autor)) {
                if(!rafturi[i].getDisponibila()) {
                    rafturi[i].seteazaStatusCarte(true);
                    System.out.println("Cartea cu id-ul : " + rafturi[i].getId() +" a fost returnata");
                } else {
                    System.out.println("Cartea cautata nu a fost imprumutata");
                }
            }
        }
    }

    public void afiseazaCartile() {
        System.out.println("Cartile din biblioteca sunt : ");
        for (int i = 0; i < nrCarti; i++) {
            System.out.println(rafturi[i].toString());
        }
    }

}
