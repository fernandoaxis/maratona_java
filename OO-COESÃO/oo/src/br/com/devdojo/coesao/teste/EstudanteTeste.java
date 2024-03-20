package br.com.devdojo.coesao.teste;

import br.com.devdojo.coesao.Estudante;

public class EstudanteTeste {
	public static void main(String[] args) {
		Estudante estudante = new Estudante();
		
		estudante.nome = "Soriano";
		estudante.idade = 72;
		estudante.sexo = 'M';
		
		System.out.println(estudante.nome);
		System.out.println(estudante.idade);
		System.out.println(estudante.sexo);

		
	}
}
