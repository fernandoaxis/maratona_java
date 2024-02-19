package br.com.devdojo;

public class operadorers {
	public static void main(String[] args) {
		
		// %
		int resto = 20 % 2;
		System.out.println(resto);
		
		//< > <= >= == !=
		boolean isDezMaiorQueVinte = 10 > 20;
		boolean isDezMenorQueVinte = 10 < 20;
		boolean isDezIgualAVinte = 10 == 20;
		boolean isDezIgualADez = 10 == 10;
		boolean isDezdiferenteDez = 10 != 10;

		System.out.println("Dez maior que 20?: " + isDezMaiorQueVinte);
		System.out.println("Dez menor que 20?: " + isDezMenorQueVinte);
		System.out.println("Dez igual a 20?: " + isDezIgualAVinte);
		System.out.println("Dez igual que 10?: " + isDezIgualADez);
		System.out.println("Dez diferente de 10?: " + isDezdiferenteDez);


		
	}
}
