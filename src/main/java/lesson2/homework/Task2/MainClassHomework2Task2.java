package lesson2.homework.Task2;

import org.w3c.dom.ls.LSOutput;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class MainClassHomework2Task2 {
    public static void main(String[] args) {
        //2. Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод, который запишет эту строку в простой текстовый файл, обработайте исключения.
        StringCreation();
    }

    private static void StringCreation() {
       String s = "TEST".repeat(100);
        System.out.println(s);

        PrintWriter pw = null;
        try {
            pw = new PrintWriter("C:\\Users\\AREK\\IdeaProjects\\java-seminar01\\src\\main\\resources\\files\\output.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        pw.print(s);
        pw.close();
    }

}

