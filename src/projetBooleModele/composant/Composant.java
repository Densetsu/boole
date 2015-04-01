/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetBooleModele.composant;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import projetBooleModele.connectique.Entree;
import projetBooleModele.connectique.Sortie;

/**
 *
 * @author Quentin
 */
public abstract class Composant {

    protected Integer id;
    protected String nomComposant;
    protected String infoComplementaire;
    protected ArrayList<Entree> listeEntrees;
    protected ArrayList<Sortie> listeSorties;

    public Composant() {
        listeEntrees = new ArrayList<Entree>();
        listeSorties = new ArrayList<Sortie>();

    }

    public Composant(int id, String nom) {
        this();
        this.id = id;
        this.nomComposant = nom;

    }

    public abstract void evaluer();
    
    public void ajouterEntree() {
        listeEntrees.add(new Entree(this));
    }

    public void ajouterSortie() {
        listeSorties.add(new Sortie(this));
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomComposant() {
        return nomComposant;
    }

    public void setNomComposant(String nomComposant) {
        this.nomComposant = nomComposant;
    }

    public ArrayList<Entree> getListeEntrees() {
        return listeEntrees;
    }

    public Entree getEntree(int idx) {
        return this.getListeEntrees().get(idx);
    }
    
    public ArrayList<Sortie> getListeSorties() {
        return listeSorties;
    }
    
    public Sortie getSortie(int idx) {
        return this.getListeSorties().get(idx);
    }
    public String getInfoComplementaire() {
        return infoComplementaire;
    }

    public void setInfoComplementaire(String infoComplementaire) {
        this.infoComplementaire = infoComplementaire;
    }

    public void evaluer(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

}
