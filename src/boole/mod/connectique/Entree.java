/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boole.mod.connectique;

import boole.mod.composant.Composant;

/**
 *
 * @author Quentin
 */
public class Entree extends Port {

    public Entree(Composant pere) {
        super(pere);

    }

    @Override
    public Boolean getEtat() {
        return super.getLiaison().getEtat();
    }

}
