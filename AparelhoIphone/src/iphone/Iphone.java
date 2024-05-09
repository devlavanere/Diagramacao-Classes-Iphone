package iphone;

import java.util.ArrayList;
import java.util.List;

import iphone.musicas.Musica;
import iphone.musicas.ReprodutorMusical;
import iphone.navegador.NavegadorInternet;
import iphone.telefone.AparelhoTelefonico;

public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet {
	
		private List<Musica> playlist;
		private boolean emChamada;
	
	    public Iphone() {
	        this.playlist = new ArrayList<>();
	        this.emChamada = false;
	    }
	    
	    @Override
	    public void tocar() {
	        if (!playlist.isEmpty()) {
	            Musica musicaAtual = playlist.get(0);
	            System.out.println("Tocando música: " + musicaAtual.getTitulo() + " - " + musicaAtual.getArtista());
	        } else {
	            System.out.println("Playlist vazia. Adicione músicas para tocar.");
	        }
	    }
	    
	    @Override
	    public void pausar() {
	    	System.out.println("Música pausada");
	    }
	    
	    @Override
	    public void selecionarMusica(Musica musica) {
	        playlist.add(musica);
	    }
	    
	    @Override
	    public void ligar(String numero) {
	    	if (!emChamada) {
	            System.out.println("Ligando para " + numero);
	            emChamada = true;
	        } else {
	            System.out.println("Já existe uma chamada em andamento");
	        }

	    }

	    @Override
	    public void atender() {
	    	 if (emChamada) {
	             System.out.println("Atendendo chamada");
	             emChamada = false;
	         } else {
	             System.out.println("Não há chamadas para atender");
	         }

	    }
	    
	    @Override
	    public void iniciarCorreioVoz() {
	    	if (!emChamada) {
	    		System.out.println("Iniciando correio de voz");
	    	} else {
	    		System.out.println("Não é possível iniciar correio de voz durante uma chamada");
	    	}
	    	
	    }
	    
	    @Override
	    public void exibirPagina(String url) {
	    	System.out.println("Exibindo página: " + url);
	    }
	    
	    @Override
	    public void adicionarNovaAba(String url) {
	    	System.out.println("Adicionando nova aba" + url);
	    }
	    
	    @Override
	    public void atualizarPagina() {
	    	System.out.println("Atualizando página");
	    }

}
