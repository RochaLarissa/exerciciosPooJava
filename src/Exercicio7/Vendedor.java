package Exercicio7;

public class Vendedor extends Funcionario{

	Vendedor(String Nome, int Idade, double Salario) {
		super(Nome, Idade, Salario);
	}

	@Override
	public double Bonificacao() {
		setSalario(getSalario() + 3000);
		return getSalario();
	}

}
