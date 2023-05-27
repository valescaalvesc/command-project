package com.example.projeto;

public class ApagaPlaylistMusica implements Musica{
    private Playlist playlist;

    public ApagaPlaylistMusica(Playlist playlist) {
        this.playlist = playlist;
    }

    public void executar() {
        this.playlist.criarPlaylist();
    }

    public void apagar() {this.playlist.apagarPlaylist();}
}
