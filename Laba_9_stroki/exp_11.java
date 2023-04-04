package Laba_9_stroki;

import java.util.Arrays;

public class exp_11 {
    public static void main(String[] args) {
        String[] strings = {"    ab12   ", "   def", "ghi   ", "jkl"};

        // Удаление пробелов в начале и конце строк
        for (int i = 0; i < strings.length; i++) {
            strings[i] = strings[i].trim();
        }

        System.out.println("Удаление пробелов в начале и конце строк: " + Arrays.toString(strings));

        // Замена цифр на символ '*'
        for (int i = 0; i < strings.length; i++) {
            strings[i] = strings[i].replaceAll("\\d", "*");
        }

        System.out.println("Замена цифр на символ '*': " + Arrays.toString(strings));

        // Замена группы пробелов на один пробел
        for (int i = 0; i < strings.length; i++) {
            strings[i] = strings[i].replaceAll("\\s+", " ");
        }

        System.out.println("Замена группы пробелов на один пробел: " + Arrays.toString(strings));
    }
}