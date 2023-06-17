package Repositorie;

import java.util.ArrayList;
import java.util.List;

import models.Client;
import models.Compte;

public class CompteDao {

    private List<Compte> comptes = new ArrayList<>();
   
    private List<Client> clients = new ArrayList<>();

    public CompteDao(){

       /*  comptes.add(new Compte(1,500000));
        comptes.add(new Compte(2,1000000)); */
        clients.add(new Client("Ba","mody"));
        clients.add(new Client("Coly","Matar"));
        clients.add(new Client("Sambou","Mooha"));
        comptes.add(new Compte(1,300000,clients.get(0)));
        comptes.add(new Compte(2,400000,clients.get(2)));
        
    }
 public List<Compte> find(){
    return comptes;
 }
}