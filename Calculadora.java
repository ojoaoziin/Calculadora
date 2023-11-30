package Calculadora;
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, resultado;
        char operacao;

        System.out.println("Calculadora Simples em Java");

        System.out.print("Digite o primeiro número: ");
        num1 = scanner.nextDouble();

        System.out.print("Digite a operação (+, -, *, /): ");
        operacao = scanner.next().charAt(0);

        System.out.print("Digite o segundo número: ");
        num2 = scanner.nextDouble();

        switch (operacao) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                resultado = divideNumeros(num1, num2, scanner);
                break;
            default:
                mostraMensagemDeErro("Operação inválida.");
                return;
        }

        System.out.println("Resultado: " + resultado);
        scanner.close();
    }

    private static double divideNumeros(double num1, double num2, Scanner scanner) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            mostraMensagemDeErro("Erro: Divisão por zero não é permitida.");
            System.exit(1); // Sai do programa em caso de divisão por zero
            return 0; // Inalcançável, mas necessário para compilação
        }
    }

    private static void mostraMensagemDeErro(String mensagem) {
        System.out.println(mensagem);
    }
}
