package Exercicio4;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa ("João", 15);
		Pessoa p2 = new Pessoa ("Leandro", 21);
		Pessoa p3 = new Pessoa ("Paulo", 17);
		Pessoa p4 = new Pessoa ("Jessica", 18);
		
		List <Pessoa> pessoas = new ArrayList<>();
		pessoas.add(p1);
		pessoas.add(p2);
		pessoas.add(p3);
		pessoas.add(p4);
		
		//Imprimindo a lista
		for (int i = 0; i < pessoas.size(); i++) {
			pessoas.get(i).mostrar();
		}
		
		//Imprimindo a pessoa mais velha
		int maisVelho = pessoas.get(0).getIdade();
		int indice = 0;
		for (int i = 0; i < pessoas.size(); i++) {
			if (pessoas.get(i).getIdade() > maisVelho) {
				maisVelho = pessoas.get(i).getIdade();
				indice = i;
			}
		}
		System.out.println("\nPessoa mais velha: " + pessoas.get(indice).getNome());
		
		
		//excluindo da lista os menores de 18
		int maisNovo = 18;
		for (int i = 0; i < pessoas.size(); i++) {
			if (pessoas.get(i).getIdade() <= maisNovo) {
				pessoas.remove(i);
			}
		}
		
		System.out.println("\nPessoas na lista após remover os menores de 18 anos:");
		for (int i = 0; i < pessoas.size(); i++) {
			pessoas.get(i).mostrar();
		}
		
		//Consulte se o objeto Jessica existe na lista e exiba a sua idade
		System.out.println(pessoas.contains(p4));
		System.out.println(p4.getIdade());
		
		
		
		
	}

}
