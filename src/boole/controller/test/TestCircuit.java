/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boole.controller.test;

import boole.mod.circuit.Circuit;
import boole.mod.connectique.Port;

/**
 *
 * @author Subaru
 */
public abstract class TestCircuit {

    private Circuit circuit;

    public TestCircuit() {
    }

    public TestCircuit(Circuit circuit) {
        this.circuit = circuit;
    }

    public Circuit getCircuit() {
        return circuit;
    }

    public void setCircuit(Circuit circuit) {
        this.circuit = circuit;
    }

    public void connect(Port output, Port... inputs) {
        this.getCircuit().connect(output, inputs);
    }

    public abstract void tester();

}
