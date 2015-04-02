/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boole.controller.test;

import boole.mod.circuit.Circuit;
import boole.mod.composant.Composant;
import boole.mod.composant.elementaire.*;

/**
 *
 * @author Quentin
 */
public final class TestVccEtLed extends TestCircuit {

    private final Composant vcc;
    private final Composant gnd;
    private final Composant non;
    private final Composant et;
    private final Composant led;

    public TestVccEtLed() {

        this.setCircuit(Circuit.getInstance(0, 0, "VccEtLed",
                vcc = new Vcc(),
                gnd = new Gnd(),
                non = new Non(),
                et = new Et(),
                led = new Led())
        );
        
        connect(vcc.getSortie(0), et.getEntree(0));
        connect(gnd.getSortie(0), et.getEntree(1));
        connect(et.getSortie(0), non.getEntree(0));
        connect(non.getSortie(0), led.getEntree(0));
    }

    @Override
    public void tester() {
        System.out.println("Test du circuit NOT (Vcc AND Gnd)");
        
        vcc.evaluer();
        et.evaluer();
        gnd.evaluer();
        non.evaluer();
        led.evaluer();

        System.out.println("La led affiche " + led.getInfoComplementaire() + " (Haut attendu).");
    }
}
