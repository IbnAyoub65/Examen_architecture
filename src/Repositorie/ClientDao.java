package Repositorie;

import java.util.ArrayList;
import java.util.List;

import models.*;

public class ClientDao {

    private List<Client> clients = new ArrayList<>();
    
    public ClientDao(){
        clients.add(new Client("Sambou","Yaya"));
        clients.add(new Client("Ba","Mody"));
    
    }

    public List<Client> find(){
        return clients;
    }
    
}
