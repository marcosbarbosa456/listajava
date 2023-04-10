import java.util.Scanner;

public class questao03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite seu nome completo: ");
        String nomeCompleto = sc.nextLine();
        
        String[] partesNome = nomeCompleto.split(" ");
        String nome = partesNome[0];
        String sobrenome = partesNome[partesNome.length - 1];
        
        if (sobrenome.equalsIgnoreCase("Wayne")) {
            System.out.println("Acesso liberado, Sr. Wayne");
        } else if (sobrenome.equalsIgnoreCase("Kent")) {
            System.out.println("Saí daí, mané!");
        } else if (nome.equalsIgnoreCase("Diana")) {
            System.out.println("Bem-vinda, Princesa de Themyscara");
        } else {
            System.out.println("Cai fora!");
        }
        
        sc.close();
    }
}
