package br.edu.unifil;

import java.util.Stack;

public class MatematicaPolonesa {

    public static void main(String[] args) {
        String matematica = "5 1 2 + 4 * + 3 -";
        Double resultado = calcular(matematica);
        System.out.println("Resultado: " + resultado);
    }

    public static double calcular(String expressao) {
        Stack<Double> pilha = new Stack<>();
        String[] argumentos = expressao.split(" ");

        for (String argumento : argumentos) {
            if (numerico(argumento)) {
                pilha.push(Double.parseDouble(argumento));
            } else {
                Double b = pilha.pop();
                Double a = pilha.pop();
                Double resultado = fazerCalculo(a, b, argumento);
                pilha.push(resultado);
            }
        }
        return pilha.pop();
    }

    private static boolean numerico(String token) {
        try {
            Double.parseDouble(token);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    private static Double fazerCalculo(Double a, Double b, String argumento) {
        switch (argumento) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
            default:
                throw new IllegalArgumentException("Operador inválido: " + argumento);
        }
    }
}
