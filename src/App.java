import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner console = new Scanner(System.in);

        int numeroSoma1 = 0;
        int numeroSoma2 = 0;
        int soma = 0;

        System.out.println("Digite um número: ");
        numeroSoma1 = console.nextInt();
        System.out.println("Digite outro número:");
        numeroSoma2 = console.nextInt();

        soma = numeroSoma1 + numeroSoma2;
        System.out.println("A soma destes números é: " + soma);
    }
}
