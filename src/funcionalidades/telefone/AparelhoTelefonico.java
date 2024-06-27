package funcionalidades.telefone;

public class AparelhoTelefonico implements telefone{
    @Override
    public void iniciarCorreioVoz() {
        System.out.println("iniciando correio de voz...");
    }

    @Override
    public void atender() {
        System.out.println("atendendo...");
    }

    @Override
    public void ligar() {
        System.out.println("ligando...");
    }
}
