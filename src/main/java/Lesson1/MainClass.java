package Lesson1;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        exOne();
    }

    private static void exOne() {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        System.out.printf("Привет, %s%n", name);
    }
}
