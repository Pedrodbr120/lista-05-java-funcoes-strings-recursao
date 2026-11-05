import java.util.Scanner;

public class Exercicio08 {
    public static String maiorPalavra(String[] palavras) {
        String maior = "";
        for (int i = 0; i < palavras.length; i++) {
            if (palavras[i].length() > maior.length()) {
                maior = palavras[i];
            }
        }
        return maior;
    }

    public static void exibirPalavras(String[] palavras) {
        for (int i = 0; i < palavras.length; i++) {
            System.out.println((i + 1) + ". " + palavras[i]);
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite uma frase com um espaco entre as palavras: ");
        String frase = entrada.nextLine();
        String[] palavras = frase.trim().split(" ");
        exibirPalavras(palavras);
        System.out.println("Total de palavras: " + palavras.length);
        System.out.println("Maior palavra: " + maiorPalavra(palavras));
        entrada.close();
    }
}
