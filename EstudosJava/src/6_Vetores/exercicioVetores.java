import java.util.Scanner;

public class exercicioVetores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nomes = new String[5]; // Vetor para armazenar os nomes
        double[] notas = new double[5]; // Vetor para armazenar as notas
        double soma = 0; // Variável para somar as notas

        // Entrada de dados
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();

            System.out.print("Digite a nota do aluno " + nomes[i] + ": ");
            notas[i] = scanner.nextDouble();
            scanner.nextLine(); // Consumir a quebra de linha

            soma += notas[i]; // Acumular a soma das notas
        }

        // Cálculo da média
        double media = soma / 5;

        // Exibição dos dados
        System.out.println("\nNotas dos alunos:");
        for (int i = 0; i < 5; i++) {
            System.out.println(nomes[i] + " - Nota: " + notas[i]);
        }

        System.out.println("\nMédia da turma: " + media);

        scanner.close();
    }
}