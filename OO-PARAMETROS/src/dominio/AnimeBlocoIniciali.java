package dominio;

public class AnimeBlocoIniciali {
//Inicializacao
	private String nome;
	private static int[] episodios;
	static {
		System.out.println("Dentro do bloco de inicializacao");
		episodios = new int[100];
		for(int i=0; i<episodios.length; i++) {
			episodios[i] = 1+i;
		}
	}
	
	public AnimeBlocoIniciali(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int[] getEpisodios() {
		return episodios;
	}

	public void setEpisodios(int[] episodios) {
		this.episodios = episodios;
	}
	
	
}
