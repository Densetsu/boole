/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boole.mod.connectique;

import java.util.ArrayList;

/**
 *
 * @author Quentin
 */
public class Connexion {

    protected Port sortie;
    protected ArrayList<Port> listeEntrees = new ArrayList<>();

    public Connexion(Port sortie, ArrayList<Port> listeEntrees) {
        this.setSortie(sortie);
        this.setListeEntrees(listeEntrees);
    }

    public Connexion(Port sortie, Port... entrees) {
        this.setSortie(sortie);
        for (Port entree : entrees) {
            this.ajouterEntree(entree);
        }
    }

    public Connexion(Sortie sortie, Entree[] entrees) {
        this.setSortie(sortie);
        for (Entree entree : entrees) {
            this.ajouterEntree(entree);
        }
    }

    public Boolean getEtat() {
        return sortie.getEtat();
    }

    public final void setListeEntrees(ArrayList<Port> listeEntrees) {
        this.listeEntrees = listeEntrees;
    }

    public final void setSortie(Port sortie) {
        this.sortie = sortie;
        sortie.setLiaison(this);
    }

    public final void ajouterEntree(Port entree) {
        this.listeEntrees.add(entree);
        entree.setLiaison(this);
    }

    public ArrayList<Port> getListeEntrees() {
        return listeEntrees;
    }

    public Port getSortie() {
        return sortie;
    }

}
