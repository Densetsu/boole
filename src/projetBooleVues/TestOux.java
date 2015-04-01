/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetBooleVues;

import projetBooleModele.composant.Composant;
import projetBooleModele.composant.elementaire.Et;
import projetBooleModele.composant.elementaire.Gnd;
import projetBooleModele.composant.elementaire.Itr;
import projetBooleModele.composant.elementaire.Led;
import projetBooleModele.composant.elementaire.Non;
import projetBooleModele.composant.elementaire.Oux;
import projetBooleModele.composant.elementaire.Vcc;
import projetBooleModele.connectique.Connexion;

/**
 *
 * @author Quentin
 */
public class TestOux extends Circuit{
    
   private Composant itr;
   private Composant itr2;
   private Composant oux;
   private Composant led;
   
   
   public TestOux() {

         Circuit circuit = new Circuit();
         itr = new Itr(1);
        circuit.ajouterComposant(itr);
        itr2 = new Itr(1);
        circuit.ajouterComposant(itr2);
         oux = new Oux(4);
        circuit.ajouterComposant(oux);
         led = new Led(5);
        circuit.ajouterComposant(led);
      
        Connexion c1  = new Connexion(itr.getSortie(0), oux.getListeEntrees());
        
        Connexion c2 = new Connexion(itr2.getSortie(0), oux.getListeEntrees());
        Connexion c3 = new Connexion(oux.getSortie(0), led.getListeEntrees());
       
        // NON (Vcc ET Gnd)     => !(1 ET 0) = !(0)=1
        itr.getSortie(0).setLiaison(c1);
        oux.getEntree(0).setLiaison(c1);
        itr2.getSortie(0).setLiaison(c2);
        oux.getEntree(1).setLiaison(c2);
        oux.getSortie(0).setLiaison(c3);
        led.getEntree(0).setLiaison(c3);
       
        
        

    }

    public void tester()
    {
        itr.evaluer(true);
        itr2.evaluer(false); // TODO code application logic here
        oux.evaluer();
        led.evaluer();
        System.out.println(led.getInfoComplementaire());
      
       
    }
   
}
