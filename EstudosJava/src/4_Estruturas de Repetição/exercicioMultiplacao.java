import java.util.Scanner;

public class exercicioMultiplacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int produto = 1;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite um número: ");
            int num = scanner.nextInt();
            produto *= num;
        }

        System.out.println("O resultado da multiplicação é: " + produto);

        scanner.close();
    }
}
