package com.model;

import java.util.ArrayList;
import java.util.List;

public class AngajatService {
    List<Angajat> listaAngajati = new ArrayList<>();

    public AngajatService(){
        init();
    }

    Beneficii complet = new Beneficii(10, true, true, 21);
    Beneficii partial = new Beneficii(10,false, true,21);
    Beneficii extra = new Beneficii(15, true, true, 24);

    public void init(){
        Angajat EduardGherman = new Angajat("Gherman", "Eduard", Functie.Analist, partial , 5000.00);
        Angajat SilvanaGherman = new Angajat("Gherman", "Silvana", Functie.Manager, extra , 6000.00);
        Angajat MariusBalanuca = new Angajat("Balanuca", "Marius", Functie.Consultant, complet , 9000.00);
        Angajat GeorgianaBalanuca = new Angajat("Balanuca", "Georgiana", Functie.HR, extra , 5000.00);

        listaAngajati.add(EduardGherman);
        listaAngajati.add(SilvanaGherman);
        listaAngajati.add(MariusBalanuca);
        listaAngajati.add(GeorgianaBalanuca);

    }

    public List<Angajat> getListaAngajati(){return listaAngajati;}

}
