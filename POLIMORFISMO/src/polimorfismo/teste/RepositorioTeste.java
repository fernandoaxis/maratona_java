package polimorfismo.teste;

import polimorfismo.servico.repositorioArquivo;
import polimorfismo.servico.repositorioBancodeDados;
import repositorio.Repositorio;
import java.util.ArrayList;
import java.util.List;

public class RepositorioTeste {
	public static void main(String[] args) {
		Repositorio rdb = new repositorioArquivo();
		rdb.salvar();
		
		List<String> list = new ArrayList<>();
		
		list.add("Goku");
		list.add("Naruto");
		list.add("Saitama");

	}
}
