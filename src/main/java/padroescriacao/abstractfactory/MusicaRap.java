package padroescriacao.abstractfactory;

public class MusicaRap implements IMusica {
    @Override
    public String tocar() {
        return "Tocando música de Rap";
    }
}
