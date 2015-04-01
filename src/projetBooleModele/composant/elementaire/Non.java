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
public class Non extends ComposantSimple {
  

  

    public Non(int id) {
        super(id, "Non");
        this.ajouterSortie();
        this.ajouterEntree();
    }

    @Override
    public void evaluer() {
       this.getSortie(0).setEtat
        (!(this.getEntree(0).getLiaison().getEtat()));
             
    }
}
