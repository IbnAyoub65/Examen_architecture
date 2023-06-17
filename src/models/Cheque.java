package models;

public class Cheque extends Compte {

    private int frais;

    public Cheque() {
    }

    public Cheque(int frais) {
        this.frais = frais;
    }

    public int getFrais() {
        return frais;
    }

    public void setFrais(int frais) {
        this.frais = frais;
    }
    
}
