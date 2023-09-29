package faculdade;

import java.util.Scanner;

public class Assistente {

    private String nome;
    private String setor;
    private String atribuicao;

    public Assistente(String nome, String setor, String atribuicao) {
        this.nome = nome;
        this.setor = setor;
        this.atribuicao = atribuicao;
    }

    public void imprimirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Setor: " + setor);
        System.out.println("Atribuição: " + atribuicao);
    }

    public static Assistente criarNovoAssistenteViaConsole() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do assistente:");
        String nome = scanner.nextLine();

        System.out.println("Digite o setor do assistente:");
        String setor = scanner.nextLine();

        System.out.println("Digite a atribuição do assistente:");
        String atribuicao = scanner.nextLine();

        return new Assistente(nome, setor, atribuicao);
    }
}
