package br.com.devdojo.carro.introducaoclassesteste;

import br.com.devdojo.introducaoclasses.Carro;

public class CarroTeste {
	public static void main(String[] args) {
		Carro carro = new Carro();
		Carro carro2 = new Carro();
		
		carro.nome = "Idea";
		carro.modelo = "Atractive";
		carro.ano = 2012;
		
		carro2.nome = "Mustang";
		carro2.modelo = "SLA";
		carro2.ano = 2024;
		
		carro = carro2;
		
		System.out.println("Nome: " + carro.nome + "\nModelo: " + carro.modelo + "\nAno: " + carro.ano);
		System.out.println("-------------------");
		System.out.println("Nome: " + carro2.nome + "\nModelo: " + carro2.modelo + "\nAno: " + carro2.ano);

		
	}
}
