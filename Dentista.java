package Polimorfismo;

public class Dentista extends ProfissionalSaude{
	private String cro;
	
	public Dentista(String nome, String especialidade, int valorConsulta, String cro) {
		super(nome, especialidade, valorConsulta);
		this.cro = cro;
	}
	
	public String getCro() {
		return cro;
	}
	
	public void setCro(String cro) {
		this.cro = cro;
	}
	
	@Override
	public void agendarConsulta() {
		System.out.println("Consulta agendada para dia 30-3-2024");
	}
}
