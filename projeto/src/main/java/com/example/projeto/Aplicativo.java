package com.example.projeto;

import java.util.ArrayList;
import java.util.List;

public class Aplicativo {

    private List<Musica> musicas = new ArrayList<Musica>();

    public void executarMusica(Musica musica) {
        this.musicas.add(musica);
        musica.executar();
    }

    public void cancelarUltimaAcao() {
        if (musicas.size() != 0) {
            Musica musica = this.musicas.get(this.musicas.size() - 1);
            musica.apagar();
            this.musicas.remove(this.musicas.size() - 1);
        }
    }
}
