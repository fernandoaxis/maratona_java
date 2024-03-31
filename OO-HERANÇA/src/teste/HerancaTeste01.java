package teste;
import heranca.dominio.Endereco;
import heranca.dominio.Pessoa;
import heranca.dominio.Funcionario;

public class HerancaTeste01 {
	public static void main(String[] args) {
		Endereco endereco = new Endereco();
		
		endereco.setRua("Rua 3");
		endereco.setCep("113000000");
		
		Pessoa pessoa = new Pessoa("Kyota");
		
		pessoa.setEndereco(endereco);
		
		pessoa.imprime();
		
		Funcionario funcionario = new Funcionario("Oda Nobunga");
		
		funcionario.setCpf("55555555");
		funcionario.setEndereco(endereco);
		funcionario.setSalario(21000);
		
		System.out.println("---------------");
		
		funcionario.imprime();
		
	}
}
