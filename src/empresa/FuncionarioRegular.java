package empresa;

public class FuncionarioRegular extends Funcionario {

	double salarioFinal;
	
	public double salarioFinal() {
		return(horasTrabalhadas * 20) + salarioBase;
	}
	
		public FuncionarioRegular(String nome, String cpf, double salarioBase, int horasTrabalhadas) {
			super(nome, cpf, salarioBase, horasTrabalhadas);
		}
}
