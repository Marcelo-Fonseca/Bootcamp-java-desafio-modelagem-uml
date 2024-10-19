package smartphone;

import internet.NavegadorDeInternet;
import reprodutor.ReprodutorMusical;
import telefone.AparelhoTelefonico;

public class SmartPhone implements NavegadorDeInternet, ReprodutorMusical, AparelhoTelefonico {

//navegador de internet (Browser)
    @Override
    public void abrirNavegador() {
        System.out.println("Abrindo navegador Google");

    }

    @Override
    public void abrirYahoo() {
        System.out.println("Abrindo Yahoo!!");

    }

    @Override
    public void enviarEmail() {
        System.out.println("Enviando Email ");

    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrindo nova aba no  navegador Google");

    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando Pagina aberta");

    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo Pagina...");

    }
//Reprodutor de Musica IPOD
    @Override
    public void tocarMusica() {
        System.out.println("Tocando musica...");

    }

    @Override
    public void pausarMusica() {
        System.out.println("Pausando Musica");

    }

    @Override
    public void trocarMusica() {
        System.out.println("Trocando Musica");

    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando Musica");

    }

    @Override
    public void fecharMusica() {
        System.out.println("Fechando Musica");

    }
    //Aparelho de Telefone(celular)

    @Override
    public void fazerLigacao() {
        System.out.println("Ligando para o contato escolhido!!");

    }

    @Override
    public void desligarLigacao() {
        System.out.println("Ligação Desligada com sucesso");

    }

    @Override
    public void atenderLigacao() {
        System.out.println("Atendendo Ligação!!");

    }

    @Override
    public void enviarSms() {
        System.out.println("Enviando Sms");

    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando Correio de Voz!!");

    }
}
