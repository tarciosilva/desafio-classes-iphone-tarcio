import smartphone.iphone.Iphone;

public class App {
    public static void main(String[] args) throws Exception {
        Iphone iphone = new Iphone();
        
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();

        iphone.ligar();
        iphone.pausar();
        iphone.iniciarCorreioDeVoz();
        iphone.atender();

        iphone.exibirPagina();
        iphone.adicionarNovaPagina();
        iphone.atualizarPagina();
    }
}
