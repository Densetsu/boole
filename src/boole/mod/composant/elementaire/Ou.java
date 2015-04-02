/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boole.mod.composant.elementaire;

import boole.mod.composant.ComposantSimple;
import boole.mod.composant.ComposantSimple;

/**
 *
 * @author Quentin
 */
public class Ou extends ComposantSimple {

    public Ou() {
        super(2, 1, "Ou");
    }

    @Override
    public void evaluer() {
        this.getSortie(0).setEtat(
                this.getEntree(0).getLiaison().getEtat()
                || this.getEntree(1).getLiaison().getEtat());
    }

}
