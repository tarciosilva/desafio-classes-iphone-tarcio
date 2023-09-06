package smartphone.iphone;

import smartphone.Apps.Internet;
import smartphone.Apps.Ipod;
import smartphone.Apps.Phone;

public class Iphone implements Ipod, Phone, Internet {

    @Override
    public void pausar() {
        System.out.println("Pausando Reprdução");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionado Faixa");
    }

    @Override
    public void tocar() {
        System.out.println("Reproduzindo");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo Chamada\nApagando Tela");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando Correios de Voz");
        
    }

    @Override
    public void ligar() {
        System.out.println("Ligando \n Apagando Tela");
        
    }

    @Override
    public void adicionarNovaPagina() {
        System.out.println("Adicionando Nova Página");
        
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando Página");
        
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo Pagina");
        
    }
    
}
