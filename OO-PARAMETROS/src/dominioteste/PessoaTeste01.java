package dominioteste;
import dominio.Pessoa;

public class PessoaTeste01 {
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Edward");
		pessoa.setIdade(15);
		
		System.out.println(pessoa.getNome());
		System.out.println(pessoa.getIdade());
		
		
	}
}
