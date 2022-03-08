package ro.ITSchool;

public class Main {

    public static void main(String[] args) {
        Bloc bloc = new Bloc("E2");
        Etaj etajul0 = new Etaj(0);
        Apartament ap1 = new Apartament(1, "fam Ionescu");

        etajul0.adaugaApartament(ap1);

        Apartament ap2 = new Apartament(2, "fam Popescu");
        etajul0.adaugaApartament(ap2);


        bloc.adaugaEtaj(etajul0);
        bloc.afiseazaBloc();



    }

}