package br.com.devdojo.coesao.teste;

import br.com.devdojo.coesao.Professor;

public class ProfessorTeste {
	public static void main(String[] args) {
		Professor professor = new Professor();
		professor.nome = "Mestre Kami";
		professor.idade = 92;
		professor.sexo = 'M';
		
		System.out.println(professor.nome + " " + professor.idade + " " + professor.sexo);
	}
}
