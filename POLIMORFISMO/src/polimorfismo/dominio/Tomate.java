package polimorfismo.dominio;

public class Tomate extends Produto{
	public static final double IMPOSTO_POR_CENTO = 0.10;
	public String dataDeValidade;
	
	public Tomate(String nome, double valor) {
		super(nome, valor);
	}
	
	
	
	public String getDataDeValidade() {
		return dataDeValidade;
	}



	public void setDataDeValidade(String dataDeValidade) {
		this.dataDeValidade = dataDeValidade;
	}



	@Override
	public double calcularImposto() {
		System.out.println("Calculando imposto do tomate");
		return this.valor * IMPOSTO_POR_CENTO ;
	}
	
}
