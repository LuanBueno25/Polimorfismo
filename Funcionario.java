package Polimorfismo;

public class Funcionario {

	private int id;
	private String nome;
	private String telefone;
	private int matricula;
	private String endereco;

	public Funcionario(int id, String nome, String telefone, int matricula, String endereco) {
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.matricula = matricula;
		this.endereco = endereco;
	}
	
	public double calcularSalario(double salarioBruto, double desconto) {
		return salarioBruto - desconto;
	}

}
