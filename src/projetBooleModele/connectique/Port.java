/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetBooleModele.connectique;

import projetBooleModele.composant.Composant;

/**
 *
 * @author Quentin
 */
public abstract class Port {
    
    private Composant pere;
    private Connexion liaison;
    
    
      public Port(Composant pere)
          {
              this.pere=pere;
          }
    public Composant getPere() {
        return pere;
    }


    public Connexion getLiaison() {
        return liaison;
    }

    public void setLiaison(Connexion liaison) {
            this.liaison = liaison;
    }

  

   
}
