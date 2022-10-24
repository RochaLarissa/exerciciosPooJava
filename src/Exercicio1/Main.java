package Exercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		//Exercicio1
		System.out.println("Vamos criar um carro? Informe: ");
		System.out.print("Marca: ");
		String marca = s.next();
		System.out.print("Modelo: ");
		String modelo = s.next();
		System.out.print("Placa: ");
		String placa = s.next();
		System.out.print("Cor: ");
		String cor = s.next();
		System.out.print("Kilometragem no formato '0000,00': ");
		float km = s.nextFloat();
		System.out.print("Esta ligado? Responda 'true' ou 'false': ");
		boolean isLigado = s.nextBoolean();
		System.out.print("Tem quantos litros de combustivel: ");
		int litrosCombustivel = s.nextInt();
		System.out.print("Esta a que velocidade? ");
		int velocidade = s.nextInt();
		System.out.print("Preco: ");
		double preço = s.nextDouble();
		
		Veiculo v1 = new Veiculo (marca, modelo, placa, cor, km, isLigado, litrosCombustivel, velocidade, preço);
		System.out.println("\nCarro criado com sucesso!\n");
		
		v1.mostrar();
		
		//testando acelerar
		System.out.println("\nAcelerando!!!");
		v1.acelerar();
				
		//testando abastecer
		System.out.println("\nHora de abastecer. Deseja abastecer quantos litros? ");
		int combustivel = s.nextInt();
		v1.abastecer(combustivel);
				
		//testando frear
		System.out.println("\nFreando!!!");
		v1.frear();
		
		//testando pintar
		System.out.println("\nVamos dar uma repaginada? De que cor deseja pintar o carro?");
		String newCor = s.next();
		v1.pintar(newCor);
		
		//testando ligar
		System.out.println("\nLigando!!!");
		v1.ligar();
		
		//testando desligar
		System.out.println("\nDesligando!!!");
		v1.desligar();

		v1.mostrar();
		
		s.close();
	}

}
