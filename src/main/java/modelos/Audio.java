package modelos;

public class Audio {

    String Titulo;

    int duracao;
    int totalDeReproducoes;
    int totalDeCurtidas = 0;

    /*Posso ter diferentes classificações, por exemplo para Podcast e de repente ir para uma musica e eu vou querer subscrever isso num dado momento para
      praticar polimorfismo  */
    int classificacao;



    //metodos:

    public void curtir(){
        this.totalDeCurtidas++;
        //System.out.println("Total de curtidas = " + totalDeCurtidas);
    }

    public void reproduzir(){
        this.totalDeReproducoes++;
    }

    //getters and setters

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }



    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }



    public int getTotalDeCurtidas() {
        return totalDeCurtidas;
    }


    public int getClassificacao() {
        return classificacao;
    }

}
