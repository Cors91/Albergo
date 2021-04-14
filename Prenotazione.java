package org.corso.albergo;

public class Prenotazione {
    private Cliente cliente;
    private Camera camera;
    private String idPrenotazione;
    private static int ultimaPrenotazione=0;
    

    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Camera getCamera() {
        return camera;
    }
    public void setCamera(Camera camera) {
        this.camera = camera;
    }
    public String getIdPrenotazione() {
        return idPrenotazione;
    }
    public void setIdPrenotazione(String idPrenotazione) {
        this.idPrenotazione = idPrenotazione;
    }
    public Prenotazione(Cliente cliente, Camera camera) {
        this.cliente = cliente;
        this.camera = camera;
        this.camera.setDisponibile(true);
        idPrenotazione = "" + ultimaPrenotazione++;
    }
    public Prenotazione() {
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((idPrenotazione == null) ? 0 : idPrenotazione.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Prenotazione other = (Prenotazione) obj;
        if (idPrenotazione == null) {
            if (other.idPrenotazione != null)
                return false;
        } else if (!idPrenotazione.equals(other.idPrenotazione))
            return false;
        return true;
    }
    
    
}
