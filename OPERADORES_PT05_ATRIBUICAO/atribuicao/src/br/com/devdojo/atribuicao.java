package br.com.devdojo;

public class atribuicao {
	public static void main(String[] args) {
		// = += -= *= /= %=
		
		double bonus = 1800;
		bonus += 2000;
		bonus -= 1000;
		bonus *= 2;
		bonus /= 2;
		bonus %= 2;
		
		System.out.println(bonus);
		
		int contador = 0;
		contador += 1;
		contador++;
		contador--;
		++contador;
		--contador;
		
		System.out.println(contador);
	}
}
