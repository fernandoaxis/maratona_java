package classes_abstratas.dominio;
import classes_abstratas.dominio.Funcionario;

public class Desenvolvedor extends Funcionario {

	@Override
	public void calculaBonus() {
		this.salario = this.salario + this.salario * 0.05;
	}
	
	public Desenvolvedor(String nome, double salario) {
		super(nome, salario);
	}
}
