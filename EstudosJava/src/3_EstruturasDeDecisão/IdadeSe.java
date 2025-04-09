import java.util.Scanner;

public class IdadeSe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        if (idade > 17 && idade < 60) {
            System.out.println("Adulto");
        } else if (idade <= 17) {
            System.out.println("Menor de idade");
        } else { // Para idade >= 60
            System.out.println("Idoso");
        }

        scanner.close();
    }
}