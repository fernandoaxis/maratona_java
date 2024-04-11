package interfaces.dominio;

public class fileLoader implements DatabseLoader, DataRemover{
	
	@Override
	public void load() {
		System.out.println("...");
	}

	@Override
	public void remove() {
		System.out.println("Removendo");
		
	}
	
	@Override
	public void checkPermission() {
		System.out.println("Checando permissoes no arquivo");
	}
}
