package Lesson1.homework;

import java.util.Arrays;
import java.util.Random;

import static sun.management.MemoryUsageCompositeData.getMax;

public class MainClassHomework1 {
    public static void main(String[] args) {
        Task1MinMaxValueInArr(1000);
        //1. Задать одномерный массив и найти в нем минимальный и максимальный элементы
    }

    private static void Task1MinMaxValueInArr(int size) {
        int arr[] = new int[size];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt();

        }


        int max = 0;
        int min = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }


            if (arr[i] < min) {
                min = arr[i];
            }


        }
        System.out.println(Arrays.toString(arr));
        System.out.printf("Минимльный элемент массива: %d\n", min);
        System.out.printf("Максимальный элемент массива: %d", max);

    }
}



