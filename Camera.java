package org.corso.albergo;

public class Camera {
    private String nCamera;
    private boolean disponibile;


    public Camera(String nCamera){
        disponibile = false;
        this.nCamera=nCamera;
    }


    public String getnCamera() {
        return nCamera;
    }

    public void setnCamera(String nCamera) {
        this.nCamera = nCamera;
    }

    public boolean isDisponibile() {
        return disponibile;
    }

    public void setDisponibile(boolean disponibile) {
        this.disponibile = disponibile;
    }
    
}
