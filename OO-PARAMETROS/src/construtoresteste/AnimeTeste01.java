package construtoresteste;
import construtoresdominio.Anime;

public class AnimeTeste01 {
	public static void main(String[] args) {
		Anime anime = new Anime("Naruto", "TV",12,"Aventura", "Gibi");
		Anime anime2 = new Anime();
		anime.imprime();
		anime2.imprime();
	}
}
