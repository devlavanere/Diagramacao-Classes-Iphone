package iphone.telefone;

public class Contato implements AparelhoTelefonico {
	 String nome;
	 String numero;

    Contato(String nome, String numero) {
        this.nome = nome;
        this.numero = numero;
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	@Override
	public void ligar(String numero) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atender() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void iniciarCorreioVoz() {
		// TODO Auto-generated method stub
		
	} 

}
