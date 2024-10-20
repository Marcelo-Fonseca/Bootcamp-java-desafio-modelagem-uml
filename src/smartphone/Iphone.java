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

        System.out.println("------*Desafio de UML e Java*-------------------");
        System.out.println("------IPhone7-------------------");
        //usando a intert----
        System.out.println("usando internet");
        iphone7.abrirNavegador();
        iphone7.adicionarNovaAba();
        iphone7.abrirYahoo();
        iphone7.enviarEmail();
        iphone7.exibirPagina();
        iphone7.atualizarPagina();
        System.out.println("-------------------------");
        //usando telefone
        System.out.println("usando telefone");
        iphone7.atenderLigacao();
        iphone7.desligarLigacao();
        iphone7.iniciarCorreioDeVoz();
        iphone7.enviarSms();
        System.out.println("-------------------------");
        //usando ipod
        System.out.println("usando ipod");
        iphone7.tocarMusica();
        iphone7.trocarMusica();
        iphone7.selecionarMusica();
        iphone7.fecharMusica();

    }
}
