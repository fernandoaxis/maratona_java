package br.com.devdojo;

public class ifelse {
	public static void main(String[] args) {
		
		int idade = 20;
		boolean isAutorizadoComprarBebida = idade >= 18;
		//  !
		
		if(isAutorizadoComprarBebida) {
			System.out.println("Autorizado a comprar bebida alcólica");
		}
	}
}
