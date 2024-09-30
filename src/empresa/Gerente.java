package empresa;

public class Gerente extends FuncionarioRegular {

	double salarioFinal;
	
	public double salarioFinal() {
		return salarioBase * 1.15 + (horasTrabalhadas * 30);
	}
	
	public Gerente(String nome, String cpf, double salarioBase, int horasTrabalhadas) {
        super(nome, cpf, salarioBase, horasTrabalhadas);
    } 
}
