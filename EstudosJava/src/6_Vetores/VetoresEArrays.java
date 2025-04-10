import java.util.Scanner;

public class VetoresEArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[5];

        for (int contadorLoop = 0; contadorLoop < 5; contadorLoop++) {
            System.out.print("Digite o nome do aluno(a) número " + (contadorLoop + 1) + " de 5: ");
            nomes[contadorLoop] = scanner.nextLine(); // Lê o nome do aluno e armazena no vetor
        }

        System.out.println("\nLista de alunos:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Aluno " + (i + 1) + ": " + nomes[i]);
        }

        scanner.close();
    }
}
