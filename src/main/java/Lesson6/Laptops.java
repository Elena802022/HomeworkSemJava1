package Lesson6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

import static java.util.Arrays.*;

//1.Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы.
/*2.Создать множество ноутбуков (ArrayList).
       3. Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
        Например, спросить у пользователя минимальный размер оперативной памяти или конкретный цвет.
         Выводить только те ноутбуки, что соответствуют условию*/
public class Laptops {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop();
        laptop1.name = "Lenovo";
        laptop1.id = 1;
        laptop1.number = "1516";
        laptop1.processor = "intel core 3";
        laptop1.videoCard = "intel UHD";
        laptop1.display = "1920*1080px";
        laptop1.price = 10000;

        Laptop laptop2 = new Laptop();
        laptop2.name = "Asus";
        laptop2.id = 2;
        laptop2.number = "1567";
        laptop2.processor = "intel core 4";
        laptop2.videoCard = "intel USD";
        laptop2.display = "1670*1890px";
        laptop2.price = 15000;

        Laptop laptop3 = new Laptop();
        laptop3.name = "Apple";
        laptop3.id = 3;
        laptop3.number = "4657";
        laptop3.processor = "intel core 5";
        laptop3.videoCard = "intel UDR";
        laptop3.display = "2470*4690px";
        laptop3.price = 250000;

        System.out.println(laptop3);
        System.out.println(laptop2);
        System.out.println(laptop1);

        List<Laptop> laptopList = List.of(laptop1, laptop2, laptop3);
        Scanner scannerUser = new Scanner(System.in);
        System.out.println("Выберите параметр для поиска:\n1 - по названию\n2 - по процессору");
        int userChoiceSearch = scannerUser.nextInt();

        Scanner scannerRequestUserForSearch = new Scanner(System.in);
        System.out.println("Напишите интересующее название или процессор: ");
        String requestUserForSearch = scannerRequestUserForSearch.nextLine();

        if (userChoiceSearch == 1) {
            for (Laptop name : laptopList) {
                if (name.getName().equalsIgnoreCase(requestUserForSearch)) {
                    System.out.println(name.toString());
                }
            }
        } else {
            System.out.println("Ошибка.\nВыберите параметр для поиска, где:\n1 - по названию\n2 - по процессору");
        }
        scannerUser.close();


    }
}

