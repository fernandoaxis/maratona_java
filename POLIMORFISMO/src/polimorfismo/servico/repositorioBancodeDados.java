package polimorfismo.servico;

import repositorio.Repositorio;

public class repositorioBancodeDados implements Repositorio {

	@Override
	public void salvar() {
		System.out.println("Salvando em db");
		
	}

}
