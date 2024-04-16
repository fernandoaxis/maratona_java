package polimorfismo.servico;

import repositorio.Repositorio;

public class repositorioArquivo implements Repositorio {

	@Override
	public void salvar() {
		System.out.println("Salvando em arquivo");
		
	}

}
