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
public class Led extends ComposantSimple {

    public Led(int id) {
        super(id, "Led");
        this.ajouterEntree();
    }

    @Override
    public void evaluer() {
        if (this.getEntree(0).getEtat()) {
            this.setInfoComplementaire("allumée");
        } else {
            this.setInfoComplementaire("éteinte");
        }
            
    }
    
}