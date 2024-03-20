package dominioteste;
import dominio.Anime01;

public class AnimeTeste01 {
	public static void main(String[] args) {
		Anime01 anime = new Anime01();
		
		anime.init("Fullmetal", "TV", 29, "Ação");
		anime.imprime();
	}
}
