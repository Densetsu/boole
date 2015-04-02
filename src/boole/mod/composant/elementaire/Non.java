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
public class Non extends ComposantSimple {

    public Non() {
        super(1, 1, "Non");
    }

    @Override
    public void evaluer() {
        this.getSortie(0).setEtat(!(this.getEntree(0).getLiaison().getEtat()));

    }
}
