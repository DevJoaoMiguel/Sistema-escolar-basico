import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {
    private String matricula;
    private String serie;
    private String classe;
    private List<Double> notas = new ArrayList<>();
    private int diasPresentes;
    private int diasFaltas;


    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public int getDiasPresentes() {
        return diasPresentes;
    }

    public void setDiasPresentes(int diasPresentes) {
        this.diasPresentes = diasPresentes;
    }

    public int getDiasFaltas() {
        return diasFaltas;
    }

    public void setDiasFaltas(int diasFaltas) {
        this.diasFaltas = diasFaltas;
    }


    public void adicionarNota(double nota) {
        if (nota >= 0 && nota <= 10) {
            notas.add(nota);
        } else {
            System.out.println("Nota inválida! Deve estar entre 0 e 10.");
        }
    }

    @Override
    public String apresentar() {
        return super.apresentar() +
                ", Matrícula: " + matricula +
                ", Série: " + serie +
                ", Classe: " + classe +
                ", Notas: " + notas +
                ", Presenças: " + diasPresentes +
                ", Faltas: " + diasFaltas;
    }
}
