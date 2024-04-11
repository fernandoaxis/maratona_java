package classes_abstratasTeste01;
import classes_abstratas.dominio.Funcionario;
import classes_abstratas.dominio.Gerente;
import classes_abstratas.dominio.Desenvolvedor;

public class FuncionarioTeste01 {
	public static void main(String[] args) {
		Gerente gerente = new Gerente("Naruto", 7000);
		Desenvolvedor dev = new Desenvolvedor("Korra", 20000);
		
		System.out.println(gerente);
		System.out.println(dev);
		gerente.imprime();
		dev.imprime();
	}
}
