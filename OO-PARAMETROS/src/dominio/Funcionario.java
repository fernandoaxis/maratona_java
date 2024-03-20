package dominio;

public class Funcionario {
	private String nome;
	private int idade;
	private double[]salarios;
	private double media;
	
	public void imprimir() {
		System.out.println("----------------------------------------------");
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " +this.idade);
		for(double salario: salarios) {
			System.out.print("Salários: " + salario + " ");
		}
		System.out.println("\n----------------------------------------------");
	}
	
	public void imprimeMediaSalarial() {
		double media = 0;
		for(double salario: salarios) {
			media += salario;
		}
		
		media /= salarios.length;
		System.out.println("Media Salarial: " + media);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double[] getSalarios() {
		return salarios;
	}

	public void setSalarios(double[] salarios) {
		this.salarios = salarios;
	}

	public double getMedia() {
		return media;
	}
	
}
