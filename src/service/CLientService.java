package service;

import java.util.List;

import Repositorie.ClientDao;
import models.Client;
import models.Compte;

public class CLientService {

    private ClientDao clientDao = new ClientDao();

 public List<Client> List(){
        return clientDao.find();
 }
}
