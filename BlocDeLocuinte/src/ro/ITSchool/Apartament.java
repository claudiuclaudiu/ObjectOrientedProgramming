package ro.ITSchool;

public class Apartament {
    private int numarApartament;
    private String numeFamilie;

    public Apartament(int numarApartament, String numeFamilie) {
        this.numarApartament = numarApartament;
        this.numeFamilie = numeFamilie;
    }
    /**
     * Metoda de afisare a unui apartament in formatul: ||<numarApartament>.<numaFamilie>||
     */
    public void afiseazaApartament() {
        System.out.print( "||"  + numarApartament + "." + numeFamilie + "|| ");
    }
}
