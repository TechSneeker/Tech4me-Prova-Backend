package br.com.tech4me.tech4music.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tech4me.tech4music.model.Musica;
import br.com.tech4me.tech4music.repository.MusicaRepository;
import br.com.tech4me.tech4music.shared.MusicaDto;


@Service
public class MusicaServiceImpl implements MusicaService {

    ModelMapper mapper = new ModelMapper();

    @Autowired
    private MusicaRepository repositorio;
    
    @Override
    public List<MusicaDto> obterTodasMusicas() {
        List<Musica> musicas = repositorio.findAll();

        return musicas.stream()
        .map(l -> mapper.map(l, MusicaDto.class))
        .collect(Collectors.toList());
    }

    @Override
    public Optional<MusicaDto> obterMusicaPeloId(String id) {
        Optional<Musica> musica = repositorio.findById(id);
        
        if(musica.isPresent()) {
            return Optional.of(mapper.map(musica.get(), MusicaDto.class));
        }

        return Optional.empty();
    }

    @Override
    public MusicaDto armazenarMusica(MusicaDto musica) {
        Musica saveMusica = mapper.map(musica, Musica.class);
        saveMusica = repositorio.save(saveMusica);
        return mapper.map(saveMusica, MusicaDto.class);
    }

    @Override
    public void deletarMusicaPeloId(String id) {
        repositorio.deleteById(id);
    }

    @Override
    public MusicaDto atualizarMusica(String id, MusicaDto musica) {
        Musica attMusica = mapper.map(musica, Musica.class);
        attMusica.setId(id);
        attMusica = repositorio.save(attMusica);

        return mapper.map(attMusica, MusicaDto.class);
    }

  


    
}
