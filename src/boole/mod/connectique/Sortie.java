/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boole.mod.connectique;

import boole.mod.Boole;
import boole.mod.composant.Composant;

/**
 *
 * @author Quentin
 */
public class Sortie extends Port {

    private Boolean etat;

    public Sortie(Composant pere) {
        super(pere);
        setEtat(Boole.DEFAULT);
    }

    @Override
    public Boolean getEtat() {
        return etat;
    }

    public final void setEtat(Boolean etat) {
        this.etat = etat;
    }

}
