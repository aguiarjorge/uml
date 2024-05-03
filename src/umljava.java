
public class umljava {
	// ReprodutorMusical.java
	public interface ReprodutorMusical {
	    void tocar();
	    void pausar();
	    void selecionarMusica();
	}

	// AparelhoTelefonico.java
	public interface AparelhoTelefonico {
	    void ligar();
	    void atender();
	    void iniciarChamadaVoz();
	}

	// NavegadorInternet.java
	public interface NavegadorInternet {
	    void exibirPagina();
	    void adicionarNovaAba();
	    void atualizarPagina();
	}

	// IPhone.java
	public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
	    // Implementações dos métodos da interface
	    @Override
	    public void tocar() {
	        // Implementação
	    }

	    @Override
	    public void pausar() {
	        // Implementação
	    }

	    @Override
	    public void selecionarMusica() {
	        // Implementação
	    }

	    @Override
	    public void ligar() {
	        // Implementação
	    }

	    @Override
	    public void atender() {
	        // Implementação
	    }

	    @Override
	    public void iniciarChamadaVoz() {
	        // Implementação
	    }

	    @Override
	    public void exibirPagina() {
	        // Implementação
	    }

	    @Override
	    public void adicionarNovaAba() {
	        // Implementação
	    }

	    @Override
	    public void atualizarPagina() {
	        // Implementação
	    }
	}

}
