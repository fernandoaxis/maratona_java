package teste;
import modificadofinal.dominio.Carro;
import modificadofinal.dominio.Comprador;
import modificadofinal.dominio.Ferrari;

public class CarroTeste01 {
	public static void main(String[] args) {
		Carro carro = new Carro();
		
		System.out.println(Carro.VELOCIDADE_LIMITE);
		carro.COMPRADOR.setNome("Kuririn");
		System.out.println(carro.COMPRADOR);
		
		Ferrari ferrari = new Ferrari();
		ferrari.setNome("Enzo");
		ferrari.imprime();
		
		//Tudo errado, só quis completar a aula '-'
	}
}
