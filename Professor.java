public class Professor extends Pessoa {
    private String materia;
    private String titulacao;
    private int diasPresentes;
    private int diasFaltas;


    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
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

    @Override
    public String apresentar() {
        return super.apresentar() +
                ", Matéria: " + materia +
                ", Titulação: " + titulacao +
                ", Dias de Presença: " + diasPresentes +
                ", Dias de Falta: " + diasFaltas;
    }
}
