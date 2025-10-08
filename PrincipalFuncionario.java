package Polimorfismo;

public class PrincipalFuncionario {

	public static void main(String[] args) {
		
		Horista horista = new Horista(13,"João","(15) 1111-1111",21,"Rua do João");
		System.out.println(horista.calcularSalario(15, 220));
		
		Jornada jornada = new Jornada(14,"Victor","(15) 2222-2222",22,"Rua do Victor");
		System.out.println(jornada.calcularSalario(20, 150));

		ConsultorPj consultorPj = new ConsultorPj(15,"Hugo","(15) 3333-3333",23,"Rua do Hugo");
		System.out.println(consultorPj.calcularSalario(2000, 3));

	}

}
