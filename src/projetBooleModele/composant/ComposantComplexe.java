/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetBooleModele.composant;

import projetBooleModele.composant.Composant;
import java.util.ArrayList;
import projetBooleModele.connectique.Port;

/**
 *
 * @author Quentin
 */
public abstract class ComposantComplexe extends Composant{
    
   protected ArrayList<Composant> listeComposants;

    public ComposantComplexe(int id, String nom) {
        super(id, nom);
        this.listeComposants = new ArrayList();
    }
   
    public void ajouterComposant(Composant composant)
    {
       this.listeComposants.add(composant);
    }

    
    
}
