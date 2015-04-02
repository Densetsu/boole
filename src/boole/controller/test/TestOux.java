/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boole.controller.test;

import boole.mod.Boole;
import boole.mod.circuit.Circuit;
import boole.mod.composant.Composant;
import boole.mod.composant.elementaire.*;

/**
 *
 * @author Quentin
 */
public class TestOux extends TestCircuit {

    private final Composant itr;
    private final Composant itr2;
    private final Composant oux;
    private final Composant led;

    public TestOux() {
        this.setCircuit(Circuit.getInstance(0, 0, "VccEtLed",
                itr = new Itr(Boole.HAUT),
                itr2 = new Itr(Boole.BAS),
                oux = new Oux(),
                led = new Led())
        );
        connect(itr.getSortie(0), oux.getEntree(0));
        connect(itr2.getSortie(0), oux.getEntree(1));
        connect(oux.getSortie(0), led.getEntree(0));
    }

    @Override
    public void tester() {
        System.out.println("Test du circuit Itr+ XOR Itr-");
        itr.evaluer();
        itr2.evaluer();
        oux.evaluer();
        led.evaluer();

        System.out.println("La led affiche " + led.getInfoComplementaire() + " (Haut attendu).");
    }
}
