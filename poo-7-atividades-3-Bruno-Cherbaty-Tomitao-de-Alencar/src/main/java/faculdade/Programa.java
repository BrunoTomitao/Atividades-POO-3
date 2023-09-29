package faculdade;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        System.out.println("Cadastro de Assistentes");

        List<Assistente> assistentes = new ArrayList<>();

        // Cadastre os primeiros 4 assistentes
        for (int i = 0; i < 4; i++) {
            Assistente novoAssistente = Assistente.criarNovoAssistenteViaConsole();
            assistentes.add(novoAssistente);
        }

        // Imprima os dados de todos os assistentes
        for (Assistente assistente : assistentes) {
            assistente.imprimirDados();
        }

        // Permita cadastrar mais assistentes conforme a demanda
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Deseja cadastrar mais um assistente? (s/n)");
            String resposta = scanner.nextLine().toLowerCase();
            if (resposta.equals("s")) {
                Assistente novoAssistente = Assistente.criarNovoAssistenteViaConsole();
                assistentes.add(novoAssistente);
                novoAssistente.imprimirDados();
            } else if (resposta.equals("n")) {
                break;
            }
        }
    }
}
