package com.model;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static private AngajatService angajati;
    static private CVService cvuri;


    public static void main(String[] args) {


        angajati = new AngajatService();
        cvuri = new CVService();

        List<Angajat> totiAngajatii = angajati.getListaAngajati();
        for (Angajat obiect:totiAngajatii){
            System.out.println(obiect);
        }


        List<CV> toateCVurile = cvuri.getListaCV();
        System.out.println(toateCVurile);



    }


}
