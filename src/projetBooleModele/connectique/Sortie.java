/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetBooleModele.connectique;

import projetBooleModele.composant.Composant;

/**
 *
 * @author Quentin
 */
public class Sortie extends Port {

    private boolean etat;

    public Sortie(Composant pere) {
        super(pere);

    }


    public Boolean getEtat() {
        return etat;
    }

    public void setEtat(Boolean etat) {
        this.etat = etat;
    }
    

}
