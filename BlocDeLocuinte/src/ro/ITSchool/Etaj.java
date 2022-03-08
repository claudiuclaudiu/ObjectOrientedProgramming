package ro.ITSchool;

import java.util.ArrayList;
import java.util.List;

public class Etaj {
    private int numarEtaj;
    private List<Apartament> apartamente;

    // un etaj trebuie sa aiba mai multe apartamente,
    // nu doar unul -> folosim o lista ca se le stocam

    public Etaj(int numarEtaj) {
        this.numarEtaj = numarEtaj;
        this.apartamente = new ArrayList<>(); // putem initializa lista si mai sus dar, e mai bine daca o facem in constructor
    }

    /**
     * Metoda prin care adaugam un apartament in lista de apartamente a unui etaj
     *
     * @param ap apartamentul pe care vrem sa-l adaugam
     */
    public void adaugaApartament(Apartament ap) {
        apartamente.add(ap);
    }

    /**
     * Metoda de afisare pentru un etaj in formatul: et-<numarEtaj>:<apartamente>
     */
    public void afiseazaEtaj() {
        // afisam numarul etajului
        System.out.print("et-" + numarEtaj + ":");

        // afisam fiecare apartament de pe acest etaj parcurgand lista de apartament
        for (Apartament apartament : apartamente) {
            // apelam metoda de afisare a unui apartament ca sa respectam formatul cerut de problema
            apartament.afiseazaApartament();
        }
    }
}


