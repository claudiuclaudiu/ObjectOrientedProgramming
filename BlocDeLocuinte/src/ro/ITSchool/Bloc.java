package ro.ITSchool;

import java.util.ArrayList;
import java.util.List;

public class Bloc {
    private String numarBloc;
    private List<Etaj> etaje;

    public Bloc(String numarBloc) {
        this.numarBloc = numarBloc;
        this.etaje = new ArrayList<>();
    }

    /**
     * Metoda de a adauga un nou etaj pentru bloc
     *
     * @param etaj etajul nou al blocului
     */

    public void adaugaEtaj(Etaj etaj) {
        this.etaje.add(etaj);
    }
    /**
     * Afisarea unui bloc
     */

    public void afiseazaBloc(){
        // afisam numarul blocului

        System.out.println(numarBloc);
        //parcurgem lista de etaje si il afisam pe fiecare in parte apeland metoda de afisare
        for(Etaj e: etaje){
            e.afiseazaEtaj();
        }

    }
}

