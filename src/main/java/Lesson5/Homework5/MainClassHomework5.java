package Lesson5.Homework5;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/*1. Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может
        иметь несколько телефонов.*/
public class MainClassHomework5 {
    public static void addNumber(String key, int value, Map<String, ArrayList<Integer>> map){
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }
    }
    public static void printBook(Map<String, ArrayList<Integer>> map){
        for (var item : map.entrySet()) {
            String phones = "";
            for(int el: item.getValue()){
                phones = phones + el + ", ";
            }
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> bookPhone = new HashMap<>();
        addNumber("Сидоров", 456789, bookPhone);
        addNumber("Иванов", 46378290, bookPhone);
        addNumber("Петров", 465743839, bookPhone);
        addNumber("Сидоров", 46373847, bookPhone);
        addNumber("Иванов", 45647483, bookPhone);
        addNumber("Иванов", 46578493, bookPhone);
        printBook(bookPhone);
    }
}
