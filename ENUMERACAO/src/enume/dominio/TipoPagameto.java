package enume.dominio;
public enum TipoPagameto{
	DEBITO{
		@Override
		public double calcularDescontro(double valor) {return valor * 0.1;}}, 
	
	CREDITO{
			@Override
			public double calcularDescontro(double valor) {return valor * 0.5;}};
	
		public abstract double calcularDescontro(double valor);
}
