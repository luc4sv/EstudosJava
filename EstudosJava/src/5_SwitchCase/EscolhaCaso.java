import java.util.Scanner;

public class EscolhaCaso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exibe as opções para o usuário
        System.out.println("Opções:");
        System.out.println("1 - Calcular o dobro do número");
        System.out.println("2 - Calcular o triplo do número");
        System.out.print("Escolha uma opção: ");
        int op = scanner.nextInt(); // Lê a opção escolhida

        // Solicita o número ao usuário
        System.out.print("Digite o número: ");
        double num = scanner.nextDouble(); // Lê o número
        double resultado; // Inicializa a variável de resultado

        // Estrutura switch para processar a escolha
        switch (op) {
            case 1:
                resultado = num * 2;
                break;
            case 2:
                resultado = num * 3;
                break;
            default:
                System.out.println("Opção inválida!");
                scanner.close();
                return; // Sai do programa se a opção for inválida
        }

        // Exibe o resultado
        System.out.println("Resultado: " + resultado);

        scanner.close();
    }
}
