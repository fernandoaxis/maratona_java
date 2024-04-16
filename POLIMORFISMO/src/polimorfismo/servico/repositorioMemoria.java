package polimorfismo.servico;

import repositorio.Repositorio;

public class repositorioMemoria implements Repositorio{

	@Override
	public void salvar() {
		System.out.println("Salvando em memoria");
		
	}
	
}
