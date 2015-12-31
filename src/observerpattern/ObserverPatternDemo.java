package observerpattern;

import com.samnang.classes.CompteBancaire;
import com.samnang.classes.Voleur;

public class ObserverPatternDemo {

    public static void main(String[] args) {
        CompteBancaire unCompte = new CompteBancaire("Xavier Yves", 13579.25);
        Voleur unVoleur = new Voleur("Valentin");
        unCompte.addObserver( unVoleur );/*
            Habituellement, un voleur est une personne qui devrait etre en mesure
            de s'ajouter lui-même comme un observateur d'un CompteBancaire 
            de sorte à « espionner ».        
            */
        
        unCompte.setSolde( 2000000 );
        unCompte.setSolde( 15800 );
        unCompte.setSolde( 7748603 );
        System.out.println( unVoleur.getReleve() );
    }
    
}
