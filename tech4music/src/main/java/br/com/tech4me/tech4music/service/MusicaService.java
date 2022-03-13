package br.com.tech4me.tech4music.service;

import java.util.List;
import java.util.Optional;

import br.com.tech4me.tech4music.shared.MusicaDto;

public interface MusicaService {

    List<MusicaDto> obterTodasMusicas();

    Optional<MusicaDto> obterMusicaPeloId(String id);

    MusicaDto armazenarMusica(MusicaDto musica);

    void deletarMusicaPeloId(String id);

    MusicaDto atualizarMusica(String id, MusicaDto musica);
    
}
