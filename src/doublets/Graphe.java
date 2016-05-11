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
public class Graphe {
    
    private Vector<Noeud> listeNoeud = new Vector<Noeud>();
    
    public Graphe(Vector<String> listeMots)
    {
        for(int i = 0; i < listeMots.size(); i++)
        {
            Noeud nouveau = new Noeud(listeMots.get(i));
            for(int j = 0; j < listeNoeud.size(); j++)
            {
                int compteur = 0;
                for(int k = 0; k < listeNoeud.get(j).getMot().length(); k++)
                {
                    if(listeNoeud.get(j).getMot().charAt(k) != nouveau.getMot().charAt(k))
                        compteur++;
                }
                
                if(compteur == 1)
                {
                    listeNoeud.get(j).ajouterVoisin(nouveau);
                    nouveau.ajouterVoisin(listeNoeud.get(j));
                }
            }
            listeNoeud.add(nouveau);
        }
    }
    
    public String toString()
    {
        String afficher = "------------------------------------Graphes-------------------------------------\n";
        for(int i = 0; i < listeNoeud.size(); i++)
        {
            afficher += listeNoeud.get(i).toString() + "\n";
        }
        return afficher;
    }
}
