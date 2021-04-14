package org.corso.albergo;

public class Hotel {
    
    private Camera[] camere;
    private Reception reception;

    public Hotel() {
        this.camere =  new Camera[5];;
        this.reception = new Reception(this);
        //il this dentro le parentesi fa riferimento all'oggetto corrente
        camere[0] = new Camera("1");
        camere[1] = new Camera("2");
        camere[2] = new Camera("3");
        camere[3] = new Camera("4");
        camere[4] = new Camera("5");
    }
   
    public Camera disponibilitàCamera(){
        for(int i = 0; i<camere.length;i++){
            if( camere[i].isDisponibile()){
            camere[i].isDisponibile();
            return camere[i];
            }

        }

        return null;
    }

    public static void main(String[] args){
        //crea hotel
        Hotel hotel = new Hotel();
        //creare i clienti
        Cliente cliente1 = new Cliente("francesco","valderetti","crslsnd27h501i");
        Cliente cliente2 = new Cliente("carlo","sordini","crslsnd27h501ll");
        Cliente cliente3 = new Cliente("francesco","totti","crslsnd27h501k");
        Cliente cliente4 = new Cliente("alessandro","corsetti","crslsnd27h501j");
        Cliente cliente5 = new Cliente("emanuela","ferretti","crslsnd27h501m");
        Cliente cliente6 = new Cliente("peppino","ferretti","crslsnd27h501m");
        Cliente cliente7 = new Cliente("giancarlo","ferretti","crslsnd27h501m");
        Cliente cliente8 = new Cliente("filippo","ferretti","crslsnd27h501m");
        //crea 5 prenotazioni
        Prenotazione prenotazione1 =hotel.reception.prenota(cliente1);
        Prenotazione prenotazione2 =hotel.reception.prenota(cliente2);
        Prenotazione prenotazione3 =hotel.reception.prenota(cliente3);
        Prenotazione prenotazione4 =hotel.reception.prenota(cliente4);
        Prenotazione prenotazione5 =hotel.reception.prenota(cliente5);
      
        //disdire 2 prenotazioni esistenti
        hotel.reception.disdici(prenotazione1);
        hotel.reception.disdici(prenotazione2);


        //creare 3 prenotazioni
        Prenotazione prenotazione6 =hotel.reception.prenota(cliente5);
        Prenotazione prenotazione7 =hotel.reception.prenota(cliente5);
        Prenotazione prenotazione8 =hotel.reception.prenota(cliente5);
        
        //infine stampare il report
   

    }
    public void stampa(){
            System.out.println("");
    }
}
