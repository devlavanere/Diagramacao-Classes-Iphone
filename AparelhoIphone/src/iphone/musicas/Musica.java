package iphone.musicas;

public class Musica implements ReprodutorMusical{
	private String titulo;
    private String artista;
    private int duracao;

    Musica(String titulo, String artista, int duracao) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracao = duracao;
    }

	public String getTitulo() {
		// TODO Auto-generated method stub
		return titulo;
	}

	public String getArtista() {
		// TODO Auto-generated method stub
		return artista;
	}

	@Override
	public void tocar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pausar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void selecionarMusica(Musica musica) {
		// TODO Auto-generated method stub
		
	}

}
