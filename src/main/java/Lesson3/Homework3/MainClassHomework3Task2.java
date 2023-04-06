package Lesson3.Homework3;

import java.util.*;

//2. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.
public class MainClassHomework3Task2 {
    public static void main(String[] args) {
        task2();
    }

    private static void task2() {
        List<Integer> list = new ArrayList<>();
        list.add(0, 37);
        list.add(1, 57);
        list.add(2, 40);
        list.add(3, 58);
        list.add(4, 20);
        list.add(5, 10);


        int sum = 0;
        int avg = 0;
        for (int i = 0; i < list.size(); i++) {

                sum = sum + list.get(i);
                avg = sum / list.size();



        }
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
        System.out.printf("Cреднее арифметическое элементов списка: %d", avg);

    }
}


