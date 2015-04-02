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
public class Oux extends ComposantSimple {

    public Oux() {
        super(2, 1, "Oux");
    }

    @Override
    public void evaluer() {
        getSortie(0).setEtat(
                getEntree(0).getLiaison().getEtat()
                ^ getEntree(1).getLiaison().getEtat());
    }
}
