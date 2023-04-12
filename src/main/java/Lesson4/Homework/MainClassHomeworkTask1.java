package Lesson4.Homework;

import java.sql.Array;
import java.sql.ClientInfoStatus;
import java.sql.SQLOutput;
import java.util.*;

import static Lesson3.Homework3.MainClassHomework3.task1;

/*1. Реализовать консольное приложение, которое:
        Принимает от пользователя и “запоминает” строки.
        Если введено print, выводит строки так, чтобы последняя введенная была первой в списке,
        а первая - последней.
        Если введено revert, удаляет предыдущую введенную строку из памяти.*/
public class MainClassHomeworkTask1 {
    public static void main(String[] args) {
        task1();
    }

    private static void task1() {
        List<String> list = new ArrayList<>();
        {

            Scanner scanner = new Scanner((System.in));
            while (true) {
                System.out.println("Введите строку: ");
                String s = scanner.nextLine();
                if ("print".equals(s)) {
                    for (int i = list.size() - 1; i >= 0; i--) {
                        System.out.println(list.get(i));
                    }
                }else if ("del".equals(s)) {
                        list.remove(list.size() - 1);
                    } else if ("exit".equals(s)) {
                        System.exit(0);
                    } else {
                    list.add(s);
                }
                }


            }
        }
    }








