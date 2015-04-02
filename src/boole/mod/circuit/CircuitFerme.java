/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boole.mod.circuit;

import boole.mod.composant.Composant;

/**
 *
 * @author Quentin
 */
public class CircuitFerme extends Circuit {

    public CircuitFerme(String nom, Composant... composants) {
        super(0,0, nom, composants);
    }

    @Override
    public void evaluer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
