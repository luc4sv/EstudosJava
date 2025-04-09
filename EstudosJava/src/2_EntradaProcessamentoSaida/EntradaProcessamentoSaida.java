import java.util.Scanner;

public class EntradaProcessamentoSaida {
    public static void main(String[] args) {

        float num1;
        float num2;
        float num3;
              float resultado;
              float resultadoMedia;

        System.out.println("Digite o primeiro numero: ");
        num1 = Integer.parseInt(System.console().readLine());
        System.out.println("Digite o segundo numero: ");
        num2 = Integer.parseInt(System.console().readLine());
        System.out.println("Digite o terceiro numero: ");
        num3 = Integer.parseInt(System.console().readLine());

        resultado = num1 + num2 + num3;
        resultadoMedia = resultado/3;
        System.out.println("Os números digitados foram: " + num1 + "," + num2 + "," + num3 + " ");
        System.out.println("--------------------------------");
        System.out.println("Resultado da soma dos 3 números foram: " + resultado);
        System.out.println("--------------------------------");
        System.out.println("Resultado da média dos números foram: " + resultadoMedia + " ");
    }
}
