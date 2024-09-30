package empresa;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner scanf = new Scanner(System.in);
		
		System.out.println("Qual funcionário você quer cadastrar: ");
		System.out.println("1- Funcionário Regular");
		System.out.println("2- Gerente");
		System.out.println("3- Estagiário");
		System.out.println(" ");
		int escolha = scanf.nextInt();
		scanf.nextLine();
		
		switch (escolha) {
		
		case 1:
			System.out.println("Digite o nome do funcionário:");
			String nome = scanf.nextLine();
			System.out.println("Digite o cpf do funcionário:");
			String cpf = scanf.nextLine();
			System.out.println("Digite o salário base do funcionário:");
			double salarioBase = scanf.nextDouble();
			System.out.println("Digite quantas horas trabalhadas:");
			int horasTrabalhadas = scanf.nextInt();
			System.out.println(" ");
			System.out.println("Nome: " + nome);
			System.out.println("CPF: " + cpf);
			System.out.println("Salário: " + salarioBase);
			System.out.println("Horas trabalhadas: " + horasTrabalhadas);
		
			FuncionarioRegular funcionario = new FuncionarioRegular(nome, cpf, salarioBase, horasTrabalhadas);
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("CPF: " + funcionario.getCpf());
            System.out.println("Salário: " + funcionario.getSalarioBase());
            System.out.println("Horas trabalhadas: " + funcionario.getHorasTrabalhadas());
            System.out.println("Salário Final: " + funcionario.salarioFinal());
            break;

		}
		
		switch (escolha) {
		
		case 2:
			System.out.println("Digite o nome do gerente:");
			String nome = scanf.nextLine();
			System.out.println("Digite o cpf do gerente:");
			String cpf = scanf.nextLine();
			System.out.println("Digite o salário base do gerente:");
			double salarioBase = scanf.nextDouble();
			System.out.println("Digite quantas horas trabalhadas:");
			int horasTrabalhadas = scanf.nextInt();
			System.out.println(" ");
			System.out.println("Nome: " + nome);
			System.out.println("CPF: " + cpf);
			System.out.println("Salário: " + salarioBase);
			System.out.println("Horas trabalhadas: " + horasTrabalhadas);
		
			Gerente gerente = new Gerente(nome, cpf, salarioBase, horasTrabalhadas);
            System.out.println("Nome: " + gerente.getNome());
            System.out.println("CPF: " + gerente.getCpf());
            System.out.println("Salário: " + gerente.getSalarioBase());
            System.out.println("Horas trabalhadas: " + gerente.getHorasTrabalhadas());
            System.out.println("Salário Final: " + gerente.salarioFinal());
            break;

		}
		
		switch (escolha) {
		
		case 3:
			System.out.println("Digite o nome do estagiário:");
			String nome = scanf.nextLine();
			System.out.println("Digite o cpf do estagiário:");
			String cpf = scanf.nextLine();
			System.out.println("Digite o salário base do estagiário:");
			double salarioBase = scanf.nextDouble();
			System.out.println("Digite quantas horas trabalhadas:");
			int horasTrabalhadas = scanf.nextInt();
			System.out.println(" ");
			System.out.println("Nome: " + nome);
			System.out.println("CPF: " + cpf);
			System.out.println("Salário: " + salarioBase);
			System.out.println("Horas trabalhadas: " + horasTrabalhadas);
		
			Estagiario estagiario= new Estagiario(nome, cpf, salarioBase, horasTrabalhadas);
            System.out.println("Nome: " + estagiario.getNome());
            System.out.println("CPF: " + estagiario.getCpf());
            System.out.println("Salário: " + estagiario.getSalarioBase());
            System.out.println("Horas trabalhadas: " + estagiario.getHorasTrabalhadas());
            System.out.println("Salário Final: " + estagiario.salarioFinal());
            break;

		}
	}
}

