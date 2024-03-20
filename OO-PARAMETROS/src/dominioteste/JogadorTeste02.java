package dominioteste;
import dominio.Time;
import dominio.Jogador;

public class JogadorTeste02 {
	public static void main(String[] args) {
		//Relacionamentos muitos para um
		Jogador jogador1 = new Jogador("Pelé");
		Time time1 = new Time("Seleção Brasileira");
		
		jogador1.setTime(time1);
		jogador1.imprime();
	}
}
