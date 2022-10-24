package Exercicio2;

import java.util.ArrayList;
import java.util.List;

public class Loja {
	
	private String nome;
	private String cnpj;
	private List <Livro> livros;
	private List <VideoGame> videoGames;
	
	public Loja (String nome, String cnpj, List <Livro> livros, List <VideoGame> videoGames) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.livros = livros;
		this.videoGames = videoGames;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(ArrayList<Livro> livros) {
		this.livros = livros;
	}

	public List<VideoGame> getVideoGames() {
		return videoGames;
	}

	public void setVideoGames(ArrayList<VideoGame> videoGames) {
		this.videoGames = videoGames;
	}
	
	public void listaLivros() {
		if (livros.isEmpty()) {
			System.out.println("A loja não tem livros no seu estoque.");
		} else {
			for (int i = 0; i < livros.size(); i++) {
				System.out.println(livros.get(i).getNome() + " ," + livros.get(i).getPreco() + " ," + 
			    		  livros.get(i).getQtd() + " ," + livros.get(i).getAutor() + " ," +  livros.get(i).getTema() +
			    		  " ," + livros.get(i).getQtdPag());
			    }
		}
	}
	
	public void listaVideoGames() {
		if (videoGames.isEmpty()) {
			System.out.println("A loja não tem video-games no seu estoque.");
		} else {
			for (int i = 0; i < videoGames.size(); i++) {
			      System.out.println(videoGames.get(i).getNome() + " ," + videoGames.get(i).getPreco() + " ," + 
			    		  videoGames.get(i).getQtd() + " ," + videoGames.get(i).getMarca() + " ," + videoGames.get(i).getModelo() +
			    		  " ," + videoGames.get(i).isUsado());
			    }
		}
	}

	public double calculaPatrimonio() {
		double preco = 0;
		for (int i = 0; i < livros.size(); i++) {
			preco = preco + (livros.get(i).getPreco() * livros.get(i).getQtd());
		}
		for (int i = 0; i < videoGames.size(); i++) {
			preco = preco + (videoGames.get(i).getPreco() * videoGames.get(i).getQtd());
		}
		System.out.println(preco);
		return preco;
	}
	
}
