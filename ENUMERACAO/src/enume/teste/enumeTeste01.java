package enume.teste;
import enume.dominio.Cliente;
import enume.dominio.TipoCliente;
import enume.dominio.TipoPagameto;

public class enumeTeste01 {
	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA,TipoPagameto.DEBITO);
		Cliente cliente2 = new Cliente("Tsubasa", TipoCliente.PESSOA_JURIDICA, TipoPagameto.CREDITO);

		System.out.println(cliente1);
		System.out.println(cliente2);
		System.out.println(TipoPagameto.DEBITO.calcularDescontro(100));
		System.out.println(TipoPagameto.CREDITO.calcularDescontro(100));

	}
}
