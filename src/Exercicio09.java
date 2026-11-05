import java.util.Scanner;

public class Exercicio09 {
    public static long potencia(int base, int expoente) {
        if (expoente == 0) {
            return 1;
        }
        return base * potencia(base, expoente - 1);
    }

    public static void exibirPotencias(int[] bases, int expoente) {
        for (int i = 0; i < bases.length; i++) {
            System.out.println(bases[i] + "^" + expoente + " = " + potencia(bases[i], expoente));
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um expoente inteiro nao negativo: ");
        int expoente = entrada.nextInt();
        if (expoente < 0) {
            System.out.println("Expoente invalido");
            entrada.close();
            return;
        }
        int[] bases = new int[5];
        for (int i = 0; i < bases.length; i++) {
            System.out.print("Digite a base " + (i + 1) + ": ");
            bases[i] = entrada.nextInt();
        }
        exibirPotencias(bases, expoente);
        entrada.close();
    }
}
