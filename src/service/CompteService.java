package service;

import java.util.List;

import Repositorie.CompteDao;
import models.Compte;

public class CompteService {
    private CompteDao compteDao = new CompteDao();

    
    public List<Compte> List(){
        return compteDao.find();
    }
    
}
