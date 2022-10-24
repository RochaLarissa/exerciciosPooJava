package Exercicio7;

public class Main {

	public static void main(String[] args) {

		Gerente gerente = new Gerente("Eduardo", 58, 25000);
		Supervisor supervisor = new Supervisor("Rubens", 40, 15000);
		Vendedor vendedor = new Vendedor("José", 37, 9000);
		
		gerente.mostrar();
		supervisor.mostrar();
		vendedor.mostrar();
		
		System.out.println("\nValores após a bonificação:");
		gerente.Bonificacao();
		supervisor.Bonificacao();
		vendedor.Bonificacao();
		gerente.mostrar();
		supervisor.mostrar();
		vendedor.mostrar();
	}

}
