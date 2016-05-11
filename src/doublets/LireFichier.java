/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublets;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Vector;

/**
 *
 * @author Angelo
 */
public class LireFichier {
    
    private Vector<String> listeMots = new Vector<String>();
    
    public LireFichier(String path)
    {
        //lecture du fichier texte	
        try{
                InputStream ips=new FileInputStream(path); 
                InputStreamReader ipsr=new InputStreamReader(ips);
                BufferedReader br=new BufferedReader(ipsr);
                String ligne;
                while ((ligne=br.readLine())!=null){
                        listeMots.add(ligne);
                }
                br.close(); 
        }		
        catch (Exception e){
                System.out.println(e.toString());
        }	
    }
    
    public Vector<String> getListeMots()
    {
        return listeMots;
    }
}
