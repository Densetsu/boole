/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetBooleVues;

import projetBooleVues.Circuit;
import projetBooleModele.composant.Composant;
import projetBooleModele.composant.elementaire.Et;
import projetBooleModele.composant.elementaire.Gnd;
import projetBooleModele.composant.elementaire.Led;
import projetBooleModele.composant.elementaire.Non;
import projetBooleModele.composant.elementaire.Vcc;
import projetBooleModele.connectique.Connexion;
import projetBooleModele.connectique.Port;

/**
 *
 * @author Quentin
 */
public class VccEtLed extends Circuit {
    
    
     private final Composant vcc;
     private final Composant gnd;
     private final Composant non;
     private final Composant et;
     private final Composant led;
     

    public VccEtLed() {

         Circuit circuit = new Circuit();
         vcc = new Vcc(1);
        circuit.ajouterComposant(vcc);
         gnd = new Gnd(4);
        circuit.ajouterComposant(gnd);
         non = new Non(5);
        circuit.ajouterComposant(non);
         et = new Et(2);
        circuit.ajouterComposant(et);
         led = new Led(3);
        circuit.ajouterComposant(led);
        Connexion c1;
        c1 = new Connexion(vcc.getSortie(0), et.getListeEntrees());
        Connexion c2 = new Connexion(gnd.getSortie(0), et.getListeEntrees());
        Connexion c3 = new Connexion(et.getSortie(0), non.getListeEntrees());
        Connexion c4 = new Connexion(non.getSortie(0), led.getListeEntrees());
        // NON (Vcc ET Gnd)     => !(1 ET 0) = !(0)=1
        vcc.getSortie(0).setLiaison(c1);
        et.getEntree(0).setLiaison(c1);
        gnd.getSortie(0).setLiaison(c2);
        et.getEntree(1).setLiaison(c2);
        et.getSortie(0).setLiaison(c3);
        non.getEntree(0).setLiaison(c3);
        non.getSortie(0).setLiaison(c4);
        led.getEntree(0).setLiaison(c4);
        
        

    }

    public void tester()
    {
        vcc.evaluer();
        et.evaluer(); // TODO code application logic here
        gnd.evaluer();
        non.evaluer();
        led.evaluer();
        System.out.println(led.getInfoComplementaire());
      
       
    }
}
