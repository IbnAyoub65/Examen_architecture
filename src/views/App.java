package views;

import java.util.List;
import java.util.Scanner;

import models.Client;
import models.Compte;
import service.CLientService;
import service.CompteService;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
       CLientService cLientService = new CLientService();
        CompteService compteService = new CompteService();

 
        System.out.println("===== LIste des clients ===");
        List<Client> clients = cLientService.List();
        for (Client client : clients) {
            System.out.println("nom :" + client.getNom());
            System.out.println("prenom :" + client.getPrenom());
           
        }
 
        System.out.println("=== liste comptes ==");
        List<Compte> comptes = compteService.List();
        for (Compte compte : comptes) {
            System.out.println("numero :" + compte.getNumero());
            System.out.println("solde :" + compte.getSolde());
            System.out.println("client :" + compte.getClients().getNom());
            System.out.println("client :" + compte.getClients().getPrenom());
        }
  
    }
}
