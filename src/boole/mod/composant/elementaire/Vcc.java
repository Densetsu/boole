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
public class Vcc extends ComposantSimple {

    public Vcc() {
        super(0, 1, "Vcc");
    }

    @Override
    public void evaluer() {
        this.getSortie(0).setEtat(Boolean.TRUE);
    }

}
