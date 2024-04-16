package polimorfismo.servico;

import polimorfismo.dominio.Computador;
import polimorfismo.dominio.Produto;
import polimorfismo.dominio.Tomate;

public class calculadoraImposto {
	public static void calcularImposto(Produto produto) {
		System.out.println("Relatorio de imposto");
		
		double imposto = produto.calcularImposto();
		
		System.out.println("Produto: " + produto.getNome());
		System.out.println("Preco " + produto.getValor());
		System.out.println("Imposto a ser pago" + imposto);
		
		if(produto instanceof Tomate) {
			String dataValidadeString = ((Tomate) produto).getDataDeValidade();
			System.out.println(dataValidadeString);	
		}
		
	
		
	}
}
