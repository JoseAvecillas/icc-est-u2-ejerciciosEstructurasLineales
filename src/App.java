import java.util.Stack;

import utils.QueuePalindrome;
import utils.SignValidator;
import utils.StackSorter;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        runSingValidator();
        runStackSorter();
        runQueuePalindrome();
    }

    private static void runSingValidator() {
        SignValidator signValidator = new SignValidator();
        String cadena1 = "{[()]}"; // VALIDO
        String cadena2 = "{[(])}"; // NO VALIDO

        System.out.println("Cadena: " + cadena1 + " es valida? " + signValidator.isValid(cadena1));
        System.out.println("Cadena: " + cadena2 + " es valida? " + signValidator.isValid(cadena2));
    }

    private static void runStackSorter() {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(1);
        stack.push(4);
        stack.push(2);
        StackSorter sorter = new StackSorter();
        sorter.sort(stack);
        System.out.println("Stack ordenado (tope primero):");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

    private static void runQueuePalindrome() {
        QueuePalindrome qp = new QueuePalindrome();
        String[] pruebas = { "ana", "radar", "java" };
        for (String palabra : pruebas) {
            System.out.println(
                "Cadena: \"" + palabra + "\" es palíndromo? " + qp.isPalindrome(palabra)
            );
        }
    }
}
