package org.corso.albergo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MenuAlbergo {
    
    public static void main(String[] args) throws FileNotFoundException, IOException{
        
        GestioneAlbergo ga = new GestioneAlbergo();

        String primoscreen;
        primoscreen = "Corsetti Hotel \n";
        primoscreen = primoscreen + "Scegli un'operazione : \n";
        primoscreen = primoscreen + "\n";
        primoscreen = primoscreen + "Prenotazione - [P] \n";
        primoscreen = primoscreen + "Disponibilità - [D] \n";
        primoscreen = primoscreen + "Cancellazione - [C] \n";
        System.out.println(primoscreen);
        
        Scanner sc = new Scanner(System.in); 
        String stIn = sc.nextLine(); 
       
        
        if(stIn == "P"){
          
            System.out.println("Richiesta Prenotazione");
            // Check disponibilità camera
            //Esegui prenotazione


        }else if (stIn == "D"){

            System.out.println("Richiesta Disponibilita");
            // Check disponibilità generale
            // Mostra disponibilita camere

        }else if(stIn == "C"){

            System.out.println("Richiesta Cancellazione");
            //quale camera cancellare tramite NrPrenotazione
            //check camera con quello NrPrenotazione
            //Cancella NrPrenotazione 
        }else{System.out.println("Comando non valido");} 



        sc.close();
    }


}
