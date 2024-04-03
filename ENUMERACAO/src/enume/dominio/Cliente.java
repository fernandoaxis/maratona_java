package enume.dominio;

public class Cliente {

	private String nome;
	private TipoCliente tipoCliente;
	private TipoPagameto tipoPagamento;
	
	public Cliente(String nome, TipoCliente tipoCliente, TipoPagameto tipoPagamento) {
		this.nome = nome;
		this.tipoCliente = tipoCliente;
		this.tipoPagamento = tipoPagamento;
	}

	@Override
	public String toString() {
	    return "Cliente [nome=" + nome 
	            + ", tipoCliente=" + tipoCliente 
	            + ", tipoPagamento=" + tipoPagamento 
	            + ", tipoClienteInt=" + tipoCliente.getValor() + "]";
	}
	
	
	
	
	
	
}
