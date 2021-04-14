package org.corso.albergo;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class GestioneAlbergo {
    
    private BufferedReader camDisp;
    private BufferedReader camPre;
   // private String camereDisponibili[] ;
    //private String camerePrenotate[] ;
    List<String> camereDisponibili = new List<String>();
    List<String> camerePrenotate = new List<String>();

    public GestioneAlbergo() throws FileNotFoundException, IOException{
     camDisp = new BufferedReader(new FileReader("CamereDisponibili.txt"));
     camPre = new BufferedReader(new FileReader("CamerePrenotate.txt"));
      
     LoadCamereDisp();
     LoadCamerePrenotate();
    }
    
    public void LoadCamereDisp() throws FileNotFoundException, IOException{
        

        String line = camDisp.readLine();
        if(line!=null){
            camereDisponibili.add(line);
        }
        while(line!=null) {
           // System.out.println(line);
            line = camDisp.readLine();
            if(line!=null){
                camereDisponibili.add(line);
            }
        }
    }

    public void LoadCamerePrenotate() throws FileNotFoundException, IOException{
        
        String line = camPre.readLine();
        if(line!=null){
            camerePrenotate.add(line);
        }
        while(line!=null) {
           // System.out.println(line);
            line = camPre.readLine();
            if(line!=null){
                camerePrenotate.add(line);
            }
        }
    }

}
