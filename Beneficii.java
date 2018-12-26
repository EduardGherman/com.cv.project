package com.model;

public class Beneficii {
    private Integer bonuriMasa;
    private Boolean abonamentSala;
    private Boolean abonamentMedical;
    private Integer zileVacanta;

    @Override
    public String toString() {
        return "Beneficii{" +
                "bonuriMasa=" + bonuriMasa +
                ", abonamentSala=" + abonamentSala +
                ", abonamentMedical=" + abonamentMedical +
                ", zileVacanta=" + zileVacanta +
                '}';
    }

    public Beneficii() {
    }

    public Beneficii(Integer bonuriMasa, Boolean abonamentSala, Boolean abonamentMedical, Integer zileVacanta) {
        this.bonuriMasa = bonuriMasa;
        this.abonamentSala = abonamentSala;
        this.abonamentMedical = abonamentMedical;
        this.zileVacanta = zileVacanta;
    }

    public Integer getBonuriMasa() {
        return bonuriMasa;
    }

    public void setBonuriMasa(Integer bonuriMasa) {
        this.bonuriMasa = bonuriMasa;
    }

    public Boolean getAbonamentSala() {
        return abonamentSala;
    }

    public void setAbonamentSala(Boolean abonamentSala) {
        this.abonamentSala = abonamentSala;
    }

    public Boolean getAbonamentMedical() {
        return abonamentMedical;
    }

    public void setAbonamentMedical(Boolean abonamentMedical) {
        this.abonamentMedical = abonamentMedical;
    }

    public Integer getZileVacanta() {
        return zileVacanta;
    }

    public void setZileVacanta(Integer zileVacanta) {
        this.zileVacanta = zileVacanta;
    }



}





