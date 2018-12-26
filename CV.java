package com.model;

public class CV {
    private String nume;
    private String prenume;
    private Integer varsta;
    private Double experienta;
    private String domeniu;

    @Override
    public String toString() {
        return "CV{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", varsta=" + varsta +
                ", experienta=" + experienta +
                ", domeniu='" + domeniu + '\'' +
                '}';
    }

    public CV() {
    }

    public CV(String nume, String prenume, Integer varsta, Double experienta, String domeniu) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.experienta = experienta;
        this.domeniu = domeniu;
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

    public Integer getVarsta() {
        return varsta;
    }

    public void setVarsta(Integer varsta) {
        this.varsta = varsta;
    }

    public Double getExperienta() {
        return experienta;
    }

    public void setExperienta(Double experienta) {
        this.experienta = experienta;
    }

    public String getDomeniu() {
        return domeniu;
    }

    public void setDomeniu(String domeniu) {
        this.domeniu = domeniu;
    }
}
