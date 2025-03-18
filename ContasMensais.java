import java.util.Scanner;

public class ContasMensais {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double[] contas = new double[10]; // Vetor para armazenar as contas
            double soma = 0;
            
            // Solicita ao usuário que insira os valores das contas
            System.out.println("Digite os valores das 10 contas mensais:");
            for (int i = 0; i < 10; i++) {
                System.out.print("Conta " + (i + 1) + ": R$ ");
                contas[i] = scanner.nextDouble(); // Armazena o valor no vetor
                soma += contas[i]; // Soma os valores
            }
            
            // Exibe o total das contas
            System.out.println("\nO total das contas mensais é: R$ " + soma);
        } // Vetor para armazenar as contas
    }
}
