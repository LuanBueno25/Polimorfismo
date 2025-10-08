package Polimorfismo;

public class Horista extends Funcionario {

	public Horista(int id, String nome, String telefone, int matricula, String endereco) {
		super(id, nome, telefone, matricula, endereco);
	}

	@Override
	public double calcularSalario(double valorHora, double desconto) {
		double horaTrabalhada = 132;
		double salarioBruto = (horaTrabalhada * valorHora);
		return salarioBruto - desconto;

	}
}