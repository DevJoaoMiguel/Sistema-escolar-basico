public class Funcionario extends Pessoa {
    private String cargo;
    private String setor;
    private double valorHora;
    private double salario;


    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getSalario() {
        return salario;
    }

    public void calcularSalario() {
        this.salario = valorHora * 220;
    }

    @Override
    public String apresentar() {
        return super.apresentar() +
                ", Cargo: " + cargo +
                ", Setor: " + setor +
                ", Valor da Hora: R$" + String.format("%.2f", valorHora) +
                ", Salário: R$" + String.format("%.2f", salario);
    }
}
