/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetBooleControlleur;

import projetBooleVues.Circuit;
import projetBooleModele.composant.Composant;
import projetBooleModele.composant.elementaire.Et;
import projetBooleModele.composant.elementaire.Gnd;
import projetBooleModele.composant.elementaire.Led;
import projetBooleModele.composant.elementaire.Non;
import projetBooleModele.composant.elementaire.Vcc;
import projetBooleModele.connectique.Connexion;
import projetBooleVues.TestOux;
import projetBooleVues.VccEtLed;

/**
 *
 * @author Quentin
 */
public class ProjetBoole {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    TestOux circOux= new TestOux();
    circOux.tester();
    }
    
    
}
