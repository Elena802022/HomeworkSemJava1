package Lesson4.Homework;
/*2. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет
        “перевернутый” список.*/
import java.util.*;

import static Lesson5.MainClassLesson5.task;

public class MaimClassHomeworkTask2 {
    public static void main(String[] args) {
       creation();
    }

    private static void creation() {
        LinkedList<Integer>ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        System.out.println(ll);
        Stack<Integer> stack = new Stack<>();
        stack.addAll(ll);
        ll.clear();
        while ((!stack.empty()))
            ll.add(stack.pop());
        System.out.println(ll);



    }


}
