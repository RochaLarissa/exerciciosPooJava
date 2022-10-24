package Exercicio3;

import java.util.List;

public class Mago extends Personagem{
	
	private List<String> Magia;

	public Mago(String Nome, int Vida, int Mana, float Xp, int Inteligencia, int Forca, int Level, List<String> Magia) {
		super(Nome, Vida, Mana, Xp, Inteligencia, Forca, Level);
		this.Magia = Magia;
	}
	
	

	public List<String> getMagia() {
		return Magia;
	}



	public void setMagia(List<String> magia) {
		Magia = magia;
	}



	@Override
	public void lvlUp() {
		setVida(getVida() + 2 );
		setMana(getMana() + 2 );
		setXp(getXp() + 1);
		setInteligencia(getInteligencia() + 2);
		setForca(getForca() + 1);
		setLevel(getLevel() + 1);
	}

	@Override
	public int attack() {
		int ataque = 0;
		int sorteio = (int) Math.random() * 301;		
		ataque = (getInteligencia() * getLevel()) + sorteio;
		System.out.println("Ataque: " + ataque);
		return ataque;
		
	}
	
	public void aprenderMagia(String magia) {
		Magia.add(magia);
	}
	
	public void mostrar () {
		System.out.println(getNome() + ", " + getVida() + ", " + getMana() + ", " + getXp() + ", " + getInteligencia() + ", " +
				getForca() + ", " + getLevel() + ", " + getMagia());
	}

}
