package br.com.devdojo;

public class operadores {
	public static void main(String[] args) {
		double valorTotalContaCorrente = 200;
		double valorTotalContaPoupança = 10000;
		float valorPS = 5000;
		
		boolean isPsCincoCompravel = valorTotalContaCorrente > valorPS || 
		valorTotalContaPoupança > valorPS;
		System.out.println(isPsCincoCompravel);
		
	}
}
