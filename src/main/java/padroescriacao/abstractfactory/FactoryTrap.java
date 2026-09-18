package padroescriacao.abstractfactory;

public class FactoryTrap implements IMusicaFactory {

    @Override
    public IMusica criarMusica() {
        return new MusicaTrap();
    }

    @Override
    public IAlbum criarAlbum() {
        return new AlbumTrap();
    }
}