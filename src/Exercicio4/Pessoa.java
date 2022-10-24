package Exercicio4;


public class Pessoa{
	
	private String Nome;
	private int Idade;
	
	public Pessoa (String Nome, int Idade) {
		this.Nome = Nome;
		this.Idade = Idade;
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



	public void mostrar () {
		System.out.println("Nome: " + Nome + ", Idade: " + Idade);
	}


}
