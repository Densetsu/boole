/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetBooleModele.composant.elementaire;

import projetBooleModele.composant.ComposantSimple;
import projetBooleModele.composant.ComposantSimple;

/**
 *
 * @author Quentin
 */
public class Itr extends ComposantSimple {
   
    public Itr(int id) {
        super(id, "Itr");
        this.ajouterSortie();
    }

public void evaluer(boolean etat) {
        this.getSortie(0).setEtat(etat);
        
    }

    @Override
    public void evaluer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}