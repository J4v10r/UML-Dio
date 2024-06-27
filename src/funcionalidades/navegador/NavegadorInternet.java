package funcionalidades.navegador;

public class NavegadorInternet implements navegador{
    @Override
    public void exibirPagina() {
        System.out.println("exibindo página...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("adicionando nova aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("atualizar pagina...");
    }
}
