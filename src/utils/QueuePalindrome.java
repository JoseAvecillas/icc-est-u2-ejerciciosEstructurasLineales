package utils;

import java.util.LinkedList;
import java.util.Queue;

public class QueuePalindrome {
    public boolean isPalindrome(String text) {

        Queue<Character> original = new LinkedList<>();
        Queue<Character> invertida = new LinkedList<>();
        Queue<Character> auxiliar = new LinkedList<>();

        for (char c : text.toCharArray()) {
            original.add(c);
            auxiliar.add(c);
        }

        while (!auxiliar.isEmpty()) {
            int size = auxiliar.size();
            for (int i = 0; i < size - 1; i++) {
                auxiliar.add(auxiliar.remove());
            }
            invertida.add(auxiliar.remove());
        }

        while (!original.isEmpty()) {
            if (!original.remove().equals(invertida.remove())) {
                return false;
            }
        }

        return true;
    }
}