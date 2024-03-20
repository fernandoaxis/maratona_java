package dominioteste;

import dominio.Professor;
import dominio.Escola;

public class EscolaTeste01 {
	public static void main(String[] args) {
		Professor professor1 = new Professor("Jiraya Sensei");
		Professor professor2 = new Professor("Kakashi");

		Professor[] professores = {professor1, professor2};
		Escola escola = new Escola("Konoha", professores);
		
		escola.imprime();
	}
}
