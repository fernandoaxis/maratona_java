package interfaces.dominio;
import interfaces.dominio.DataRemover;

public class DBLoader implements DatabseLoader, DataRemover {
	
	@Override
	public void load() {
		System.out.println("Carregando");
	}

	@Override
	public void remove() {
		System.out.println("Removendo");
		
	}
	
	@Override
	public void checkPermission() {
		System.out.println("Checando permissoes no banco de dados");
	}
	
	public static void retrieveMaxDataSize() {
		System.out.println("Dentro da retrieveMaxDataSize na DBLoader");
	}
	
}
