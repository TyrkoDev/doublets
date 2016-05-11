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
public class Doublets {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LireFichier lf = new LireFichier("mots.txt");
        Graphe graphe = new Graphe(lf.getListeMots());
        System.out.println(graphe);
    }
    
}
