/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetBooleVues;

import java.util.ArrayList;
import projetBooleModele.composant.Composant;


/**
 *
 * @author Quentin
 */
public  class Circuit {
    
    protected ArrayList<Composant> listeComposants;
    
    
    public Circuit() {

		listeComposants = new ArrayList<Composant>();
		
    } 
    public void ajouterComposant(Composant composant) {
        this.getListeComposants().add(composant);
    }

    public ArrayList<Composant> getListeComposants() {
        return listeComposants;
    }

    public void setListeComposants(ArrayList<Composant> listeComposants) {
        this.listeComposants = listeComposants;
    }
    
    
    
}
