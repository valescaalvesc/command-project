package com.example.projeto;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AplicativoTest {

    Aplicativo aplicativo;
    Playlist playlist;

    @BeforeEach
    void setUp() {
        aplicativo = new Aplicativo();
        playlist = new Playlist (15, 5);
    }

    @Test
    void deveCriarPlaylist() {
        Musica criaPlaylist = new CriaPlaylistMusica(playlist);
        aplicativo.executarMusica(criaPlaylist);

        assertEquals("Playlist criada", playlist.getSituacao());
    }

    @Test
    void deveApagarPlaylist() {
        Musica apagaPlaylist = new ApagaPlaylistMusica(playlist);
        aplicativo.executarMusica(apagaPlaylist);

        assertEquals("Playlist criada", playlist.getSituacao());
    }

    @Test
    void deveCancelarApagarPlaylist() {
        Musica criaPlaylistMusica = new CriaPlaylistMusica(playlist);
        Musica apagaPlaylistMusica = new ApagaPlaylistMusica(playlist);

        aplicativo.executarMusica(criaPlaylistMusica);
        aplicativo.executarMusica(apagaPlaylistMusica);

        aplicativo.cancelarUltimaAcao();

        assertEquals("Playlist apagada", playlist.getSituacao());
    }
}
