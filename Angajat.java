package com.model;

public class Angajat {
    private String nume;
    private String prenume;
    private Functie functie;
    private Beneficii beneficii;
    private Double salar;

    public Angajat() {
    }

    public Angajat(String nume, String prenume, Functie functie, Beneficii beneficii, Double salar) {
        this.nume = nume;
        this.prenume = prenume;
        this.functie = functie;
        this.beneficii = beneficii;
        this.salar = salar;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public Functie getFunctie() {
        return functie;
    }

    public void setFunctie(Functie functie) {
        this.functie = functie;
    }

    public Beneficii getBeneficii() {
        return beneficii;
    }

    public void setBeneficii(Beneficii beneficii) {
        this.beneficii = beneficii;
    }

    public Double getSalar() {
        return salar;
    }

    public void setSalar(Double salar) {
        this.salar = salar;
    }

    @Override
    public String toString() {
        return "Angajat{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", functie=" + functie +
                ", beneficii=" + beneficii +
                ", salar=" + salar +
                '}';
    }
}
