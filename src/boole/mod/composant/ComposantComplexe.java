/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boole.mod.composant;

import boole.mod.connectique.Connexion;
import boole.mod.connectique.Port;
import java.util.ArrayList;

/**
 *
 * @author Quentin
 */
public abstract class ComposantComplexe extends Composant {

    protected ArrayList<Composant> listeComposants;
    protected ArrayList<Connexion> listeConnexions;

    public ComposantComplexe(int nbEntrees, int nbSorties, String nom) {
        super(nbEntrees, nbSorties, nom);
        this.listeComposants = new ArrayList<>();
        this.listeConnexions = new ArrayList<>();
    }

    public ComposantComplexe(int nbEntrees, int nbSorties, String nom, Composant... composants) {
        this(nbEntrees, nbSorties, nom);
        for (Composant com : composants) {
            this.ajouterComposant(com);
        }
    }

    public final void ajouterComposant(Composant composant) {
        this.listeComposants.add(composant);
    }

    public ArrayList<Composant> getListeComposants() {
        return listeComposants;
    }

    public Composant getComposant(int idx) {
        return getListeComposants().get(idx);
    }

    public void setListeComposants(ArrayList<Composant> listeComposants) {
        this.listeComposants = listeComposants;
    }

    public final void ajouterConnexion(Connexion connexion) {
        this.listeConnexions.add(connexion);
    }

    public ArrayList<Connexion> getListeConnexions() {
        return listeConnexions;
    }

    public Connexion getConnexion(int idx) {
        return getListeConnexions().get(idx);
    }

    public void setListeConnexions(ArrayList<Connexion> listeConnexions) {
        this.listeConnexions = listeConnexions;
    }
    public void connect(Port output, Port... inputs) {
        this.ajouterConnexion(new Connexion(output, inputs));
    }
}
