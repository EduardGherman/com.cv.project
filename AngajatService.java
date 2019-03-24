package com.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class AngajatService {

    List<Angajat> listaAngajati = new ArrayList<>();


    public AngajatService(){

        init();

    }

    Beneficii complet = new Beneficii(10, true, true, 21);
    Beneficii partial = new Beneficii(10,false, true,21);
    Beneficii extra = new Beneficii(15, true, true, 24);

    public void init(){
        Developer EduardGherman = new Developer("Gherman", "Eduard",  partial , 5000.00);
        HumanResources SilvanaGherman = new HumanResources("Gherman", "Silvana",  extra , 6000.00);
        Developer MariusBalanuca = new Developer("Balanuca", "Marius",  complet , 9000.00);
        Manager GeorgianaBalanuca = new Manager("Balanuca", "Georgiana",  extra , 5000.00);
        Manager AndreeaPahantu = new Manager("Pahontu", "Andreea",  extra , 9000.00);
        Developer MihaiRosca = new Developer("Rosca", "Mihai",  extra , 7000.00);

        listaAngajati.add(EduardGherman);
        listaAngajati.add(SilvanaGherman);
        listaAngajati.add(MariusBalanuca);
        listaAngajati.add(GeorgianaBalanuca);
        listaAngajati.add(AndreeaPahantu);
        listaAngajati.add(MihaiRosca);


    }

    public List<Angajat> getListaAngajati(){return listaAngajati;}

}
