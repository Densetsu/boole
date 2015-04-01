/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetBooleModele.connectique;

import java.util.ArrayList;

/**
 *
 * @author Quentin
 */
public class Connexion {
     protected Sortie sortie;
    protected ArrayList<Entree> listeEntrees;

    public Connexion(Sortie sortie, ArrayList<Entree> listeEntrees) {
        this.setSortie(sortie); 
        this.setListeEntrees(listeEntrees);
    }
    
    
    public Connexion(Sortie sortie, Entree[] entrees)
    {
        this.setSortie(sortie);  
        for (Entree entree : entrees) {
            this.ajouterEntree(entree);
        }
    }
   public Boolean getEtat() {
        return sortie.getEtat();
    }

    public final void setListeEntrees(ArrayList<Entree> listeEntrees) {
        this.listeEntrees = listeEntrees;
    }

    public final void setSortie(Sortie sortie) {
        this.sortie = sortie;
        sortie.setLiaison(this);
    }

    public final void ajouterEntree(Entree entree) {
        this.listeEntrees.add(entree);
        entree.setLiaison(this);
    }
    
    public ArrayList<Entree> getListeEntrees() {
        return listeEntrees;
    }

    public Port getSortie() {
        return sortie;
    }
    
}
