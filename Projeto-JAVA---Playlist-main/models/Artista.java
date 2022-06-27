package models;

import models.contracts.IArtista;

public class Artista implements IArtista {

    private String artista;

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }
    
    @Override
    public String toString() {
        return

        " | Artista : " + artista + " ";

    }
}