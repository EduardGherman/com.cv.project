package com.model;

public class Developer extends Angajat implements Coding {

    Integer coffee;

    public Developer(String nume, String prenume, Beneficii beneficii, Double salar){
        super(nume, prenume, beneficii, salar);
    }

    @Override
    public String scrieCod() {
        return null;
    }
}
