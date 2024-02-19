package br.com.devdojo;

public class TiposPrimitivos {
	public static void main(String[] args) {
		/*Casting é se baseia em forçar a entrada de um valor associado a um
		 * tipo primitivo para dentro de um outro 
		*  tipo primitivo. 
		*/
		
		int idade = (int)10000000000L;
		long numeroGrande = 1000000;
		double salarioDouble = 2500;
		float salarioFloat = 2500;
		byte idadeByte = -128;
		short idadeShort = 10;
		boolean verdadeiro = true;
		boolean falso = false;
		char caractere = 'M';
		
		System.out.println("A idade é: " + idade + " anos");
		System.out.println(falso);
		System.out.println("char " + caractere);
	}
}
