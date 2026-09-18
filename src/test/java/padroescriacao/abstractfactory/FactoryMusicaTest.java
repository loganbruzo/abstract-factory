package padroescriacao.abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactoryMusicaTest {

    @Test
    void deveCriarFamiliaRap() {
        IMusicaFactory factory = new FactoryRap();

        assertTrue(factory.criarMusica() instanceof MusicaRap);
        assertTrue(factory.criarAlbum() instanceof AlbumRap);
    }

    @Test
    void deveCriarFamiliaTrap() {
        IMusicaFactory factory = new FactoryTrap();

        assertTrue(factory.criarMusica() instanceof MusicaTrap);
        assertTrue(factory.criarAlbum() instanceof AlbumTrap);
    }
}