package padroescriacao.abstractfactory;

public class FactoryRap implements IMusicaFactory {

    @Override
    public IMusica criarMusica() {
        return new MusicaRap();
    }

    @Override
    public IAlbum criarAlbum() {
        return new AlbumRap();
    }
}