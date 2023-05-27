package com.example.projeto;

public class CriaPlaylistMusica implements Musica{

    private Playlist playlist;

    public CriaPlaylistMusica(Playlist playlist) {
        this.playlist = playlist;
    }

    public void executar() {
        this.playlist.criarPlaylist();
    }

    public void apagar() {this.playlist.apagarPlaylist();}
}
