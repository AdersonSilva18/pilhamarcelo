package br.edu.unifil;

import java.util.Scanner;
import java.util.Stack;

public class UndoCode {
    public static void main(String[] args) {
        Stack<String> pilha = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite um comando ou 'desfazer' para desfazer o último comando (ou 'sair' para encerrar): ");
            String comando = scanner.nextLine();

            if (comando.equalsIgnoreCase("sair")) {
                System.out.println("Cabo.");
                break;
            } else if (comando.equalsIgnoreCase("desfazer")) {
                if (!pilha.isEmpty()) {
                    String comandoDesfeito = pilha.pop();
                    System.out.println("Comando '" + comandoDesfeito + "' desfeito.");
                } else {
                    System.out.println("Nenhum comando para desfazer.");
                }
            } else {
                pilha.push(comando);
                System.out.println("Comando '" + comando + "' adicionado.");
            }
        }
        scanner.close();
    }
}
