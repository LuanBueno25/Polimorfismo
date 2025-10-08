package Polimorfismo;

public class ConsultorPj extends Funcionario {

	public ConsultorPj(int id, String nome, String telefone, int matricula, String endereco) {
		super(id, nome, telefone, matricula, endereco);
	}

	public double calcularSalario(double valorContrato, double desconto) {
		double numContratos = 3;
		double salarioBruto = (valorContrato*numContratos);
		return salarioBruto - desconto;
	}
}
