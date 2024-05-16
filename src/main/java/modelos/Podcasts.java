package modelos;

import modelos.Audio;

public class Podcasts extends Audio {

    String apresentador;
    String descricao;

    //metodos

    @Override
    public int getClassificacao(){
        if(this.getTotalDeCurtidas() > 500){
            return 10;
        } else {
            return 8;
        }
    }

    //getters and setters

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String host) {
        this.apresentador = host;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
