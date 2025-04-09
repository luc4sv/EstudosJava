import java.util.Scanner;

public class NumMaior {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int num1;
        int num2;

        System.out.println("Escreva um numero: ");
        num1 = scanner.nextInt();
        System.out.println("Escreva outro numero: ");
        num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("O primeiro número é maior que o segundo.");
        } else if (num2 > num1) {
            System.out.println("O segundo número é maior que o primeiro.");
        }
    }
}
