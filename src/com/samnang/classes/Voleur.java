package com.samnang.classes;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class Voleur implements Observer {

    private String surnom;
    private ArrayList<String> releve = new ArrayList<String>();
    
    public Voleur(String nom) {
        this.surnom = nom;
    }
    public String getSurnom() {
        return surnom;
    }
    public void setSurnom(String nom) {
        this.surnom = nom;
    }    
    public String getReleve() {
        String message = "- - - Mes Relevés Volés - - -\n";
        for(int i=0; i < releve.size(); i++) {
            message += releve.get(i) + "\n";
        }
        return message;
    }
    @Override
    public void update(Observable o, Object arg) {
        if( o instanceof CompteBancaire ) {
            CompteBancaire unCompteBancaire = (CompteBancaire)o;
            releve.add( unCompteBancaire.getProprietaire() + " - " + unCompteBancaire.getSolde() + " $" );
        }
    }
    
}
