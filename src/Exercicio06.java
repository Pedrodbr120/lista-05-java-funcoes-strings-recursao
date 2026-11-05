import java.util.Scanner;

public class Exercicio06 {
    public static int contarVogais(String texto) {
        texto = texto.toLowerCase();
        String vogais = "aeiouáàâãéèêíìîóòôõúùûü";
        int quantidade = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (vogais.indexOf(texto.charAt(i)) >= 0) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static void exibirContagem(String[] frases) {
        int posicaoMaior = 0;
        int maior = -1;
        for (int i = 0; i < frases.length; i++) {
            int quantidade = contarVogais(frases[i]);
            System.out.println(frases[i] + " - Vogais: " + quantidade);
            if (quantidade > maior) {
                maior = quantidade;
                posicaoMaior = i;
            }
        }
        System.out.println("Frase com mais vogais: " + frases[posicaoMaior]);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] frases = new String[3];
        for (int i = 0; i < frases.length; i++) {
            System.out.print("Digite a frase " + (i + 1) + ": ");
            frases[i] = entrada.nextLine();
        }
        exibirContagem(frases);
        entrada.close();
    }
}
