package modelos;

import modelos.Audio;

public class Musicas extends Audio {

    String album;
    String artista;
    String genero;


    //metodos
    @Override
    public int getClassificacao(){
        if(this.getTotalDeReproducoes() > 2000) {
            return 10;
        }
        else{
            return 7;
        }
    }








    //getters and setters


    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
