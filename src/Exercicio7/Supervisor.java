package Exercicio7;

public class Supervisor extends Funcionario{

	Supervisor(String Nome, int Idade, double Salario) {
		super(Nome, Idade, Salario);
	}

	@Override
	public double Bonificacao() {
		setSalario(getSalario() + 5000);
		return getSalario();
	}

}
