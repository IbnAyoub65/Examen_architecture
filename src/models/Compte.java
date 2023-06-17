package models;

import java.util.List;

public class Compte {

    protected int numero;
    protected int solde;
    private Client clients;
    
 
  public Compte(int numero, int solde, Client clients) {
        this.numero = numero;
        this.solde = solde;
        this.clients = clients;
    }
       public Compte(int numero, int solde) {
        this.numero = numero;
        this.solde = solde;
    } 
    public Compte() {
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getSolde() {
        return solde;
    }
    public void setSolde(int solde) {
        this.solde = solde;
    }
    public Client getClients() {
        return clients;
    }
    public void setClients(Client clients) {
        this.clients = clients;
    }

}
