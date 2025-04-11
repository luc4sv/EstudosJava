import java.util.Scanner;

public class WhileExercicio {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int i = 1, soma = 0, num;

        while (i <= 5) {
            System.out.print("Digite um número inteiro para a soma: ");
            num = leia.nextInt();
            soma = soma + num; 
            i = i + 1;
        }

        System.out.println("Soma total: " + soma);

        leia.close();
    }
}
