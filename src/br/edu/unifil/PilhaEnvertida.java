package br.edu.unifil;

import java.util.Scanner;
import java.util.Stack;

public class PilhaEnvertida {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String entrada = scanner.nextLine();

        // Função de inverter a string
        String saida = inverter(entrada);

        System.out.println("resultado: " + saida);

        scanner.close();
    }

    public static String inverter(String s) {
        Stack<Character> pilha = new Stack<>();

        for (Character caractere : s.toCharArray()) {
            pilha.push(caractere);
        }

        StringBuilder invertido = new StringBuilder();

        while (!pilha.isEmpty()) {
            invertido.append(pilha.pop());
        }

        return invertido.toString();
    }
}
