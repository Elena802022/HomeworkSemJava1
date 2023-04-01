package lesson2.homework;

import java.util.Scanner;

public class MainClassHomework2 {
    public static void main(String[] args) {
        //1. Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом (возвращает boolean значение).
        Task1();

    }

    private static boolean Task1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        int num = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int j = sb.length() - 1;
        while (i <= j)
            if (sb.charAt(i) == sb.charAt(j)) {
                i++;
                j--;
            } else {
                return true;
            }
        return false;
    }

}











