/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublets;

import java.util.Vector;

/**
 *
 * @author Angelo
 */
public class Noeud {
    
    private String mot;
    private Vector<Noeud> voisins = new Vector<Noeud>();
    
    public Noeud(String mot)
    {
        this.mot = mot;
    }
    
    public String getMot()
    {
        return this.mot;
    }
    
    public void ajouterVoisin(Noeud n)
    {
        voisins.add(n);
    }
    
    public Vector<Noeud> getVoisin()
    {
        return voisins;
    }
    
    public String toString()
    {
        String afficher = mot + ", voisins : ";
        
        for(int i = 0; i < voisins.size(); i++)
        {
            if(i != (voisins.size() - 1))
                afficher += voisins.get(i).getMot() + ", ";
            else
                afficher += voisins.get(i).getMot();
        }
        return afficher;
    }
}
