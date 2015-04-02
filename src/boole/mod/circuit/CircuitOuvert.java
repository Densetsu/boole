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
public class CircuitOuvert extends Circuit {

    public CircuitOuvert(int nbEntrees, int nbSorties, String nom, Composant... composants) throws InsufficientPortsException {
        super(nbEntrees, nbSorties, nom, composants);
        if (nbEntrees < 1 || nbSorties < 1) {
            throw new InsufficientPortsException(nbEntrees, nbSorties);
        }
    }

    @Override
    public void evaluer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

class InsufficientPortsException extends Exception {

    public InsufficientPortsException(int nbEntrees, int nbSorties) {
        super("Un circuit ouvert doit avoir au moins une entrée (" + nbEntrees + ") ou une sortie (" + nbSorties + ").");
    }

}
