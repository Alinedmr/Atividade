package empresa;

public class Funcionario {

    String nome;
    String cpf;
    double salarioBase;
    int horasTrabalhadas;
    int escolha;
    
    public Funcionario(String nome, String cpf, double salarioBase, int horasTrabalhadas) {
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBase = salarioBase;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public void registrarHoras(int horas) {
        this.horasTrabalhadas += horas;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
}
