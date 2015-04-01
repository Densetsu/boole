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
public class Vcc extends ComposantSimple {

    public Vcc(int id) {
        super(id, "Vcc");
        this.ajouterSortie();
    }

    @Override
    public void evaluer() {
        this.getSortie(0).setEtat(Boolean.TRUE);
    }
    
}