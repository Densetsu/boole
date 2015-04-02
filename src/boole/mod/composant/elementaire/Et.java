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
public class Et extends ComposantSimple {

    public Et() {
        super(2, 1, "Et");
    }

    @Override
    public void evaluer() {
        this.getSortie(0).setEtat(
                this.getEntree(0).getLiaison().getEtat()
                &&
                this.getEntree(1).getLiaison().getEtat());
    }

}
