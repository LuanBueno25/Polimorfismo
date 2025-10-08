package Polimorfismo;

public class Animal {
	private String nome;
	private String sexo;
	private String raca;

	public Animal(String nome, String sexo, String reca) {
		this.nome = nome;
		this.sexo = sexo;
		this.raca = reca;
	}

	public void dormir() {
		System.out.println("Dormindo");
	}

	public void caminhar() {
		System.out.println("Caminhando");
	}

	public void correr() {
		System.out.println("Correndo");
	}

	public void emitirSom() {
		System.out.println("Emitindo som");
	}
}