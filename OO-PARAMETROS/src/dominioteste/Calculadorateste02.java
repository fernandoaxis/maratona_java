package dominioteste;

import dominio.Calculadora;

public class Calculadorateste02 {
	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		double resultado = calculadora.diviDoisNumeros(5, 2);
		double resultado2 = calculadora.diviDoisNumeros2(10,3);		
		
		System.out.println(resultado);
		System.out.println(resultado2);
		System.out.println("--------------------");
		
		calculadora.imprimeDivisaoDeDoisNumeros(8, 0);

	}
}
