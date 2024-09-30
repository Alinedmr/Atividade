package empresa;

public class Estagiario extends FuncionarioRegular {

		double salarioFinal;
		
		public double salarioFinal() {
			return horasTrabalhadas * 15;
		}
	
		public Estagiario(String nome, String cpf, double salarioBase, int horasTrabalhadas) {
			super (nome, cpf, salarioBase, horasTrabalhadas); 
			
		}
		
}
