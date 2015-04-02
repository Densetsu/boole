/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boole.mod.composant.elementaire;

import boole.mod.composant.ComposantSimple;

/**
 *
 * @author Quentin
 */
public class Led extends ComposantSimple {

    public Led() {
        super(1, 0, "Led");
        this.ajouterEntree();
    }

    @Override
    public void evaluer() {
            this.setInfoComplementaire(this.getEntree(0).getEtat() ? "Haut" : "Bas");    
    }
    
}