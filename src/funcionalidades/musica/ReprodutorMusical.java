package funcionalidades.musica;

public class ReprodutorMusical implements reprodutorDeMusica{
    @Override
    public void selecionarMusica() {
        System.out.println("selecionando musica...");
    }

    @Override
    public void pausar() {
        System.out.println("pausando...");

    }

    @Override
    public void tocar() {
        System.out.println("tocando...");
    }
}
