package Exercicio1;

public class Veiculo {
	
	private String marca;
	private String modelo;
	private String placa;
	private String cor;
	private float km;
	private boolean isLigado;
	private int litrosCombustivel;
	private int velocidade;
	private double preco;
	
	public Veiculo (String marca, String modelo, String placa, String cor, float km, boolean isLigado, 
			int litrosCombustivel, int velocidade, double preco) {
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
		this.cor = cor;
		this.km = km;
		this.isLigado = isLigado;
		this.litrosCombustivel = litrosCombustivel;
		this.velocidade = velocidade;
		this.preco = preco;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getKm() {
		return km;
	}

	public void setKm(float km) {
		this.km = km;
	}

	public boolean isLigado() {
		return isLigado;
	}

	public void setLigado(boolean isLigado) {
		this.isLigado = isLigado;
	}

	public int getLitrosCombustivel() {
		return litrosCombustivel;
	}

	public void setLitrosCombustivel(int litrosCombustivel) {
		this.litrosCombustivel = litrosCombustivel;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
	public void acelerar() {
		velocidade = velocidade + 20;
	}
	
	public void abastecer(int combustivel) {
		if (litrosCombustivel + combustivel <= 60) {
			litrosCombustivel = litrosCombustivel + combustivel;
		} else {
			System.out.println("O capacidade máxima do tanque é 60L");
		}
	}
	
	public void frear() {
		if (velocidade >= 20) {
			velocidade = velocidade - 20;
		} else {
			velocidade = 0;
		}
	}
	
	public void pintar(String Cor) {
		cor = Cor;
	}
	
	public void ligar() {
		if (!isLigado) {
			isLigado = true;
		}
	}
	
	public void desligar() {
		if (isLigado) {
			isLigado = false;
		}
	}
	
	public void mostrar () {
		System.out.println("\nMarca:" + marca + "| Modelo: " + modelo + "| Placa: " + placa + "| Cor: " + cor + 
				"| Kilometragem: " + km + "| Está ligado: " + isLigado + "| Tanque: " + litrosCombustivel + 
				"| Velocidade: " + velocidade + "| Preço: " + preco);
	}

}
