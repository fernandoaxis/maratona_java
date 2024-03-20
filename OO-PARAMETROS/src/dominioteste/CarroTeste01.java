package dominioteste;

import dominio.Carro;

public class CarroTeste01 {
	public static void main(String[] args) {
		Carro c1 = new Carro("BMW", 280);
		Carro c2 = new Carro("FIAT IDEA", 180);
		Carro c3 = new Carro("MERCEDES", 300);
		
		Carro.setVelocidadeLimite(180);
		
		c1.imprime();
		c2.imprime();
		c3.imprime();


	}
}
