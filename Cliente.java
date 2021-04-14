package org.corso.albergo;

public class Cliente {
    private String cognome;
    private String nome;
    private String codiceFiscale;

    

    public String getCognome() {
        return cognome;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCodiceFiscale() {
        return codiceFiscale;
    }
    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }
    public Cliente(String cognome, String nome, String codiceFiscale) {
        this.cognome = cognome;
        this.nome = nome;
        this.codiceFiscale = codiceFiscale;
    }
    
}
