/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boole.mod.composant.elementaire;

import boole.mod.Boole;
import boole.mod.composant.ComposantSimple;

/**
 *
 * @author Quentin
 */
public class Gnd extends ComposantSimple {

    public Gnd() {
        super(0, 1, "Gnd");
        this.ajouterSortie();
    }

    @Override
    public void evaluer() {
        this.getSortie(0).setEtat(Boole.BAS);
    }

}
