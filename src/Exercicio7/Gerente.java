package Exercicio7;

public class Gerente extends Funcionario{

	Gerente(String Nome, int Idade, double Salario) {
		super(Nome, Idade, Salario);		
	}

	@Override
	public double Bonificacao() {
		setSalario(getSalario() + 10000);
		return getSalario();
	}
	


}
