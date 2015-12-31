package com.samnang.classes;

import java.util.Observable;

public class CompteBancaire extends Observable {
    
    private String proprietaire;
    private double solde;
    
    public CompteBancaire(String proprietaire, double solde) {
        this.proprietaire = proprietaire;
        this.solde = solde;
    }
    public String getProprietaire() {
        return proprietaire;
    }
    public void setProprietaire(String proprietaire) {
        this.proprietaire = proprietaire;
        setChanged();
        notifyObservers("proprietaire");
    }
    public double getSolde() {
        return solde;
    }
    public void setSolde(double solde) {
        this.solde = solde;
        setChanged();
        notifyObservers("solde");
    }    
}
