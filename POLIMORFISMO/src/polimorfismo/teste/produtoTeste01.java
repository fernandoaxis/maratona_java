package polimorfismo.teste;

import polimorfismo.dominio.Computador;
import polimorfismo.dominio.Televisao;
import polimorfismo.dominio.Tomate;
import polimorfismo.servico.calculadoraImposto;

public class produtoTeste01 {
	public static void main(String[] args) {
		Computador computador = new Computador("NUC10i7", 11000);
		Tomate tomate = new Tomate("Vermelho", 7);
		Televisao tv = new Televisao("Samsung", 5000);
		
		
		calculadoraImposto.calcularImposto(computador);
		System.out.println("--------------------------");
		calculadoraImposto.calcularImposto(tomate);
		System.out.println("--------------------------");
		calculadoraImposto.calcularImposto(tv);
		
	}
}
