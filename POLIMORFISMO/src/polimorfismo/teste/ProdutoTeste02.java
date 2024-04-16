package polimorfismo.teste;

import polimorfismo.dominio.Computador;
import polimorfismo.dominio.Produto;
import polimorfismo.dominio.Tomate;

public class ProdutoTeste02 {
	public static void main(String[] args) {
		Produto produto = new Computador("Ryzen 9", 3000);
		Produto produto2 = new Tomate("Sla 9", 17);

		System.out.println(produto.getNome());
		System.out.println(produto.calcularImposto());
		System.out.println(produto.getValor());
		
		System.out.println(produto2.getNome());
		System.out.println(produto2.calcularImposto());
		System.out.println(produto2.getValor());

	}
}
