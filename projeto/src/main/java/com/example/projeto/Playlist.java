package com.example.projeto;

public class Playlist {

    private int faixa;
    private int duracao;
    private String situacao;

    public Playlist(int faixa, int duracao) {
        this.faixa = faixa;
        this.duracao = duracao;
    }

    public String getSituacao() {
        return situacao;
    }

    public void criarPlaylist() {
        this.situacao = "Playlist criada";
    }

    public void apagarPlaylist() {
        this.situacao = "Playlist apagada";
    }
}
