import java.util.ArrayList;
import java.util.Scanner;

public class TesteArrayListNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        // Adicionando 10 números informados pelo usuário
        System.out.println("Digite 10 números:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            numeros.add(numero);

            // Verifica se o número é 10, 100 ou 1000 e exibe a mensagem de bônus
            if (numero == 10 || numero == 100 || numero == 1000) {
                System.out.println("Você ganhou um bônus de R$ 50,00!");
            }
        }

        // Exibe todos os números informados
        System.out.println("\nNúmeros informados: " + numeros);
        
        scanner.close();
    }
}

