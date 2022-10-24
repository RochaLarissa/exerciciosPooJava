package Exercicio3;

import java.util.List;

public class Guerreiro extends Personagem {
	
	private List<String> Habilidade;

	public Guerreiro(String Nome, int Vida, int Mana, float Xp, int Inteligencia, int Forca, int Level, List<String> Habilidade) {
		super(Nome, Vida, Mana, Xp, Inteligencia, Forca, Level);
		this.Habilidade = Habilidade;
	}
	
	

	public List<String> getHabilidade() {
		return Habilidade;
	}



	public void setHabilidade(List<String> habilidade) {
		Habilidade = habilidade;
	}



	@Override
	public void lvlUp() {
		setVida(getVida() + 2 );
		setMana(getMana() + 1 );
		setXp(getXp() + 1);
		setInteligencia(getInteligencia() + 1);
		setForca(getForca() + 2);
		setLevel(getLevel() + 1);
	}

	@Override
	public int attack() {
		int ataque = 0;
		int sorteio = (int) Math.random() * 301;		
		ataque = (getForca() * getLevel()) + sorteio;
		System.out.println("Ataque: " + ataque);
		return ataque;
	}
	
	public void aprenderHabilidade(String habilidade) {
		Habilidade.add(habilidade);
	}
	
	public void mostrar () {
		System.out.println(getNome() + ", " + getVida() + ", " + getMana() + ", " + getXp() + ", " + getInteligencia() + ", " +
				getForca() + ", " + getLevel() + ", " + getHabilidade());
	}

}
