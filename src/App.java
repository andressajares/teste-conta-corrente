import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {


		List<ContaCorrente> contas = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			contas.add(new ContaCorrente(i + 1));
			
		}
		
		for (ContaCorrente contaCorrente : contas) {
			contaCorrente.depositar(Math.random() * 200);
			if(contaCorrente.getSaldo() > 100) {
				try {
					contaCorrente.sacar(30);
				} catch (SaldoInsuficienteException e) {
					e.printStackTrace();
				}
			}
			System.out.println(contaCorrente.getSaldo());
			
		}

	}

}
