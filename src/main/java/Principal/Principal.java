package Principal;

import modelos.MeusFavoritos;
import modelos.Musicas;
import modelos.Podcasts;

public class Principal {
    public static void main(String[] args) {

        System.out.println("--------------Musicas-------------------------");
        System.out.println();

        Musicas minhaMusica = new Musicas();
        minhaMusica.setTitulo("Nothing else mathers");
        minhaMusica.setArtista("Metallica");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduzir();

        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curtir();
        }

        System.out.println("--------------Podcasts-------------------------");
        System.out.println();

        Podcasts podcasts = new Podcasts();
        podcasts.setTitulo("BolhaDev");
        podcasts.setApresentador("Ricardo");

        for (int i = 0; i < 3000; i++) {
            podcasts.reproduzir();
        }

        for (int i = 0; i < 1000 ; i++) {
            podcasts.curtir();
        }

        MeusFavoritos meusFavoritos = new MeusFavoritos();
        meusFavoritos.inclui(podcasts);
        meusFavoritos.inclui(minhaMusica);

    }
}


/*sera criada outra classe onde eu vou incluir o meu podcast e a minha musica e vou ter uma classificação baseada em curtida ou reprodução
e isso pode ser diferente. Por exemplo a classificação para o Podcast vai se basear na reprodução e por na musica será baseada na curtida.

Entao podemos fazer alguma coisa diferente  para obter essa classificação   */
