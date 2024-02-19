package br.com.devdojo;

public class operadores {
	public static void main(String[] args) {
		// && (AND) :: (or) :: !
		
		int idade = 32;
		float salario = 2405F;
		boolean isDentroDalei = idade > 30 && salario >= 4299;
		boolean isDentroDalei2 = idade > 30 && salario >= 2200;

		System.out.println(isDentroDalei);
		System.out.println(isDentroDalei2);

	}
}
