import java.util.Scanner;

public class MultiplicacaoEmWhile {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int produto = 1;
        int contador = 0;

        do {
            System.out.println("Escreva 5 numeros: ");
            int num = leia.nextInt();
            produto *= num;
            contador++;
        }
          while (contador < 5);

          System.out.println("O resultado foi: " + produto);

          leia.close();
    }
}
