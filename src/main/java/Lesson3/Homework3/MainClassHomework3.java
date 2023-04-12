package Lesson3.Homework3;
//1. Пусть дан произвольный список целых чисел, удалить из него четные числа (в языке уже есть что-то готовое для этого)

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MainClassHomework3 {
    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        List<Integer> list = new ArrayList<>();
        list.add(0, 5);
        list.add(1, 18);
        list.add(2, 56);
        list.add(3, 67);
        list.add(4, 20);
        list.add(5, 30);
        {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) % 2 == 0) {
                    list.remove(list.get(i));
                    i--;
                }


            }
        }
        System.out.println(list);
    }
}
