package Exercicio7;

public abstract class Funcionario {
	
	private String Nome;
	private int Idade;
	private double Salario;
	
	Funcionario (String Nome, int Idade, double Salario) {
		this.Nome = Nome;
		this.Idade = Idade;
		this.Salario = Salario;
	}
	
	
	
	public String getNome() {
		return Nome;
	}



	public void setNome(String nome) {
		Nome = nome;
	}



	public int getIdade() {
		return Idade;
	}



	public void setIdade(int idade) {
		Idade = idade;
	}



	public double getSalario() {
		return Salario;
	}



	public void setSalario(double salario) {
		Salario = salario;
	}



	public abstract double Bonificacao() ;
	
	public void mostrar () {
		System.out.println(getNome() + " " + getIdade() + " " + getSalario());
	}

}
