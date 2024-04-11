package classes_abstratas.dominio;
import classes_abstratas.dominio.Funcionario;

public class Gerente extends Funcionario {

	public Gerente(String nome, double salario) {
		super(nome, salario);
	}

	@Override
	public void calculaBonus() {
		this.salario = this.salario + this.salario * 0.2;
	}

}
