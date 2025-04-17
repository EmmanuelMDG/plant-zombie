package com.epf.model;
import java.math.BigDecimal;

public class Zombie {
    private int idZombie;
    private String nom;
    private int pointDeVie;
    private BigDecimal attaqueParSeconde;
    private int degatAttaque;
    private BigDecimal vitesseDeDeplacement;
    private String cheminImage;
    private int idMap; // Foreign key referencing Map

    public Zombie() {
    }

    public int getIdZombie() {
        return idZombie;
    }

    public void setIdZombie(int idZombie) {
        this.idZombie = idZombie;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPointDeVie() {
        return pointDeVie;
    }

    public void setPointDeVie(int pointDeVie) {
        this.pointDeVie = pointDeVie;
    }

    public BigDecimal getAttaqueParSeconde() {
        return attaqueParSeconde;
    }

    public void setAttaqueParSeconde(BigDecimal attaqueParSeconde) {
        this.attaqueParSeconde = attaqueParSeconde;
    }

    public int getDegatAttaque() {
        return degatAttaque;
    }

    public void setDegatAttaque(int degatAttaque) {
        this.degatAttaque = degatAttaque;
    }

    public BigDecimal getVitesseDeDeplacement() {
        return vitesseDeDeplacement;
    }

    public void setVitesseDeDeplacement(BigDecimal vitesseDeDeplacement) {
        this.vitesseDeDeplacement = vitesseDeDeplacement;
    }

    public String getCheminImage() {
        return cheminImage;
    }

    public void setCheminImage(String cheminImage) {
        this.cheminImage = cheminImage;
    }

    public int getIdMap() {
        return idMap;
    }

    public void setIdMap(int idMap) {
        this.idMap = idMap;
    }

    @Override
    public String toString() {
        return "Zombie{" +
                "idZombie=" + idZombie +
                ", nom='" + nom + '\'' +
                ", pointDeVie=" + pointDeVie +
                ", attaqueParSeconde=" + attaqueParSeconde +
                ", degatAttaque=" + degatAttaque +
                ", vitesseDeDeplacement=" + vitesseDeDeplacement +
                ", cheminImage='" + cheminImage + '\'' +
                ", idMap=" + idMap +
                '}';
    }
}
