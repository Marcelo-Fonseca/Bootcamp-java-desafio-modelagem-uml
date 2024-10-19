package smartphone;

import internet.NavegadorDeInternet;
import reprodutor.ReprodutorMusical;
import telefone.AparelhoTelefonico;

public class Iphone {
    public static void main(String[]args) {
//criar iphone7
        SmartPhone iphone7 = new SmartPhone();
        AparelhoTelefonico smartphone = iphone7;
        NavegadorDeInternet internet = iphone7;
        ReprodutorMusical ipod = iphone7;

        //usando a intert----
        iphone7.abrirNavegador();
        iphone7.enviarEmail();
        //usando telefone
        iphone7.atenderLigacao();
        iphone7.iniciarCorreioDeVoz();
        //usando ipod
        iphone7.tocarMusica();
        iphone7.trocarMusica();
        iphone7.selecionarMusica();
        iphone7.fecharMusica();

    }
}
