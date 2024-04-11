package interfacess;

import interfaces.dominio.DBLoader;
import interfaces.dominio.fileLoader;

public class databaseLoaderTeste {
	public static void main(String[] args) {
		fileLoader fileload = new fileLoader();
		DBLoader dbld = new DBLoader();
		
		dbld.load();
		fileload.load();
		
		dbld.remove();
		fileload.remove();
		
		dbld.checkPermission();
		fileload.checkPermission();
		
		dbld.retrieveMaxDataSize();

	}
}
