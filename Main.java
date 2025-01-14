import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Gerenciamento de Pessoas na Escola");
        System.out.println("Qual tipo de pessoa deseja cadastrar?");
        System.out.println("1. Aluno");
        System.out.println("2. Professor");
        System.out.println("3. Funcionário");

        int opcao = scanner.nextInt();
        scanner.nextLine();

        Pessoa pessoa = null;

        switch (opcao) {
            case 1:

                Aluno aluno = new Aluno();
                System.out.println("Cadastro de Aluno");
                System.out.print("Nome: ");
                aluno.setNome(scanner.nextLine());

                System.out.print("Idade: ");
                aluno.setIdade(scanner.nextInt());
                scanner.nextLine(); // Consumir a quebra de linha

                System.out.print("Endereço: ");
                aluno.setEndereco(scanner.nextLine());

                System.out.print("Matrícula: ");
                aluno.setMatricula(scanner.nextLine());

                System.out.print("Série: ");
                aluno.setSerie(scanner.nextLine());

                System.out.print("Classe: ");
                aluno.setClasse(scanner.nextLine());

                // Adicionar Notas
                System.out.print("Quantas notas deseja adicionar para o aluno? ");
                int numNotas = scanner.nextInt();
                for (int j = 0; j < numNotas; j++) {
                    System.out.print("Digite a nota " + (j + 1) + ": ");
                    aluno.adicionarNota(scanner.nextDouble());
                }
                scanner.nextLine();



                System.out.print("Quantos dias de presença o aluno teve? ");
                aluno.setDiasPresentes(scanner.nextInt());

                System.out.print("Quantos dias de falta o aluno teve? ");
                aluno.setDiasFaltas(scanner.nextInt());
                scanner.nextLine();

                pessoa = aluno;
                break;

            case 2:

                Professor professor = new Professor();
                System.out.println("Cadastro de Professor");
                System.out.print("Nome: ");
                professor.setNome(scanner.nextLine());

                System.out.print("Idade: ");
                professor.setIdade(scanner.nextInt());
                scanner.nextLine(); // Consumir a quebra de linha

                System.out.print("Endereço: ");
                professor.setEndereco(scanner.nextLine());

                System.out.print("Matéria: ");
                professor.setMateria(scanner.nextLine());

                System.out.print("Titulação: ");
                professor.setTitulacao(scanner.nextLine());

                // Frequência
                System.out.print("Quantos dias de presença o professor teve? ");
                professor.setDiasPresentes(scanner.nextInt());

                System.out.print("Quantos dias de falta o professor teve? ");
                professor.setDiasFaltas(scanner.nextInt());
                scanner.nextLine();

                pessoa = professor;
                break;

            case 3:

                Funcionario funcionario = new Funcionario();
                System.out.println("Cadastro de Funcionário");
                System.out.print("Nome: ");
                funcionario.setNome(scanner.nextLine());

                System.out.print("Idade: ");
                funcionario.setIdade(scanner.nextInt());
                scanner.nextLine(); // Consumir a quebra de linha

                System.out.print("Endereço: ");
                funcionario.setEndereco(scanner.nextLine());

                System.out.print("Cargo: ");
                funcionario.setCargo(scanner.nextLine());

                System.out.print("Setor: ");
                funcionario.setSetor(scanner.nextLine());

                System.out.print("Valor por Hora (R$): ");
                funcionario.setValorHora(scanner.nextDouble());

                funcionario.calcularSalario();

                pessoa = funcionario;
                break;

            default:
                System.out.println("Opção inválida!");
                break;
        }

        if (pessoa != null) {
            System.out.println("\nDados cadastrados com sucesso!");
            System.out.println(pessoa.apresentar());
        }

        scanner.close();
    }
}
