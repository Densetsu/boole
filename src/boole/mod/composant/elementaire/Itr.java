/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boole.mod.composant.elementaire;

import boole.mod.Boole;
import boole.mod.composant.ComposantSimple;

/**
 *
 * @author Quentin
 */
public class Itr extends ComposantSimple {
    
    private Boolean position;
    
    public Itr(Boolean position) {
        super(0, 1, "Itr");
        setPosition(position);
    }
    
    public Itr() {
        this(Boole.DEFAULT);
    }
    
    public Boolean getPosition() {
        return position;
    }
    
    public final void setPosition(Boolean position) {
        this.position = position;
    }
    
    @Override
    public void evaluer() {
        this.getSortie(0).setEtat(position);
    }
    
}
