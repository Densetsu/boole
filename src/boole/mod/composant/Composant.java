/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boole.mod.composant;

import java.util.ArrayList;
import boole.mod.connectique.Entree;
import boole.mod.connectique.Sortie;

/**
 *
 * @author Quentin
 */
public abstract class Composant {

    private static Integer lastId = 0;

    protected Integer id;
    protected String nomComposant;
    protected String infoComplementaire;
    protected ArrayList<Entree> listeEntrees;
    protected ArrayList<Sortie> listeSorties;

    public Composant() {
        listeEntrees = new ArrayList<>();
        listeSorties = new ArrayList<>();
        id = newId();
    }

    public Composant(int nbEntrees, int nbSorties) {
        this();
        for (int i = 0; i < nbEntrees; ++i) {
            this.ajouterEntree();
        }
        for (int i = 0; i < nbSorties; ++i) {
            this.ajouterSortie();
        }

    }

    public Composant(int nbEntrees, int nbSorties, String nom) {
        this(nbEntrees, nbSorties);
        this.nomComposant = nom;
    }

    public abstract void evaluer();

    public final void ajouterEntree() {
        listeEntrees.add(new Entree(this));
    }

    public final void ajouterSortie() {
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

    private static Integer newId() {
        return lastId++;
    }

}
