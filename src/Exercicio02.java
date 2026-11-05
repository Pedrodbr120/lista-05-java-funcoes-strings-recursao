import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
    public static double calcularImc(double peso, double altura) {
        return peso / (altura * altura);
    }

    public static String classificarImc(double imc) {
        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc < 25) {
            return "Peso normal";
        } else if (imc < 30) {
            return "Sobrepeso";
        } else {
            return "Obesidade";
        }
    }

    public static void exibirRelatorio(double[] pesos, double[] alturas) {
        for (int i = 0; i < pesos.length; i++) {
            double imc = calcularImc(pesos[i], alturas[i]);
            System.out.printf("Pessoa %d: IMC %.2f - %s%n", i + 1, imc, classificarImc(imc));
        }
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.forLanguageTag("pt-BR"));
        Scanner entrada = new Scanner(System.in);
        double[] pesos = new double[4];
        double[] alturas = new double[4];
        for (int i = 0; i < pesos.length; i++) {
            System.out.print("Peso da pessoa " + (i + 1) + " em kg: ");
            pesos[i] = entrada.nextDouble();
            System.out.print("Altura em metros: ");
            alturas[i] = entrada.nextDouble();
        }
        exibirRelatorio(pesos, alturas);
        entrada.close();
    }
}
