import java.util.Scanner;

public class questao02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o valor da temperatura: ");
        double valor = sc.nextDouble();
        
        System.out.print("Digite a escala da temperatura (C, F ou K): ");
        String escala = sc.next().toUpperCase();
        
        double celsius = 0, fahrenheit = 0, kelvin = 0;
        
        switch (escala) {
            case "C":
                celsius = valor;
                fahrenheit = (celsius * 1.8) + 32;
                kelvin = celsius + 273.15;
                break;
            case "F":
                fahrenheit = valor;
                celsius = (fahrenheit - 32) / 1.8;
                kelvin = celsius + 273.15;
                break;
            case "K":
                kelvin = valor;
                celsius = kelvin - 273.15;
                fahrenheit = (celsius * 1.8) + 32;
                break;
            default:
                System.out.println("Escala inválida.");
                System.exit(0);
        }
        
        System.out.printf("%.2f C%n", celsius);
        System.out.printf("%.2f F%n", fahrenheit);
        System.out.printf("%.2f K%n", kelvin);
        
        sc.close();
    }
}

