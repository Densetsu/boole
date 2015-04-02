/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boole.mod.circuit;

import boole.mod.composant.Composant;
import boole.mod.composant.ComposantComplexe;

/**
 *
 * @author Quentin
 */
public abstract class Circuit extends ComposantComplexe {

    public Circuit(int nbEntrees, int nbSorties, String nom, Composant... composants) {
        super(nbEntrees, nbSorties, nom);
        for (Composant com : composants) {
            this.ajouterComposant(com);
        }
    }

    @Override
    public abstract void evaluer();

    public static Circuit getInstance(int nbEntrees, int nbSorties, String nom, Composant... composants) {
        if (nbEntrees == 0 && nbSorties == 0) {
            return new CircuitFerme(nom, composants);
        } else {
            try {
                return new CircuitOuvert(nbEntrees, nbSorties, nom, composants);
            } catch (InsufficientPortsException e) {
                throw new Error("Un circuit ouvert a été créé sans ports.", e);
            }

        }
    }
}
