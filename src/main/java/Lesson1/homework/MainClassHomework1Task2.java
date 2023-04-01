package Lesson1.homework;

import java.util.Arrays;

public class MainClassHomework1Task2 {
    public static void main(String[] args) {
        int[] array = {3, 2, 2, 3};
        int val = 3;
        int[] resArr = moveElementsToEnd(array, val);
        System.out.println(Arrays.toString(resArr));
    }

    private static int[]
    moveElementsToEnd(int[] arr, int value) {
        int leftVal = 0;
        int rightVal = arr.length - 1;
        int item;
        while (leftVal < rightVal) {
            if (arr[rightVal] == value) {
                rightVal--;
            }
            if (arr[leftVal] == value) {
                item = arr[leftVal];
                arr[leftVal] = arr[rightVal];
                arr[rightVal] = item;
            }
            leftVal++;
        }
        return arr;
    }
}










/*2. Дан массив  = [3,2,2,3] и число val = 3.
        Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
        Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему. */



