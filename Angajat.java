package com.model;

public abstract class Angajat {
    private String nume;
    private String prenume;
    private Beneficii beneficii;
    private Double salar;

    public Angajat() {
    }

    public Angajat(String nume, String prenume, Beneficii beneficii, Double salar) {
        this.nume = nume;
        this.prenume = prenume;
        this.beneficii = beneficii;
        this.salar = salar;
    }


}
