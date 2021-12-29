
public interface Movimentavel {

	void depositar(double valor);

	void sacar(double valor) throws SaldoInsuficienteException;

}