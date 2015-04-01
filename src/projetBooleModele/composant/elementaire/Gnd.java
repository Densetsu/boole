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
public class Gnd extends ComposantSimple {

    public Gnd(int id) {
        super(id, "Gnd");
        this.ajouterSortie();
    }

    @Override
    public void evaluer() {
        this.getSortie(0).setEtat(Boolean.FALSE);
    }
    
}