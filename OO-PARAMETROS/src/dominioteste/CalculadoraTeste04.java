package dominioteste;
import dominio.Calculadora;

public class CalculadoraTeste04 {
	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		int[] numeros = {1,2,3,4,5};
		calculadora.somaArray(numeros);
		calculadora.somaVarArgs(numeros);
	}
}
