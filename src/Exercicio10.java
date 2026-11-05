import java.util.Scanner;

public class Exercicio10 {
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void preencher(int[] v) {
        for (int i = 0; i < v.length; i++) {
            v[i] = fibonacci(i);
        }
    }

    public static int somar(int[] v) {
        int soma = 0;
        for (int i = 0; i < v.length; i++) {
            soma = soma + v[i];
        }
        return soma;
    }

    public static void exibir(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite N de 1 a 30: ");
        int n = entrada.nextInt();
        if (n < 1 || n > 30) {
            System.out.println("Quantidade invalida");
            entrada.close();
            return;
        }
        int[] numeros = new int[n];
        preencher(numeros);
        exibir(numeros);
        System.out.println("Soma: " + somar(numeros));
        entrada.close();
    }
}
