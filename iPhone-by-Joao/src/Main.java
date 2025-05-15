public class Main {
    public static void main(String[] args) {
        IPhone meuIPhone = new IPhone("iPhone 15 Pro");
        
        // Usando como Reprodutor Musical
        meuIPhone.tocar();
        meuIPhone.selecionarMusica("Bohemian Rhapsody");
        meuIPhone.pausar();
        
        // Usando como Aparelho Telefônico
        meuIPhone.ligar("987654321");
        meuIPhone.atender();
        meuIPhone.iniciarCorreioVoz();
        
        // Usando como Navegador na Internet
        meuIPhone.exibirPagina("https://www.dio.me");
        meuIPhone.adicionarNovaAba();
        meuIPhone.atualizarPagina();
    }
}