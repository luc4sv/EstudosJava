import java.util.Scanner;

public class WhileExercicio {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int i = 1, soma = 0, num; // Inicializando as variáveis corretamente

        while (i <= 5) {
            System.out.print("Digite um número inteiro para a soma: ");
            num = leia.nextInt();
            soma = soma + num; // Acumulando a soma
            i = i + 1; // Incrementando i corretamente
        }

        System.out.println("Soma total: " + soma);

        leia.close();
    }
}