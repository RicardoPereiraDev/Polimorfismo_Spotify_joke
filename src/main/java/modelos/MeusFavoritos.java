package modelos;

public class MeusFavoritos {

    public void inclui(Audio audio){
        if(audio.getClassificacao() >= 9){
            System.out.println(audio.getTitulo() + "é considerado sucesso absoluto" +
                    " e preferido por todos!");
        }
        else{
            System.out.println(audio.getTitulo() + " também é um dos que todo mundo está curtindo");
        }
    }
}


//Notas finais importante!

/*
 Esta classe vai receber uma variavel do tipo "Audio" e ela vai ter um comportamento diferente de acordo com o que
 for passado nessa inclusao, então trabalhamos com isto o polimorfismo

 */