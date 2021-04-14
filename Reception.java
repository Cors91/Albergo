package org.corso.albergo;

public class Reception {
    
    private Prenotazione [] prenotazioni;
    private Hotel hotel;

    public Reception(Hotel hotel){
        this.hotel=hotel;
        this.prenotazioni = new Prenotazione[10];

    }


    public Prenotazione prenota(Cliente cliente){
        //controllo delle camere

      Camera cameraDisponibile = hotel.disponibilitàCamera();
        //Crea prenotazione
        //mettere la prenotazione dentro l'array Prenotazione[] prenotazioni
        if(cameraDisponibile != null){
            Prenotazione prenotazione = new Prenotazione(cliente,cameraDisponibile);
            for(int i=0;i<prenotazioni.length;i++){
                if(prenotazioni[i] == null){
                    prenotazioni[i] = prenotazione;
                   
                    return prenotazione;

                }
            }
        }
        return null;
    }
    public void disdici(Prenotazione prenotazione){
        //cerca prenotazione nell'array Prenotazione[]
        //elimina prenotazione da Prenotazione[]
        for(int i =0; i<prenotazioni.length;i++){
            if(prenotazioni[i] != null && prenotazioni[i].equals(prenotazione)){
                prenotazioni[i].getCamera().setDisponibile(false);
                prenotazioni[i] = null;
            }
        }

    }



}
