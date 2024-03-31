package heranca.dominio;

public class Endereco {
	private String rua;
	private String cep;
	
	public void imprime() {
		Pessoa pessoa = new Pessoa("sasa");
	}

	
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	//Com protected consigo acessar atributos com fosse public de qualquer lugar
	//Estando dentro do pacote ou extendendo
	
	
	
}
