package dominio;

public class Calculadora {
	public void somarDoisNumeros() {
		System.out.println(10+10);	
		}
	public void subtrairDoisNumeros() {
		System.out.println(22-2);
	}
	
	public void multiplicaDoisNumeros(int num1, int num2) {
		System.out.println(num1 * num2);
	}
	
	public double diviDoisNumeros(double num1, double num2) {
		
		if(num2 == 0) {
			return 0;
		}
		
		return num1/num2;
	}
	
	public double diviDoisNumeros2(double num1, double num2) {
		
		if(num2 != 0) {
			return num1/num2; 
		}else {
			return 0;
		}
	}
	public void imprimeDivisaoDeDoisNumeros(double num1, double num2) {
		if(num2 == 0) {
			System.out.println("Não existe divisao por zero");
		}else {
			System.out.println(num1/num2);
		}
	}
	public void alteraDoisNumeros(int numero1, int numero2) {
		numero1 = 99;
		numero2 = 33;
		System.out.println("Dentro do alteraDoisNumeros");
		System.out.println("Numero1 " + numero1);
		System.out.println("numero2 " + numero2);
	}
	
	public void somaArray(int[] numeros) {
		int soma = 0;
		for(int num:numeros) {
			soma+=num;
		}
		System.out.println(soma);
	}
	
	public void somaVarArgs(int... numeros) {
		int soma = 0;
		for (int num : numeros) {
			soma += num;
		}
		System.out.println(soma);
	};
}
