import java.util.Scanner;

public class Exercicio03 {
    public static boolean ehPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        for (int divisor = 2; divisor <= numero / divisor; divisor++) {
            if (numero % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    public static int contarPrimos(int[] v) {
        int quantidade = 0;
        for (int i = 0; i < v.length; i++) {
            if (ehPrimo(v[i])) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static void exibirPrimos(int[] v) {
        for (int i = 0; i < v.length; i++) {
            if (ehPrimo(v[i])) {
                System.out.println(v[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[8];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o numero " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }
        exibirPrimos(numeros);
        System.out.println("Quantidade de primos: " + contarPrimos(numeros));
        entrada.close();
    }
}
