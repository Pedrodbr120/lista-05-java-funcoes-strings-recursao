import java.util.Scanner;

public class Exercicio07 {
    public static String gerarIniciais(String nomeCompleto) {
        String[] partes = nomeCompleto.trim().split(" ");
        String iniciais = "";
        for (int i = 0; i < partes.length; i++) {
            if (partes[i].length() > 0) {
                iniciais = iniciais + partes[i].substring(0, 1).toUpperCase() + ".";
            }
        }
        return iniciais;
    }

    public static void exibirChamada(String[] nomes) {
        for (int i = 0; i < nomes.length; i++) {
            System.out.println((i + 1) + ". " + nomes[i] + " (" + gerarIniciais(nomes[i]) + ")");
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] nomes = new String[4];
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Nome completo do aluno " + (i + 1) + ": ");
            nomes[i] = entrada.nextLine();
        }
        exibirChamada(nomes);
        entrada.close();
    }
}
