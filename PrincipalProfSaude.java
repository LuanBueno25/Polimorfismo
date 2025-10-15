package Polimorfismo;

public class PrincipalProfSaude {

	public static void main(String[] args) {
		Medico medico = new Medico("Luan", "Pediatra", 4500, "01");
		medico.agendarConsulta();
		System.out.println("Você será atendido(a) pelo médico: " + medico.getNome());
		System.out.println("O Dr. é formado como : " + medico.getEspecialidade());
		System.out.println("O valor desse atendimento será de R$:" + medico.getValorConsulta());
		System.out.println("A identificação do Dr é : " + medico.getCrm());
		
		System.out.println("\n ----------------");
		
		Dentista dentista = new Dentista("Luan", "Dentista", 3000, "02");
		dentista.agendarConsulta();
		System.out.println("Você será atendido(a) pelo dentista: " + dentista.getNome());
		System.out.println("O Dr. é formado como : " + dentista.getEspecialidade());
		System.out.println("O valor desse atendimento será de R$:" + dentista.getValorConsulta());
		System.out.println("A identificação do Dr é : " + dentista.getCro());
		
		System.out.println("\n ----------------");
		
		Fisioterapeuta fisioterapeuta = new Fisioterapeuta("Luan", "Fisioterapeuta", 5000, "03");
		fisioterapeuta.agendarConsulta();
		System.out.println("Você será atendido(a) pelo fisioterapeuta: " + fisioterapeuta.getNome());
		System.out.println("O Dr. é formado como : " + fisioterapeuta.getEspecialidade());
		System.out.println("O valor desse atendimento será de R$:" + fisioterapeuta.getValorConsulta());
		System.out.println("A identificação do Dr é : " + fisioterapeuta.getCrefito());
	}

}
