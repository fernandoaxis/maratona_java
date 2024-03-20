package dominioteste;
import dominio.Estudante;
import dominio.ImpressoraEstudante;
public class EstudanteTeste01 {
	public static void main(String[] args) {
		Estudante estudante01 = new Estudante();
		Estudante estudante02 = new Estudante();
		ImpressoraEstudante impressora = new ImpressoraEstudante();
		
		
		estudante01.nome = "Midorya";
		estudante01.idade = 14;
		estudante01.sexo = 'M';
		
		estudante02.nome = "Alvara";
		estudante02.idade = 67;
		estudante02.sexo = 'F';
		
		impressora.imprime(estudante01);
		impressora.imprime(estudante02);
		
	}
}
