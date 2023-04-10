import java.util.Scanner;

public class questao01 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double num1, num2, resultado;
        int operacao;

        System.out.print("Digite o primeiro número: ");
        num1 = leitor.nextDouble();

        System.out.print("Digite o segundo número: ");
        num2 = leitor.nextDouble();

        System.out.println("\nEscolha a operação que deseja realizar:");
        System.out.println("(1) Adição");
        System.out.println("(2) Subtração");
        System.out.println("(3) Multiplicação");
        System.out.println("(4) Divisão");
        System.out.println("(5) Potenciação");
        System.out.println("(6) Raiz Quadrada");
        System.out.println("(7) Raiz Cúbica");
        System.out.println("(8) Todas as operações acima");

        operacao = leitor.nextInt();

        if (operacao == 1) {
            resultado = num1 + num2;
            System.out.println("\nO resultado da adição é: " + resultado);
        } else if (operacao == 2) {
            resultado = num1 - num2;
            System.out.println("\nO resultado da subtração é: " + resultado);
        } else if (operacao == 3) {
            resultado = num1 * num2;
            System.out.println("\nO resultado da multiplicação é: " + resultado);
        } else if (operacao == 4) {
            resultado = num1 / num2;
            System.out.println("\nO resultado da divisão é: " + resultado);
        } else if (operacao == 5) {
            resultado = Math.pow(num1, num2);
            System.out.println("\nO resultado da potenciação é: " + resultado);
        } else if (operacao == 6) {
            resultado = Math.sqrt(num1);
            System.out.println("\nA raiz quadrada de " + num1 + " é: " + resultado);
        } else if (operacao == 7) {
            resultado = Math.cbrt(num1);
            System.out.println("\nA raiz cúbica de " + num1 + " é: " + resultado);
        } else if (operacao == 8) {
            resultado = num1 + num2;
            System.out.println("\nO resultado da adição é: " + resultado);

            resultado = num1 - num2;
            System.out.println("O resultado da subtração é: " + resultado);

            resultado = num1 * num2;
            System.out.println("O resultado da multiplicação é: " + resultado);

            resultado = num1 / num2;
            System.out.println("O resultado da divisão é: " + resultado);

            resultado = Math.pow(num1, num2);
            System.out.println("O resultado da potenciação é: " + resultado);

            resultado = Math.sqrt(num1);
            System.out.println("A raiz quadrada de " + num1 + " é: " + resultado);

            resultado = Math.cbrt(num1);
            System.out.println("A raiz cúbica de " + num1 + " é: " + resultado);
        } else {
            System.out.println("\nOperação inválida.");
        }
    }
}