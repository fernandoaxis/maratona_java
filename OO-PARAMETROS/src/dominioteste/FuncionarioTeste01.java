package dominioteste;
import dominio.Funcionario;

public class FuncionarioTeste01 {
	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();		
		
		funcionario.setNome("Carlos Eduard");
		funcionario.setIdade(18);
		funcionario.setSalarios(new double[] {1200,987.32,2000});

		funcionario.imprimir();
		funcionario.imprimeMediaSalarial();
		
	}
}
