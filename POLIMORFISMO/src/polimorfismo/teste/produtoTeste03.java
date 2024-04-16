package polimorfismo.teste;

import polimorfismo.dominio.Tomate;
import polimorfismo.servico.calculadoraImposto;
import polimorfismo.dominio.Computador;

public class produtoTeste03 {
public static void main(String[] args) {
	Tomate tomate = new Tomate("Vermelho", 20);
	Computador c = new Computador("Teste",2222);
	
	tomate.setDataDeValidade("20/11/2014");
	
	calculadoraImposto.calcularImposto(tomate);
	calculadoraImposto.calcularImposto(c);

}

}
