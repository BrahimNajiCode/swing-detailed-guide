package JTable.tableModelObjet;

import JTable.Sport;

import java.awt.*;

public class Ami {

    private String nom;
    private String prenom;
    private Color couleur;
    private boolean homme;
    private Sport sport;
    public Ami(String nom, String prenom, Color couleur, boolean homme, Sport sport) {
        super();

        this.nom = nom;
        this.prenom = prenom;
        this.couleur = couleur;
        this.homme = homme;
        this.sport = sport;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public Color getCouleur() {
        return couleur;
    }

    public boolean isHomme() {
        return homme;
    }

    public Sport getSport() {
        return sport;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setCouleur(Color couleur) {
        this.couleur = couleur;
    }

    public void setHomme(boolean homme) {
        this.homme = homme;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }
}
