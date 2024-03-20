package dominioteste;
import dominio.Jogador;
import dominio.Time;
public class JogadorTeste03 {
	public static void main(String[] args) {
		Jogador jogador = new Jogador("Cafu");
		Jogador jogador2 = new Jogador("Pele");
		Time time = new Time("Brazil");
		
		Jogador[] jogadores = {jogador, jogador2};
		
		jogador.setTime(time);
		jogador2.setTime(time);
		
		time.setJogadores(jogadores);
		
		System.out.println("-----Jogador----");
		
		jogador.imprime();
		
		System.out.println("-----Jogador----");
		
		time.imprime();

	}
}
