package Polimorfismo;

public class Jornada extends Funcionario {

	public Jornada(int id, String nome, String telefone, int matricula, String endereco) {
		super(id, nome, telefone, matricula, endereco);
	}

	@Override
	public double calcularSalario(double valorHora, double desconto) {
		double horasSemana = 40;
		double salarioBruto = (valorHora * horasSemana * 4);
		return salarioBruto - desconto;
	}
}
