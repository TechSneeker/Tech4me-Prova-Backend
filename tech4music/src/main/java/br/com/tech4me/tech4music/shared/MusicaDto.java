package br.com.tech4me.tech4music.shared;

/*
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
*/

public class MusicaDto {

    private String id;
    private String titulo;
    private String artista;
    private String album;
    private String genero;
    private Integer anoLancamento;
    private String compositor;

    /* "------ NotBlank/NotEmpty para futuros updates ------"
    @NotBlank(message = "O titulo da música não pode ser um caractere branco")
    @NotEmpty(message = "O titulo da música deve ser preenchido")
    private String titulo;
    @NotBlank(message = "O artista da música não pode ser um caractere branco")
    @NotEmpty(message = "O artista da música deve ser preenchido")
    private String artista;
    @NotBlank(message = "O album da música não pode ser um caractere branco")
    @NotEmpty(message = "O album da música deve ser preenchido")
    private String album;
    @NotBlank(message = "O gênero da música não pode ser um caractere branco")
    @NotEmpty(message = "O gênero da música deve ser preenchido")
    @Size(min = 2, message = "Preencha corretamente o gênero")
    private String genero;
    private Integer anoLancamento;
    @NotBlank(message = "O compositor da música não pode ser um caractere branco")
    @NotEmpty(message = "O compositor da música deve ser preenchido")
    private String compositor;
    */

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getArtista() {
        return artista;
    }
    public void setArtista(String artista) {
        this.artista = artista;
    }
    public String getAlbum() {
        return album;
    }
    public void setAlbum(String album) {
        this.album = album;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public Integer getAnoLancamento() {
        return anoLancamento;
    }
    public void setAnoLancamento(Integer anoLancamento) {
        this.anoLancamento = anoLancamento;
    }
    public String getCompositor() {
        return compositor;
    }
    public void setCompositor(String compositor) {
        this.compositor = compositor;
    }
    
}
