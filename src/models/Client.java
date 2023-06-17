package models;

import java.util.List;

public class Client {

    private String nom;
    private String prenom;
    private List<Compte> compte;

    
    public Client(String nom, String prenom, List<Compte> compte) {
        this.nom = nom;
        this.prenom = prenom;
        this.compte = compte;
    }
    public Client(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }
    public Client() {
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
    public List<Compte> getCompte() {
        return compte;
    }
    public void setCompte(List<Compte> compte) {
        this.compte = compte;
    }
   
    
}
