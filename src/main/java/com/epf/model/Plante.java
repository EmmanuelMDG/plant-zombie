package com.epf.model;
import java.math.BigDecimal;

public class Plante {
    private int idPlante;
    private String nom;
    private int pointDeVie;
    private BigDecimal attaqueParSeconde;
    private int degatAttaque;
    private int cout;
    private BigDecimal soleilParSeconde;
    private String effet; // Values: "normal", "slow low", "slow medium", "slow stop"
    private String cheminImage;

    public Plante() {
    }

    public int getIdPlante() {
        return idPlante;
    }

    public void setIdPlante(int idPlante) {
        this.idPlante = idPlante;
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

    public int getCout() {
        return cout;
    }

    public void setCout(int cout) {
        this.cout = cout;
    }

    public BigDecimal getSoleilParSeconde() {
        return soleilParSeconde;
    }

    public void setSoleilParSeconde(BigDecimal soleilParSeconde) {
        this.soleilParSeconde = soleilParSeconde;
    }

    public String getEffet() {
        return effet;
    }

    public void setEffet(String effet) {
        this.effet = effet;
    }

    public String getCheminImage() {
        return cheminImage;
    }

    public void setCheminImage(String cheminImage) {
        this.cheminImage = cheminImage;
    }

    @Override
    public String toString() {
        return "Plante{" +
                "idPlante=" + idPlante +
                ", nom='" + nom + '\'' +
                ", pointDeVie=" + pointDeVie +
                ", attaqueParSeconde=" + attaqueParSeconde +
                ", degatAttaque=" + degatAttaque +
                ", cout=" + cout +
                ", soleilParSeconde=" + soleilParSeconde +
                ", effet='" + effet + '\'' +
                ", cheminImage='" + cheminImage + '\'' +
                '}';
    }
}
