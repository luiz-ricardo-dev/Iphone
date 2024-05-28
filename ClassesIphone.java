// Interface para Reprodutor Musical
interface ReprodutorMusical {
    void tocar();
    void pausar();
    void selecionarMusica(String musica);
}

// Interface para Aparelho Telefônico
interface AparelhoTelefonico {
    void ligar(String numero);
    void atender();
    void iniciarCorreioVoz();
}

// Interface para Navegador na Internet
interface NavegadorInternet {
    void exibirPagina(String url);
    void adicionarNovaAba();
    void atualizarPagina();
}

// Classe iPhone que implementa todas as interfaces
class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    // Implementações dos métodos das interfaces
    public void tocar() {
        // Lógica para tocar música
    }

    public void pausar() {
        // Lógica para pausar música
    }

    public void selecionarMusica(String musica) {
        // Lógica para selecionar uma música
    }

    public void ligar(String numero) {
        // Lógica para fazer uma ligação
    }

    public void atender() {
        // Lógica para atender uma ligação
    }

    public void iniciarCorreioVoz() {
        // Lógica para iniciar o correio de voz
    }

    public void exibirPagina(String url) {
        // Lógica para exibir uma página na internet
    }

    public void adicionarNovaAba() {
        // Lógica para adicionar uma nova aba no navegador
    }

    public void atualizarPagina() {
        // Lógica para atualizar a página no navegador
    }
}
