package fr.ab.beans;

public class Joueur {

    private int id;
    private String nom;
    private String prenom;
    private String surnom;
    private String meilleureperformance;
    private String defaut;
    private String qualite;
    private String photo;
    private int victoireChamp;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getSurnom() {
        return surnom;
    }

    public void setSurnom(String surnom) {
        this.surnom = surnom;
    }

    public String getMeilleureperformance() {
        return meilleureperformance;
    }

    public void setMeilleureperformance(String meilleureperformance) {
        this.meilleureperformance = meilleureperformance;
    }

    public String getDefaut() {
        return defaut;
    }

    public void setDefaut(String defaut) {
        this.defaut = defaut;
    }

    public String getQualite() {
        return qualite;
    }

    public void setQualite(String qualite) {
        this.qualite = qualite;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public int getVictoireChamp() {
        return victoireChamp;
    }

    public void setVictoireChamp(int victoireChamp) {
        this.victoireChamp = victoireChamp;
    }
}
