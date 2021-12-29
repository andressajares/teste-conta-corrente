import java.util.Objects;

public class ContaCorrente extends Conta implements Movimentavel {

	private int id;
	public ContaCorrente(int id) {
		this.id = id;
	}

	@Override
	public void depositar(double valor) {
		//TODO Validar se valor é positivo
		saldo += valor;
	}
	
	@Override
	public void sacar(double valor) throws SaldoInsuficienteException {
		if(saldo - valor < 0) {
			throw new SaldoInsuficienteException("Não é possível sacar " + valor + " da conta");
		}
		
		saldo -= valor;	
	}

	public double getSaldo() {
		return saldo;
	}
	
	public int getId() {
		return id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContaCorrente other = (ContaCorrente) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return "ContaCorrente [id=" + id + ", saldo=" + saldo + "]";
	}
	
	
}
