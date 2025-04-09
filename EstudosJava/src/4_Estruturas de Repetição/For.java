import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int produto = 1;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Escreva um número:");
            int num = scanner.nextInt();
            produto *= num;
        }
        System.out.println("O resultado da multiplacação foi: " + produto);
        System.out.println("Fim do programa!");

        scanner.close();
    }
}
