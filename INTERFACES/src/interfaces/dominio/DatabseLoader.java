package interfaces.dominio;

public interface DatabseLoader {
	
	public static final int MAX_DATA_SIZE=10;
	public abstract void load();
	
	default void checkPermission() {
		System.out.println("Fazendo checagem de permissoes");
	}
	
	public static void retrieveMaxDataSize() {
		System.out.println("Dentro da retrieveMaxDataSize na interface");
	}
	
}
