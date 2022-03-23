package br.com.tech4me.tech4music.controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tech4me.tech4music.service.MusicaService;
import br.com.tech4me.tech4music.shared.MusicaDto;

@RestController
@RequestMapping("/api/musicas")
public class MusicaController {  

    ModelMapper mapper = new ModelMapper();

    @Autowired
    private MusicaService servico;

    @GetMapping
    public ResponseEntity<List<MusicaDto>> obterMusicas() {
        
        List<MusicaDto> musicaDto = servico.obterTodasMusicas();

        List<MusicaDto> musicas = musicaDto.stream()
        .map(l -> mapper.map(l, MusicaDto.class))
        .collect(Collectors.toList());

        return new ResponseEntity<>(musicas, HttpStatus.OK);

    }

    @GetMapping("/{id}")
    public ResponseEntity<MusicaDto> obterMusicaId(@PathVariable @Valid String id) {

        Optional<MusicaDto> musica = servico.obterMusicaPeloId(id);

        if(musica.isPresent()) {
            return new ResponseEntity<>(mapper.map(musica.get(), MusicaDto.class), HttpStatus.FOUND);

        }

        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    
    @PostMapping
    public ResponseEntity<MusicaDto> postMusica(@RequestBody @Valid MusicaDto musicas) {
        return new ResponseEntity<>(servico.armazenarMusica(musicas), HttpStatus.CREATED);
    }
    
    @DeleteMapping("/{id}") //Caso não for encontrado retorna vazio
    public ResponseEntity<Void> deletarMusica(@PathVariable String id) {
        servico.deletarMusicaPeloId(id);

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<MusicaDto> atualizarMusica(@PathVariable String id,
        @RequestBody @Valid MusicaDto musica) {
        musica.setId(id);

        return new ResponseEntity<>(servico.atualizarMusica(id, musica), HttpStatus.ACCEPTED);
    }

                
}
    




    

