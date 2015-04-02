/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boole.mod.composant;

import boole.mod.composant.Composant;

/**
 *
 * @author Quentin
 */
public abstract class ComposantSimple extends Composant {

    public ComposantSimple() {
    }

    public ComposantSimple(int nbEntrees, int nbSorties) {
        super(nbEntrees, nbSorties);
    }

    public ComposantSimple(int nbEntrees, int nbSortie, String nom) {
        super(nbEntrees, nbSortie, nom);
    }

}
