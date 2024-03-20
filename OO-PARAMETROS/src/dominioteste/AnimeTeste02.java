package dominioteste;
import dominio.Anime02;

public class AnimeTeste02 {
	public static void main(String[] args) {
		Anime02 anime = new Anime02("One Piece");
		
		System.out.println(anime.getNome());
		for (int episodio : anime.getEpisodios()) {
			System.out.print(episodio + " ");
		}
	}
}
